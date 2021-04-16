/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import java.util.*;

/**
 *
 * @author DELL
 */
public class Admin {

    private static Admin instance;
    private List<Employee> employeeList = new ArrayList<>();
     Employee o =new Employee();
    private Admin() {
        employeeList = new ArrayList<>();
        this.o.setName("Muhammad Taha");
        this.o.setEmail("taha@gmail.com");
        this.o.setCellNumber("03323491128");
        this.o.setPassword("Taha123");
        this.addEmployee(o);
    }

    static Admin getInstance() {
        if (instance == null) {
            instance = new Admin();
        }
        return instance;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public static void setInstance(Admin instance) {
        Admin.instance = instance;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    boolean addEmployee(Employee obj) {
        boolean check = false;
        if (obj != null) {
            employeeList.add(obj);
            check = true;
        }
        return check;
    }

    boolean updateEmployee(Employee obj, String email) {
        boolean check = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmail().equals(email)) {
                employeeList.set(i, obj);
                check = true;
                break;
            }
        }
        return check;
    }

    Employee viewEmployee(String email) {
        int index = returnIndex(email);
        Employee obj = new Employee();
        if (index != -1) {
            obj = employeeList.get(index);
        }
        return obj;
    }

    int returnIndex(String email) {
        int index = -1;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmail().equals(email)) {
                index = i;
            }
        }
        return index;
    }

    boolean deleteEmployee(String email) {
        boolean check = false;
        int index = returnIndex(email);
        if (index != -1) {
            employeeList.remove(index);
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    public boolean checkEmail(String email) {
        boolean check = false;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmail().equals(email)) {
                check = true;
            }
        }
        return check;
    }

    Employee returnEmployee(String email) {
        Employee obj = new Employee();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmail().equals(email)) {
                obj = employeeList.get(i);
            }
        }
        return obj;
    }

    List<Employee> SearchByName(String name) {
        List<Employee> strList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getName().equals(name)) {
                strList.add(employeeList.get(i));
            }
        }
        return strList;
    }

    List<Employee> searchByEmail(String email) {
        List<Employee> strList = new ArrayList<>();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getEmail().equals(email)) {
                strList.add(employeeList.get(i));
            }
        }
        
        return strList;
    }
    
    boolean signIn(String email,String password)
    {
        boolean check = false;
        for(int i=0;i<employeeList.size();i++)
        {
            if(employeeList.get(i).getEmail().equals(email) && employeeList.get(i).getPassword().equals(password))
            {
                check = true;
                break;
            }
        }
        return check;
    }
}
