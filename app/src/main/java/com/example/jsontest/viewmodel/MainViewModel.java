package com.example.jsontest.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.jsontest.database.AppRepo;
import com.example.jsontest.database.Food;
import com.example.jsontest.database.Meal;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MainViewModel extends AndroidViewModel {

    public MutableLiveData<Food> mLiveFood;
    public LiveData<List<Food>> mFoods;
    public LiveData<Food> mFood;

    public MutableLiveData<Meal> mLiveMeal;
    public LiveData<List<Meal>> mMeals;
    public LiveData<Meal> mMeal;

    // Repo and thread executor instances
    public AppRepo mRepo;
    public Executor executor = Executors.newSingleThreadExecutor();

    public MainViewModel(@NonNull Application application) {
        super(application);

        mRepo = AppRepo.getInstance(getApplication());
        mFoods = mRepo.mFoods;
        mMeals = mRepo.mMeals;

    }

    public void insertFood(Food food) {
        mRepo.insertFood(food);
    }

    public void deleteFood(int foodId) {
        mRepo.deleteFood(mRepo.getFoodById(foodId));
    }

    public void deleteAllFoods() {
        mRepo.deleteAllFood();
    }

}
