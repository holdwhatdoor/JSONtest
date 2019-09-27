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

    // Gets all database repository information
    private AppRepo(Context context) {
        mDb = AppDB.getInstance(context);
        mFoods = getAllFoods();
        mMeals = getAllMeals();
    }

    private LiveData<List<Food>> getAllFoods() {
        return mDb.foodDAO().getAll();
    }
    private LiveData<List<Meal>> getAllMeals() {
        return mDb.mealDAO().getAll();
    }

}
