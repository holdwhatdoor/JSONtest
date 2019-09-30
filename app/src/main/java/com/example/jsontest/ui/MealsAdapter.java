package com.example.jsontest.ui;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import butterknife.ButterKnife;

public class MealsAdapter extends RecyclerView.Adapter<MealsAdapter.MealsHolder> {
    @NonNull
    @Override
    public MealsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MealsHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MealsHolder extends RecyclerView.ViewHolder {
        public MealsHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
