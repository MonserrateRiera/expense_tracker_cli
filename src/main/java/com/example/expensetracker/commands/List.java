package com.example.expensetracker.commands;

import com.example.expensetracker.services.ExpenseServiceImpl;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "list", description = "List all the expenses")
public class List implements Callable<Integer> {
    private final ExpenseServiceImpl expenseServiceImpl = new ExpenseServiceImpl();


    @Override
    public Integer call() throws Exception {
        expenseServiceImpl.listExpenses();
        return 0;
    }
}
