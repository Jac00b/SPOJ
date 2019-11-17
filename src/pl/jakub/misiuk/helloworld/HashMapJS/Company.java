package pl.jakub.misiuk.helloworld.HashMapJS;

import java.util.HashMap;

public class Company {
    private HashMap<String, Employee> employees = new HashMap<>();;

    public boolean addEmployee(Employee employee) {
        String key = employee.getImie() + " " + employee.getNazwisko();

        if (employees.get(key) != null) {
            return false;
        } else {
            employees.put(key, employee);
            return true;
        }
    }

    public Employee getEmployee(String imie, String nazwisko) {
        String key = imie + " " + nazwisko;
        return employees.get(key);
    }
}
