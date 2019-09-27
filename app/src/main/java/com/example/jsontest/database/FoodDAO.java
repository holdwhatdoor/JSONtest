package com.example.jsontest.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface FoodDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Food food);

    @Delete
    void delete(Food food);

    @Query("SELECT * FROM food_table WHERE foodId = :id")
    Food getFoodById(int id);

    @Query("SELECT * FROM food_table ORDER BY foodId")
    LiveData<List<Food>> getAll();

}
