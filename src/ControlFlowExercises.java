import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//a.
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        //B.
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int counter = 0;
//        do {
//            counter += 2;
//            System.out.println("counter = " + counter);
//        } while (counter < 100);

        //Alter your loop to count backwards by 5's from 100 to -10.
//        int counter = 100;
//        do {
//            System.out.println("counter = " + counter);
//            counter -= 5;
//        } while (counter >= -10);

//        for(int counter = 100; counter >= -10; counter -= 5) {
//            System.out.println("counter = " + counter);
//        }


        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

//        long sum = 2L;
//        do {
//            System.out.println(sum);
//            sum *= sum;
//        } while (sum < 1_000_000);

//        for (long sum = 2L; sum < 1_000_000; sum *= sum){
//            System.out.println("sum = " + sum);
//        }

        //C. ^^^ For - Refactor the previous two exercises to use a for loop instead.
        //2. Fizzbuzz
//        for(int i = 1; i <= 100; i++) {
//            if(i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println("i = " + i);
//            }
//        }

        //3. Display a table of powers.

//        Scanner scanner = new Scanner(System.in);
//        boolean userContinue = true;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println();
//            System.out.println("Here is your table!");
//            System.out.println();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= userInt; i++) {
//                //Print out the table;
//                System.out.printf("%-6d | %-7d | %d\n", i, i * i, i * i * i);
//            }
//            System.out.println("Do you want to continue?");
//            String userResponse = scanner.next();
//            if(!userResponse.equalsIgnoreCase("y")) {
//                userContinue = false;
//            }
//        } while (userContinue);

        //4. Convert given number grades into letter grades.

        Scanner scanner = new Scanner(System.in);

        boolean anotherGrade = true;

        do {
            System.out.println("Please enter a numerical grade from 0 to 100.");
            int numGrade = scanner.nextInt();

            if (numGrade >= 99) {
                System.out.println("A+");
            } else if (numGrade >= 88 && numGrade <= 90) {
                System.out.println("A-");
            } else if (numGrade >= 88) {
                System.out.println("A");
            } else if ( numGrade >= 80 ) {
                System.out.println("B");
            } else if ( numGrade >= 67 ) {
                System.out.println("C");
            } else if ( numGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            System.out.println("Do you want to enter another grade?");
            String userResponse = scanner.next();
            if(!userResponse.equalsIgnoreCase("y")) {
                anotherGrade = false;
            }
        } while (anotherGrade);
    }
}
