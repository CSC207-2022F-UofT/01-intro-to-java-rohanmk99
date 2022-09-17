
/**
 * This file contains a few exercises to familiarize you with Java.
 * You should read this file from top-to-bottom. Any tasks you are to complete
 * are labelled with TODO
 *
 * For your convenience, we have also included references to the
 * relevant readings for each task.
 */

/**
 *  1. In Java, no code can exist outside of a class. Unlike Python which uses
 *    functions, all code in Java uses methods.
 *
 *    For this exercise, all of our code is within the Basics class.
 *
 *    (Relevant reading: 1.1.1. Defining classes)
 */
public class Basics {

    /**
     *  2. In Python, we could have code in a block labelled:
     *        if name == '__main__':
     *            # Code goes in here
     *    However in Java, the equivalent is the main method:
     *        public static void main(final String[] args){
     *            // Code goes in here
     *        }
     *
     *    When you run this file (Basics.java), the code within the main
     *    method is run.
     *
     *    (Relevant reading: 1.1.2. Defining methods)
     */
    public static void main(final String[] args) {
        /* 3. In Python, we could print out code using the print() function.
         *    In Java, we do the same thing by using System.out.println();
         *    In the line below, we print the result of 7 + 5
         *
         *    (Relevant reading: 1.1.3. Printing things)
         */
        System.out.println(7 + 5);

        /* TODO (Task 1): Write a line of code below that prints the string
         *                Hello World!
         */
        System.out.println("Hello World!");


        /* 4. In Python, we could declare variables using a simple assignment
         *    statement. For example:
         *        x = 10
         *    In Java, we have to specify the variable's type as well:
         *        int x = 10;
         *    We can also create variables without assigning a value to them
         *    for future use:
         *        int x;
         *
         *    (Relevant reading: 1.2. Variables and Types)
         */

        /*
         * TODO (Task 2): Create a variable named my_variable and assign it the
         *                value 100.
         */
        int my_variable = 100;


        /* Do not remove the line below: if you did task 2 correctly, then
         * you should see the message "my_variable's value is 100" if you run
         * this file!
         */
        System.out.println("my_variable's value is " + my_variable);

        /* 5. In Python, we could write a loop that iterates using:
         *        for <variable> in <values>:
         *            # Code goes in here
         *    In Java, the equivalent uses syntax in the form:
         *        for (initialized variable; end condition; increment by) {
         *            // Code goes in here
         *        }
         *    For example, if we wanted a loop from 1 to 10, we would do:
         *        for (int i = 1; i <= 10; i++){
         *            // Code goes in here
         *        }
         *    Where i++ is shorthand for i += 1 (or i = i + 1).
         *
         *    (Relevant reading: 1.8.2. for Loops)
         */

        /*
         * TODO (Task 3): Create a for-loop that loops from 10 to 0, printing
         *                the following at each iteration:
         *                Current count: #
         *
         * e.g. the end result should look like:
         * Current count: 10
         * Current count: 9
         *     ...
         * Current count: 1
         * Current count: 0
         */
        for (int i = 10; i >= 0; i--) {
            System.out.println("Current count: " + i);
        }
    }
}