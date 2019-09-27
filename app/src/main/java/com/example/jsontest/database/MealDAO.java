package com.example.jsontest.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MealDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Meal meal);

    @Delete
    void delete(Meal meal);

    @Query("SELECT * FROM meal_table WHERE mealId = :id")
    Meal getMealById(int id);

    @Query("SELECT * FROM meal_table ORDER BY mealId")
    LiveData<List<Meal>> getAll();

}
