package com.example.jsontest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jsontest.database.Food;
import com.example.jsontest.ui.MainAdapter;
import com.example.jsontest.viewmodel.MainViewModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class JSONdbTest extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = "JSONdbTest";

    // View model and Adapter instances
    private MainViewModel mainVM;
    private MainAdapter mMainAdapter;

    // Food object array list
    private List<Food> foodData = new ArrayList<>();

    /**
     *  Main page elements
     */
    // EditTexts
    private EditText mealName, portion;
    // TextViews
    private TextView createFood, meals;
    // Buttons
    private Button submit, add;
    // Spinner
    private Spinner food;
    // Recycler Views
    @BindView(R.id.main_rv)
    private RecyclerView mealItemFoodsRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ButterKnife.bind(this);

        initRecyclerView();
        initViewModel();

    }

    private void initRecyclerView() {

        mealItemFoodsRV.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mealItemFoodsRV.setLayoutManager(layoutManager);

        mMainAdapter= new MainAdapter(foodData, this);
        mealItemFoodsRV.setAdapter(mMainAdapter);
    }

    private void initViewModel() {

        final Observer<List<Food>> foodObserver =
                foodEntities -> {
                    foodData.clear();
                    foodData.addAll(foodEntities);

                    if (mMainAdapter == null) {
                        mMainAdapter = new MainAdapter(foodData,JSONdbTest.this);
                        mealItemFoodsRV.setAdapter(mMainAdapter);
                    } else {
                        mMainAdapter.notifyDataSetChanged();
                    }
                };
        mainVM = ViewModelProviders.of(this)
                .get(MainViewModel.class);
        mainVM.mFoods.observe(this, foodObserver);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.create_food_click:
                Intent createFoodIntent = new Intent(this, CreateFoodActivity.class);
                this.startActivity(createFoodIntent);
            case R.id.meals_click:
                Intent mealsIntent = new Intent(this, MealsActivity.class);
                this.startActivity(mealsIntent);

            case R.id.main_add_food_btn:

        }

    }
}
