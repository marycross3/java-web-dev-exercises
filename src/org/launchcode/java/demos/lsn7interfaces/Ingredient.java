package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public abstract class Ingredient {
    private String name;
    private double cost;
    private ArrayList<String> allergens;
    private ArrayList<String> toppings;

    public Ingredient(String aName, double aCost, ArrayList<String> someAllergens){
        name = aName;
        cost = aCost;
        allergens = someAllergens;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public ArrayList<String> getAllergens() {
        return allergens;
    }

    public void setAllergens(ArrayList<String> allergens) {
        this.allergens = allergens;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Cost: $" + cost + "\n" +
                "Allergens: " + allergens + "\n";
    }
}
