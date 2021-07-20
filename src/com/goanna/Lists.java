package com.goanna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lists {

    public static void listPlay() {
        Employee emp1 = new Employee(1, "Mohit", 22);
        Employee emp2 = new Employee(2, "Rahul", 42);
        Employee emp3 = new Employee(3, "Shyam", 24);
        Employee emp4 = new Employee(4, "Mohit", 36);
        Employee emp5 = new Employee(5, "Swaraj", 60);


        List<Employee> empList = new ArrayList<>(10);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
       


        
        over60(empList);



        removeById(empList, 4);
        
        
        
        ageModulus(empList);


    }


    /**
     * This Will loop through the list and print out every employee with age greater than 60
     *
     * @param empList
     *
     *
     */
    public static Employee over60(List<Employee> empList) {
    	Employee adult = null;
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i).age > 60){
               adult = empList.get(i);
            }
        }
        return adult;

    }


    /**
     * This will remove element based on i
     *
     * @param empList
     *
     * @param empId
     *
     */
    public static List<Employee> removeById(List<Employee> empList, int empId) {
        //empList.remove(empId);
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i).id == empId){
                empList.remove(empList.get(i));
            }
        }
        return empList;

    }
    
    
    
    
    /**
     * This Will loop through the list and return false if no employee age is divisible by 2 
     * Return true if any employee name is divisible by 2
     *
     * @param empList
     *
     *
     */
    public static boolean ageModulus(List<Employee> empList) {
    	Employee adult = null;
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i).age % 2 == 0){
               return true;
            }
        }
        return false;

    }






}
