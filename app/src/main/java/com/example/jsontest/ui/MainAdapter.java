package com.example.jsontest.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jsontest.database.Food;

import java.util.List;

import butterknife.ButterKnife;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder> {
    String TAG = "MainAdapter";

    private final List<Food> mFoods;
    private final Context context;

    public MainAdapter(List<Food> mFoods, Context context){
        this.mFoods = mFoods;
        this.context = context;
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MainHolder extends RecyclerView.ViewHolder {
        public MainHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
