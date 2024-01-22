public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addContact("Новосельцева Виктория Викторовна", 1, 33_000);
        employeeBook.addContact("Константинов Ефим Вячеславович ", 2, 50_000);
        employeeBook.addContact("Копадзе Давид Михайлович ", 3, 70_000);
        employeeBook.printAll();
        System.out.println();
        employeeBook.update("Константинов Ефим Вячеславович ", 2, 100_000);
        try {
            employeeBook.update("Константинова Виктория Викторовна", 1, 70_000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        employeeBook.printAll();
        System.out.println();

        employeeBook.delete(2);
        employeeBook.delete("Копадзе");
        employeeBook.printAll();

    }
}