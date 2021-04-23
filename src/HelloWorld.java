public class HelloWorld {

    public static void main(String[] args){

        System.out.println("Hello world! This is the MARCO CLASS! ! ! !");
        //1
        int myFavoriteNumber = 42;
        //2
        String myString = "Hello, Marco!";
        System.out.println(myString);
        //3
        //String myOtherString = 'D'; //Doesn't work. You shall not pass!

        //4
        //String myOtherString = 3.14159; //Doesn't work

        //5
        //long myNumber;
        //System.out.println("myNumber = " + myNumber); //Doesn't work because you cannot use a variable before giving it an initial value.

        //6
        //myNumber = 3.14; //Doesn't work :(

        //7
        //myNumber = 123L;

        //8
        //myNumber = 123;
        //System.out.println("myNumber = " + myNumber);

        //9
//        float myNumber;
//        myNumber = 3.14F;

        //10
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        //11
        //int class = 0; //Doesn't work because class is a reserved keyword.

        //12 //Cannot just cast Strings to ints
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        //int three = (int) "three";

        //13
//        int x = 4;
//        x += 5;
//        System.out.println("x = " + x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println("y = " + y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println("y = " + y);

        int z = Integer.MAX_VALUE;
        z+=1;
        System.out.println("z = " + z);
    }

}
