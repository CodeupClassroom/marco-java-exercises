import java.util.*;

public class CollectionsLecture {

    public static void printEachElement(List<String> strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }


    public static ArrayList<String> upperLastElement(ArrayList<String> input) {
        if (input.size() == 0) return input;
        String lastElement = input.get(input.size() - 1);
        input.set((input.size() - 1), lastElement.toUpperCase());
        return input;
    }

    public static void main(String[] args) {

        // ----------------------------- Array Lists

        // Creating Array Lists and Getting Elements

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//        System.out.println(numbers);
//        numbers.add(7);
//
//        System.out.println(numbers);



//        System.out.println(numbers); // used to peek into the list
//        System.out.println(numbers.get(0));


//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("bob");
//        strings.add("hello");
//        strings.add("etc");
//
//        String bob = strings.get(0);
//
//        System.out.println(bob.toUpperCase());

        // TODO: write an array list of three people in this cohort
        // TODO: print out each person's name in the list

//        ArrayList<String> names = new ArrayList<>();
//
//        names.add("Victor");
//        names.add("Roland");
//        names.add("Andrew");
//
//        System.out.println(names.get(0));
//        System.out.println(names.get(1));
//        System.out.println(names.get(2));




        // Creating ArrayList with Arrays.asList()

//        ArrayList<String> names = new ArrayList<>(Arrays.asList(
//                "Fred",
//                "Sally",
//                "Cindy"
//        ));
//
//        System.out.println(names);

        // Getting Elements by Index Number

//        ArrayList<String> names = new ArrayList<>(Arrays.asList(
//                "Fred",
//                "Sally",
//                "Cindy"
//        ));

//        System.out.println(names.get(2));
//        System.out.println(names.get(5)); // ?


        // Adding & Editing Elements

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
//        numbers.add(20);
//        System.out.println(numbers);
//        numbers.add(0, 21); // expands the array size
//        System.out.println(numbers);
//        numbers.set(0, 7); // edits the value at that index
//        System.out.println(numbers);
////        numbers.add(10, 22); // ???
//        System.out.println(numbers);
////
//        System.out.println(numbers.size());


        // Removing Elements

//        ArrayList<String> names = new ArrayList<>(Arrays.asList(
//                "Fred",
//                "Sally",
//                "Cindy"
//        ));
////        System.out.println(names);
//        names.remove(0);
//        System.out.println(names);

//        System.out.println(names);

        // Removing Number by Value or Index

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
//
//        numbers.remove(Integer.valueOf(2)); // remove by value of the number
//        System.out.println(numbers);

        // reordering list

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 5, 1, 3));
//        Collections.sort(numbers);
//        System.out.println(numbers);
//        Collections.reverse(numbers);
//        System.out.println(numbers);

        // Additional Methods

//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
//        System.out.println(numbers.size());
//        System.out.println(numbers.indexOf(3));
//        System.out.println(numbers.indexOf(105)); // ???
//
//        ArrayList<String> roasts = new ArrayList<>();
//        roasts.add("medium");
//        roasts.add("light");
//        roasts.add("medium");
//        roasts.add("dark");
//        System.out.println(roasts);
//        System.out.println(roasts.contains("dark"));
//        System.out.println(roasts.contains("espresso"));
//        System.out.println(roasts.indexOf("medium")); // 0
//        System.out.println(roasts.lastIndexOf("medium")); // 2
//        System.out.println(roasts.isEmpty());

        /*

            TODO:
               1. Create a class called CollectionsPractice with a main method.
               2. Create a static method, upperLastElement, that takes in an array list and
                  returns the array list with last string upper case. An empty array list
                  should be returned if the passed array list is empty. If the passed array
                  list only has one string, uppercase it.
               3. In the main method, create an array list of first name strings of three people in Marco.
               4. Test the upperLastElement method on your array of Marco people.

               Examples

               ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Justin, "Douglas", "Kenneth"));
               upperLastElement(names) should return "Justin", "Douglas", "KENNETH"

               ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Kenneth"));
               upperLastElement(names2) should return "KENNETH"

               ArrayList<String> names3 = new ArrayList<>();
               upperLastElement(names3) should return an empty array list

         */


//        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Justin", "Douglas", "Kenneth"));
//        ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Kenneth"));
//        ArrayList<String> names3 = new ArrayList<>();
//        System.out.println(upperLastElement(names1));
//        System.out.println(upperLastElement(names2));
//        System.out.println(upperLastElement(names3));

        // List vs. ArrayList (Polymorphism)

//        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("bob", "steve", "justin"));
//        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("bob", "steve", "justin"));
//        printEachElement(arrayList);
//        printEachElement(linkedList);


//        printEachElement(linkedList);


        // Java Generics

//        List unsafe = new ArrayList();
//        unsafe.add(new Object());
//        unsafe.add(3);
//        unsafe.add("hello");
//        unsafe.add(true);
//
//        String str1 = (String) unsafe.get(2); // must explicitly cast
//        String str2 = (String) unsafe.get(0); // can lead to runtime exceptions







        // ----------------------------- Hash Maps

        // creating hash maps

        Map<String, String> usernames = new HashMap<>();

        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Luis", "MontealegreLuis");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");

        System.out.println(usernames);

        // getting values from and info about hash map

//        System.out.println(usernames);
//        System.out.println(usernames.get("Justin"));
//        System.out.println(usernames.get("Zach"));

//        System.out.println(usernames.get("Phillip"));
//        System.out.println(usernames.getOrDefault("Fred", "gocodeup"));
//        System.out.println(usernames.containsKey("Luis"));

        // !!!!! getting a list of map keys and then searching for a match in the values

        // updating hash maps

//        usernames.put("Ryan", "rorsinger");
//        System.out.println(usernames);
//        usernames.put("Ryan", "Test");
//        System.out.println(usernames);
//        usernames.putIfAbsent("Zach", "coderdude24");
//        System.out.println(usernames);
//        System.out.println(usernames);

        // removing entries from hash map

//        System.out.println(usernames.remove("Zach"));
//        System.out.println(usernames);
//        System.out.println(usernames.remove("Zach"));
//        System.out.println(usernames);
//        usernames.clear();
//        System.out.println(usernames);
//        System.out.println(usernames.isEmpty());

        /*

            TODO: Create a HashMap of three people in class with keys using their last name
             and values at those keys using their first name.

             Example

             "Justin" could be returned from nameHashMap.get("Reich")

            BONUS TODO: Create a HashMap containing three people in the class with keys using their
             first name and values that are an ArrayList of strings containing at least two
             objects visible in their background.

             Example

             ArrayList<String> with values ("Codeup Sign", "Black Background", "Nothing Else")
             from backgroundHashMap.get("Justin")

         */
//
//        Map<String, String> namesHashMap = new HashMap<>();
//        namesHashMap.put("Reich", "Justin");
//        namesHashMap.put("Moore", "Samuel");
//        namesHashMap.put("Howell", "Kenneth");
//
//        System.out.println(namesHashMap);
//
//        Map<String, List<String>> backgroundHashMap = new HashMap<>();
//        backgroundHashMap.put("Justin", new ArrayList<>(Arrays.asList("Codeup Text", "Shadow", "Codeup Logo")));
//        backgroundHashMap.put("Roland", new ArrayList<>(Arrays.asList("Whiteboard", "Window", "Computer")));
//        backgroundHashMap.put("Karla", new ArrayList<>(Arrays.asList("Bridge", "Ocean", "Mountain")));
//
//        System.out.println(backgroundHashMap);

    }

}
