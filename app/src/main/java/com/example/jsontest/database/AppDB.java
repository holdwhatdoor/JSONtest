package com.example.jsontest.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.jsontest.utilities.JSONconverter;


@Database(entities = {Food.class, Meal.class}, version = 1, exportSchema = false)
@TypeConverters(JSONconverter.class)
public abstract class AppDB extends RoomDatabase {
    public static final String testDB = "testDB";

    private static AppDB instance;
    private static final Object LOCK = new Object();


    public abstract FoodDAO foodDAO();

    public abstract MealDAO mealDAO();

    public static synchronized AppDB getInstance(Context context){
        if(instance == null){
            synchronized (LOCK){
                if(instance == null){
                    instance = Room.databaseBuilder(context.getApplicationContext(), AppDB.class,
                            testDB)
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return instance;
    }

}
