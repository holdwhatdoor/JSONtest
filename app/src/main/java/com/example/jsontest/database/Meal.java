package com.example.jsontest.database;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity (tableName = "meal_table")
public class Meal {

    @PrimaryKey(autoGenerate = true)
    private int mealId;

    private String mealName;
    private String foodItems;
    private double tCals;
    private double tCarbs;
    private double tPro;
    private double tFat;

    @Ignore
    public Meal(){}

    @Ignore
    public Meal(String mealName, String foodItems, double tCals, double tCarbs, double tPro, double tFat){
        this.mealName = mealName;
        this.foodItems = foodItems;
        this.tCals = tCals;
        this.tCarbs = tCarbs;
        this.tPro = tPro;
        this.tFat = tFat;
    }

    public Meal(int mealId, String mealName, String foodItems, double tCals, double tCarbs, double tPro, double tFat){
        this.mealId = mealId;
        this.mealName = mealName;
        this.foodItems = foodItems;
        this.tCals = tCals;
        this.tCarbs = tCarbs;
        this.tPro = tPro;
        this.tFat = tFat;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId = mealId;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(String foodItems) {
        this.foodItems = foodItems;
    }

    public double getTCals() {
        return tCals;
    }

    public void setTCals(double tCals) {
        this.tCals = tCals;
    }

    public double getTCarbs() {
        return tCarbs;
    }

    public void setTCarbs(double tCarbs) {
        this.tCarbs = tCarbs;
    }

    public double getTPro() {
        return tPro;
    }

    public void setTPro(double tPro) {
        this.tPro = tPro;
    }

    public double getTFat() {
        return tFat;
    }

    public void setTFat(double tFat) {
        this.tFat = tFat;
    }
}
