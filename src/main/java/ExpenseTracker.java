

import com.example.expensetracker.commands.AddExpense;
import com.example.expensetracker.commands.Delete;
import com.example.expensetracker.commands.List;
import com.example.expensetracker.commands.Summary;
import picocli.CommandLine;

@CommandLine.Command(name = "expense-tracker", mixinStandardHelpOptions = true, subcommands = { AddExpense.class, List.class, Summary.class, Delete.class  })
public class ExpenseTracker implements Runnable{








    public static void main(String[] args) {
        int exitCode = new CommandLine(new ExpenseTracker()).execute(args);
        System.exit(exitCode);


        }

    @Override
    public void run() {

    }
}
