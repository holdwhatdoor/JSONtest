package com.example.jsontest.database;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "food_table")
public class Food {
    @PrimaryKey(autoGenerate = true)
    private int foodId;
    private String name;
    private double cals;
    private double carbs;
    private double pro;
    private double fat;

    @Ignore
    public Food(){}

    @Ignore
    public Food(String name, double cals, double carbs, double pro, double fat){
        this.name = name;
        this.cals = cals;
        this.carbs = carbs;
        this.pro = pro;
        this.fat = fat;
    }

    public Food(int foodId, String name, double cals, double carbs, double pro, double fat){
        this.foodId = foodId;
        this.name = name;
        this.cals = cals;
        this.carbs = carbs;
        this.fat = fat;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCals() {
        return cals;
    }

    public void setCals(double cals) {
        this.cals = cals;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getPro() {
        return pro;
    }

    public void setPro(double pro) {
        this.pro = pro;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }
}
