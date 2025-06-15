# Restaurant Order and Receipt System

## Project Overview

This project is a simple restaurant management system where orders are taken per table and receipts are generated. Its main purpose is to facilitate organized order tracking and easy receipt printing.

## OOP Concepts Used

- **Composition:** An `Order` contains a list of `Dish` objects.  
- **Interfaces:** Utilizes `IDish` and `IPrintable` interfaces.  
- **Encapsulation:** Product prices and total amount calculations are encapsulated.

## Modules

- Menu Management (Dishes & Beverages)  
- Table and Order Tracking  
- Receipt Printing (via console or to a file)

## Development Tips

- All orders can be stored in a `Dictionary<Table, List<Dish>>` structure.  
- Receipts can be written to a file using `StreamWriter`.

## How to Run

1. Open the project in a Java-supported IDE (Eclipse, IntelliJ, etc.).  
2. Run the class containing the `main` method.  
3. Use the menu to add orders to tables, view existing orders, and print receipts.

## License

This project is developed for educational purposes and is not licensed under any formal license.
