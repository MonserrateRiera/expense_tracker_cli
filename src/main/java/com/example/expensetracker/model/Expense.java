package com.example.expensetracker.model;

import java.util.Date;

public class Expense {
    private int id;
    private String description;
    private int amount;
    private final Date date;

    public Expense(String description, int amount){
        this.id = (int) (Math.random() * 300) + 1;
        this.amount = amount;
        this.description = description;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String toString (){

        return this.id+" "+date+" "+description+" "+amount+"€" ;
    }
}
