import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private final Map<String, Employee> employees = new HashMap<>();


    public void addContact(String fullName, int department, int salary) {
        String key = getKey(fullName);
        Employee employee = new Employee(fullName, department, salary);
        employees.put(key, employee);
    }

    public static String getKey(String fullName) {
        return fullName.toLowerCase();
    }

    public void delete(String fullName) {
        String key = getKey(fullName);
        if (!employees.containsKey(key)) {
            throw new IllegalStateException("Сотрудник не найден");
        }
        employees.remove(key);
    }

    public void delete(int id) {
        Employee employeeToRemove = null;
        for (Employee employee : employees.values()) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employees.remove(getKey(employeeToRemove.getFullName()));
        } else {
            throw new IllegalStateException("Сотрудник не найден");
        }
    }

    public void update(String fullName, int department, int salary) {
        if (!employees.containsKey(getKey(fullName))) {
            throw new IllegalStateException("Сотрудник не найден");
        }
        Employee employee = employees.get(getKey(fullName));
        employee.setSalary(salary);
        employee.setDepartment(department);

    }

    public void printAll() {
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }

    public void printAll(int department) {
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() == department) {
                System.out.println(employee);
            }
        }
    }

    public int getSum() {
        int sum = 0;
        for (Employee employee : employees.values()) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public int getSum(int department) {
        int sum = 0;
        for (Employee employee : employees.values()) {
            if (employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;

    }
}







