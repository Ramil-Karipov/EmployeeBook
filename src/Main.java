public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addContact("Виктория", 1, 33_000);
        employeeBook.addContact("Ефим", 2, 50_000);
        employeeBook.addContact("Давид", 3, 70_000);
        employeeBook.printAll();
        System.out.println();
        employeeBook.update("Ефим", 2, 100_000);
        try {
            employeeBook.update("Константин", 1, 70_000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        employeeBook.printAll();
        System.out.println();

        employeeBook.delete(2);
        employeeBook.delete("давиД");
        employeeBook.printAll();

    }
}