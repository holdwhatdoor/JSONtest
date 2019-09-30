package com.example.jsontest.ui;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import butterknife.ButterKnife;

public class CreateFoodAdapter extends RecyclerView.Adapter<CreateFoodAdapter.CreateFoodHolder> {
    @NonNull
    @Override
    public CreateFoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CreateFoodHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CreateFoodHolder extends RecyclerView.ViewHolder {
        public CreateFoodHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
