# Expense Tracker CLI

**Expense Tracker CLI** is a command-line application developed in Java that allows you to efficiently manage your expenses. This project was created to enhance Java skills and provide a useful tool for expense tracking.

## Features

- **Add expenses**: Record new expenses with a description and amount.
- **Delete expenses**: Remove expenses by ID.
- **List expenses**: Display all recorded expenses.
- **Expense summary**: Provide a total expense summary and filter by categories or date range.

## Technologies Used

- **Java**: Primary programming language.
- **Maven**: Project and dependency management tool.
- **JUnit**: Testing framework for unit tests.

## Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/MonserrateRiera/expense_tracker_cli.git
   cd expense_tracker_cli
   ```

2. **Build the project**:

Ensure you have Maven installed. Then, run:
```
mvn clean install
```
3. **Run the application**:

After compiling, execute the application using:
```
    java -jar target/expense_tracker_cli-1.0-SNAPSHOT.jar
```
4. **Usage**

Once the application is running, you can interact with it using the following commands:

  -  Add an expense:
```
add --description "Lunch" --amount 15
```
  - List all expenses:
```
list
```

  - Delete an expense:
```
delete --id 1
```
  - Show expense summary:
```
summary
```
Contributing

Contributions are welcome! To contribute:

    Fork the repository.
    Create a new branch (git checkout -b feature/new-feature).
    Make your changes and commit (git commit -m 'Add new feature').
    Push your changes (git push origin feature/new-feature).
    Open a Pull Request.

License

This project is licensed under the MIT License. See the LICENSE file for more details.

Thank you for using Expense Tracker CLI! If you have any questions or suggestions, feel free to open an issue in the repository.
