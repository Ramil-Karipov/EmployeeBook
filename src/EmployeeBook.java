import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private final Map<String, Employee> employees = new HashMap<>();


    public void addContact(String fullName, int department, int salary) {
        Employee employee = new Employee(fullName, department, salary);
        employees.put(fullName, employee);

        System.out.println("Нельзя добавить сотрудника, закончилось место");
    }

}

//      реализовал метод, выводящий всю информацию
public void printAllInformation() {
    for (int i = 0; i < size; i++) {
        System.out.println(employees[i].toString());
    }
}

public void printAllEmployeesFullNames() {
    for (int i = 0; i < size; i++) {
        System.out.println(employees[i].getFullName());
    }
}

public void calculateSalary() {
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += employees[i].getSalary();
    }
    System.out.println("Сумма трат на зарплаты за месяц: " + sum + " рублей");
}

public void findMinimalSalaryWorker() {
    Employee minimalSalaryWorker = employees[0];
    for (int i = 0; i < size; i++) {
        if (employees[i].getSalary() < minimalSalaryWorker.getSalary()) {
            minimalSalaryWorker = employees[i];
        }
    }
    System.out.println("Сотрудник с минимальной зарплатой: " + minimalSalaryWorker.getFullName());
}

public void findAverageSalary() {
    double averageSalary = 0;
    for (int i = 0; i < size; i++) {
        averageSalary += employees[i].getSalary();
    }
    averageSalary = averageSalary / size;
    System.out.println("Среднее значение зарплат: " + averageSalary + " рублей");
}

public void findHighestSalaryWorker() {
    Employee highestSalaryWorker = employees[0];
    for (int i = 0; i < size; i++) {
        if (employees[i].getSalary() > highestSalaryWorker.getSalary()) {
            highestSalaryWorker = employees[i];
        }
    }
    System.out.println("Сотрудник с наибольшей зарплатой: " + highestSalaryWorker.getFullName());
}

//    реализовал метод, индексирующий все зарплаты на ...
public void indexSalary() {
    int percent = 10;
    for (int i = 0; i < size; i++) {
        employees[i].setSalary(employees[i].getSalary() * percent / 100 + employees[i].getSalary());
    }
}

public void findMinimalSalaryWorkerOfDepartment(int department) {
    Employee minimalSalaryWorkerOfDepartment = employees[0];
    for (int i = 0; i < size; i++) {
        if (employees[i].getDepartment() == department) {
            minimalSalaryWorkerOfDepartment = employees[i];
            break;
        }
    }
    for (int i = 0; i < size; i++) {
        if (employees[i].getDepartment() == department && employees[i].getSalary() < minimalSalaryWorkerOfDepartment.getSalary()) {
            minimalSalaryWorkerOfDepartment = employees[i];
        }
    }
    System.out.println("Сотрудник с наименьшей зарплатой в " + department + " отделе: " + minimalSalaryWorkerOfDepartment.getFullName());
}

public void findHighestSalaryWorkerOfDepartment(int department) {
    Employee highestSalaryWorkerOfDepartment = employees[0];
    for (int i = 0; i < size; i++) {
        if (employees[i].getDepartment() == department) {
            highestSalaryWorkerOfDepartment = employees[i];
            break;
        }
    }
    for (int i = 0; i < size; i++) {
        if (employees[i].getDepartment() == department && employees[i].getSalary() > highestSalaryWorkerOfDepartment.getSalary()) {
            highestSalaryWorkerOfDepartment = employees[i];
        }
    }
    System.out.println("Сотрудник с наибольшей зарплатой в " + department + " отделе: " + highestSalaryWorkerOfDepartment.getFullName());
}

public void calculateSalaryOfDepartment(int department) {
    int sum = 0;
    for (int i = 0; i < size; i++) {
        if (employees[i].getDepartment() == department) {
            sum += employees[i].getSalary();
        }
    }
    System.out.println("Сумма трат на зарплаты за месяц в " + department + " отделе: " + sum + " рублей");
}

public void findAverageSalaryOfDepartment(int department) {
    int sum = 0;
    int employeesOfDepartment = 0;
    for (int i = 0; i < size; i++) {
        if (employees[i].getDepartment() == department) {
            sum += employees[i].getSalary();
            employeesOfDepartment++;
        }
    }
    sum = sum / employeesOfDepartment;
    System.out.println("Средняя зарплата в " + department + " отделе: " + sum + " рублей");
}

public void indexSalaryOfDepartment(int percent, int department) {
    for (int i = 0; i < size; i++) {
        if (employees[i].getDepartment() == department) {
            employees[i].setSalary(employees[i].getSalary() * percent / 100 + employees[i].getSalary());
        }
    }
}

public void printAllInformationOfDepartment(int department) {
    for (int i = 0; i < size; i++) {
        if (employees[i].getDepartment() == department) {
            System.out.println(employees[i].toString());
        }
    }
}

public void findWorkersWithSalaryBelowParameter(int salary) {
    for (int i = 0; i < size; i++) {
        if (employees[i].getSalary() < salary) {
            System.out.println("Сотрудник с зарплатой меньше " + salary + ": " + "id " + employees[i].getId() + ", "
                    + employees[i].getFullName() + ", зарплата " + employees[i].getSalary() + " рублей");
        }
    }
}

public void findWorkersWithSalaryHigherParameter(int salary) {
    for (int i = 0; i < size; i++) {
        if (employees[i].getSalary() >= salary) {
            System.out.println("Сотрудник с зарплатой больше " + salary + ": " + "id " + employees[i].getId() + ", "
                    + employees[i].getFullName() + ", зарплата " + employees[i].getSalary() + " рублей");
        }
    }
}


}

