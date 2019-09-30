package com.example.jsontest.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.jsontest.MealsActivity;

import java.util.List;

public class MealsViewModel extends AndroidViewModel {

    public LiveData<List<MealsActivity>> mMeals;

    public MealsViewModel(@NonNull Application application) {
        super(application);
    }
}
