//List<Employee> employeeList, name age salary
// get employes with age greater than 25

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class  Employee {
    String name;
    int age;
    int salary;

    Employee(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
public class TestList {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Deepak",24,12000));
        list.add(new Employee("Ravi",23,12000));
        list.add(new Employee("Amit",26,12000));
        list.add(new Employee("Manish",27,12000));

//        System.out.println(
//                list.stream()
//                        .map(Comparator.comparing)
//                .toList()
//        );

    }
}
