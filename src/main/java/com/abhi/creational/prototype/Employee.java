package com.abhi.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable {
    private List<String> empList;

    public Employee() {
        this.empList = new ArrayList<>();
    }

    public Employee(List<String> empList) {
        this.empList = empList;
    }

    public void loadEmployeeList() {
        this.empList.add("Abhinav");
        this.empList.add("Boodhi");
        this.empList.add("Nishant");
    }

    public List<String> getEmpList() {
        return empList;
    }

    public void setEmpList(List<String> empList) {
        this.empList = empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<>();
        for (String str: this.getEmpList()) {
            temp.add(str);
        }
        return new Employee(temp);
    }
}
