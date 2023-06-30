package com.Testing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeImpl {

    public static void main(String[] args) {
        List<Employee> empList = List.of(new Employee("Deepak", "Java", 12),
                                            new Employee("Ravi", "Cloud", 18),
                                                new Employee("Manish", "Sales", 16),
                                                    new Employee("Ramu", "Java", 13),
                                                        new Employee("Ravi", "Sales", 14));

        //System.out.println(empList);

        List<Integer> lst = Arrays.asList(1,2,3,5,2,4,5,6,8,5,3,4,8,9,1);

//        lst.stream().
//                filter(n -> n >5).
//                        forEach(System.out::println);

//        System.out.println(
//                lst.stream().reduce(Integer.MIN_VALUE, (a,b) -> a>b?a:b)
//        );


//                lst.stream().
//                        filter(n-> n%2 == 0).max(Comparator.comparing(0, (a,b)->a>b?a:b);




//        System.out.println(empList.stream().
//                filter(emp-> emp.getId() > 13).
//                //anyMatch(emp-> emp.getDept() == "Sales").
//                sorted(Comparator.comparing(Employee::getId).reversed()).
//                collect(Collectors.toList())
//        );
//
//        System.out.println(
//                empList.stream().
//                        collect(Collectors.groupingBy(emp -> emp.getDept()))
//        );

//        System.out.println(
//                empList.stream().
//                        filter(emp -> emp.getDept()=="Java").
//                        collect(Collectors.toList())
////                        anyMatch(emp -> emp.getDept() == "Java")
//        );


    }
}
