import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = createPersonList();
        printEmployees(personList);
        printStudents(personList);
        double avgSalary = avgSalary(personList);
        System.out.println("Avg salary of employees  = " + avgSalary);
        double avgGpa = avgGpa(personList);
        System.out.println("Average gpa of student = " + avgGpa);

    }
    private static ArrayList<Person> createPersonList() {
        //adding different kind of objects in one array list that has the type of the super class
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Employee("Saad", "0563428255", 200003, 16000));
        personList.add(new Student("Reem", "0564448202", 20000, 3.6));
        personList.add(new Employee("Salem", "0501331845", 200001, 9000));
        personList.add(new Student("Hasan", "0594448202", 20002, 2.8));
        return personList;
    }
    private static void printEmployees(ArrayList<Person> personList){
        ArrayList<Person> employeeList = new ArrayList<>();
        for(Person object: personList){
            if(object instanceof Employee){ // to check the object type of this object
                employeeList.add(object);
            }

        }
        System.out.println("List of Employees:");
        System.out.println(employeeList);

    }
    private static double avgSalary(ArrayList<Person> personList){
        ArrayList<Person> employeeList = new ArrayList<>();
       double sum = 0;
       double avg;
        for(Person object: personList){
            if(object instanceof Employee){
                employeeList.add(object);
            }
        }
        for(Person employee :employeeList){
            sum = sum + ((Employee) employee).getSalary();
        }
        avg = sum/employeeList.size();
        return avg;
    }
    private static void printStudents(ArrayList<Person> personList){
        ArrayList<Person> studentList = new ArrayList<>();
        for(Person object: personList){
            if(object instanceof Student){
                studentList.add(object);
            }

        }
        System.out.println("List of Students:");
        System.out.println(studentList);
    }
    private static double avgGpa(ArrayList<Person> personList){
        ArrayList<Person> studentList = new ArrayList<>();
        double sum = 0;
        double avg;
        for(Person object: personList){
            if(object instanceof Student){
                studentList.add(object);
            }
        }
        for(Person student :studentList){
            sum = sum + ((Student) student).getGpa();
        }
        avg = sum/studentList.size();
        return avg;

    }



}