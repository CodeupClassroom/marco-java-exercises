package oopLecture;

public class Person {
    public String firstName;
    public String lastName;
    public String joinsChat(){
        return lastName + ", " + firstName + " has joined the chat!";
    }

    public static void main(String[] args){
        Person ken = new Person();
        System.out.println(ken);

        String myName = "Ken";

        ken.firstName = myName;
        ken.lastName = "Howell";

        System.out.println("ken.firstName = " + ken.firstName);
        System.out.println("ken.lastName = " + ken.lastName);

        Person vanessa = new Person();
        vanessa.firstName = "Vanessa";
        vanessa.lastName = "Noriega";

        System.out.println("ken.firstName = " + ken.firstName);
        System.out.println("ken.joinsChat() = " + ken.joinsChat());
    }


}
