package InheritanceAndPolymorphism;

import oopLecture.Person;

public class InAndPolyTester {

    public static void main(String[] args) {
        Person person = new Person("Douglas", "Hirsh");
        //person.firstName = "Douglas";

        System.out.println("person.joinsChat() = " + person.joinsChat());

        System.out.println("person.sayHello() = " + person.sayHello());

        Employee employee = new Employee("Kenneth", "Howell");
        String greeting = employee.joinsChat();
        //employee.firstName = "Douglas";

        System.out.println("greeting = " + greeting);
        employee.doWork();

        System.out.println("employee.sayHello() = " + employee.sayHello());
    }

}
