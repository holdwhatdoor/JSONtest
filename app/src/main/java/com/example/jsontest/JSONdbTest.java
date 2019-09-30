package com.example.jsontest;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class JSONdbTest extends AppCompatActivity implements View.OnClickListener {


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
