package employeeApp;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private int giro;
    private String[] developerNames;

    public Company(int id, String name, int giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro < 0 ? 0 : giro;
        this.developerNames = developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGiro(int giro) {
        this.giro = giro < 0 ? 0 : giro;
    }

    public int getGiro() {
        return giro;
    }

    public void addEmployee(int index, String name) {
        try {
            if (developerNames[index] == null) {
                developerNames[index] = name;
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
        return "Company{" +
                "id=" + getId() +
                ", name=" + getName() +
                ", giro=" + getGiro() +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
