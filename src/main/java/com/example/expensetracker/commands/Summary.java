package com.example.expensetracker.commands;

import com.example.expensetracker.services.ExpenseServiceImpl;
import com.example.expensetracker.services.ExpenseService;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "summary", description = "Get the sum of all expenses")
public class Summary implements Callable<Integer> {

    private final ExpenseService expenseService = new ExpenseServiceImpl();

    @CommandLine.Option(names = "--month", required = false, description="Sum all the expenses for one month")
    int month;
    @CommandLine.Option(names = "--year", required = false, description="Sum all the expenses for one year")
    int year;


    @Override
    public Integer call() throws Exception {

        expenseService.summaryExpenses(month, year);
        return 0;
    }
}
