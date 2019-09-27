package com.example.jsontest.utilities;

import androidx.room.TypeConverter;

import com.example.jsontest.database.Meal;
import com.google.gson.Gson;

public class JSONconverter {

    Gson gson = new Gson();

    @TypeConverter
    public String mealJSON(Meal mealToConvert){
        String json = null;

        if(mealToConvert != null){
            json = gson.toJson(mealToConvert);
        }

        return json;
    }

    @TypeConverter
    public Meal meal(String jsonMeal){
        Meal convertedJson = null;

        if(jsonMeal != null){
            convertedJson = gson.fromJson(jsonMeal, Meal.class);
        }

        return convertedJson;
    }

}
