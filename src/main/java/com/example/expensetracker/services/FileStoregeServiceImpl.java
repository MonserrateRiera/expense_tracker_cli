package com.example.expensetracker.services;

import com.example.expensetracker.model.Expense;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileStoregeServiceImpl implements FileStorageService{

    private final static String FILE_PATH = "expenses.txt";
    Gson gson = new Gson();

    @Override
    public void save (Expense expense){
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            String jsonExpense = gson.toJson(expense);
            writer.write(jsonExpense);
        } catch (IOException e) {
            System.err.println("ERROR saving the expense: " + e.getMessage());
        }
    }
    @Override
    public List<Expense> getAllExpenses (){
        List<Expense> expenses = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Expense readedExpense = gson.fromJson(line, Expense.class);
                expenses.add(readedExpense);
            }
        } catch (IOException e) {
            System.err.println("ERROR reading the expenses: " + e.getMessage());
        }
        return expenses;
    }

    @Override
    public void saveAll(List<Expense> expenses) {
        try (FileWriter writer = new FileWriter(FILE_PATH, false)) {
            for(Expense expense : expenses){
                String jsonExpense = gson.toJson(expense);
                writer.write(jsonExpense);
            }
        } catch (IOException e) {
            System.err.println("ERROR saving the expense: " + e.getMessage());
        }
    }
}
