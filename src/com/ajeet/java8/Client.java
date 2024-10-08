package com.ajeet.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Client {

    public static List<Employee> getEmployeeList(){
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
return employeeList;
    }

    public static void main(String[] args) {
        //how many Employee for male and female
        List<Employee> employeeList = getEmployeeList();
        Map<String,Long> noofMaleand  = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println(noofMaleand);

        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

        //3. find the avarage age for male and female
        Map<String, Double> avarageAge = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

        System.out.println(avarageAge);

        //4. get the highest paid salary for this Organisations

        Optional<Employee> highestpaidSalary   = employeeList.stream().
                collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        Employee hi = highestpaidSalary.get();
        System.out.println(hi.getSalary());

        //4. who have joined after 2015
        employeeList.stream().filter(e->e.getYearOfJoining()>2015).
                map(Employee::getName).forEach(System.out::println);

        //5. cont the number of Employee for each department

        Map<String,Long> employeedetails = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        Set<Map.Entry<String, Long>> entrySet = employeedetails.entrySet();
        for(Map.Entry<String, Long> entry : entrySet) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
//6. whats is avarage salary of each department
        Map<String , Double> employeeSalary  = employeeList.stream().
                collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        Set<Map.Entry<String, Double>> entrysalry = employeeSalary.entrySet();
        for(Map.Entry<String, Double> entry : entrysalry) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }

        //Get the details of youngest male employee in the product development department?

        Optional<Employee> youngestemployee = employeeList.stream().filter(e->e.getGender().
                equalsIgnoreCase("male") &&
                e.getDepartment().equalsIgnoreCase("product development")).min(Comparator.comparing(Employee::getAge));

        Employee youngestMaleEmployeeInProductDevelopment = youngestemployee.get();

        System.out.println("Details Of Youngest Male Employee In Product Development");

        System.out.println("----------------------------------------------");

        System.out.println("ID : "+youngestMaleEmployeeInProductDevelopment.getId());

        System.out.println("Name : "+youngestMaleEmployeeInProductDevelopment.getName());

        System.out.println("Age : "+youngestMaleEmployeeInProductDevelopment.getAge());

        System.out.println("Year Of Joinging : "+youngestMaleEmployeeInProductDevelopment.getYearOfJoining());

        System.out.println("Salary : "+youngestMaleEmployeeInProductDevelopment.getSalary());


    }

}
