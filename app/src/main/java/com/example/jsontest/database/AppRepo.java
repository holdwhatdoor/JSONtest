package com.example.jsontest.database;

import android.content.Context;
import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AppRepo {
    // Repo instance
    private static AppRepo repoInstance;

    // LiveData variable lists
    public LiveData<List<Food>> mFoods;
    public LiveData<List<Meal>> mMeals;

    // Database instance and executor
    private AppDB mDb;
    private Executor executor = Executors.newSingleThreadExecutor();

    // Returns instance of app repository
    public static AppRepo getInstance(Context context) {
        if (repoInstance == null) {
            repoInstance = new AppRepo(context);
        }
        return repoInstance;
    }

    // AppRepo constructor with context parameter returning all data in database
    private AppRepo(Context context) {
        mDb = AppDB.getInstance(context);
        mFoods = getAllFoods();
        mMeals = getAllMeals();
    }

    // LiveData getter methods
    private LiveData<List<Food>> getAllFoods() {
        return mDb.foodDAO().getAll();
    }
    private LiveData<List<Meal>> getAllMeals() {
        return mDb.mealDAO().getAll();
    }

    // Getter methods by object Id
    public Food getFoodById(int foodId) { return mDb.foodDAO().getFoodById(foodId); }
    public Meal getMealById(int mealId) { return mDb.mealDAO().getMealById(mealId); }

    // Insert methods
    public void insertFood(final Food food) {
        executor.execute(new Runnable() {
            @Override
            public void run() { mDb.foodDAO().insert(food); }
        });

    }

    public void insertMeal(final Meal meal) {
        executor.execute(new Runnable() {
            @Override
            public void run() { mDb.mealDAO().insert(meal); }
        });
    }

    // Delete methods
    public void deleteFood(final Food food) {
        executor.execute(new Runnable() {
            @Override
            public void run() { mDb.foodDAO().delete(food); }
        });
    }

    public void deleteAllFood() {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                mDb.foodDAO().deleteAll();
            }
        });
    }

    public void deleteMeal(final Meal meal) {
        executor.execute(new Runnable() {
            @Override
            public void run() { mDb.mealDAO().delete(meal); }
        });
    }

}
