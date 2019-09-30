package com.example.jsontest.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.jsontest.database.Food;

import java.util.List;

public class CreateFoodViewModel extends AndroidViewModel {

    public LiveData<List<Food>> mFoods;

    public CreateFoodViewModel(@NonNull Application application) {
        super(application);
    }


}
