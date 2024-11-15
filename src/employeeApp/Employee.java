package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void addHealthplan(int index, String name) {
        try {
            if (healthplans[index] == null) {
                healthplans[index] = name;
            } else {
                System.out.println("index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found: " + index);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", fullName=" + getFullName() +
                ", email=" + getEmail() +
                ", password=" + getPassword() +
                ", email=" + getEmail() +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }
}
