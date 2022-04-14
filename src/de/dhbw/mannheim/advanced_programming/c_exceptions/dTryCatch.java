package de.dhbw.mannheim.advanced_programming.c_exceptions;

import java.io.FileNotFoundException;

public class dTryCatch {

    // 1. This method throws an Exception
    // Is it Checked or Unchecked?
    // Do must we handle it during compile time or not?
    static void methodWichThrowsException() throws Exception {
        throw new Exception();
    }

    // 2. Now we want to call the method and handle the exception
    public static void main(String[] args) {

        // 3. Try starts the block where the "dangerous" call happens
        try {

            // 4. This is the throwing call
            methodWichThrowsException();

            // 5. after throwing the exception by the call above, the execution of the code block will be terminated
            System.out.println("This statement will never be reached");

            // 6. We need to declare what kind of Exceptions we want to handle
            // Using "Exception" like here will catch all exceptions
        } catch (Exception e) {

            // 7. We can now log the exception to later find out where and why our code broke :(
            System.out.println("Exception handled - we are save...");
            e.printStackTrace();

            // 8. Use the "finally" block to execute a statement after the execution of the try block
            // This will be executed in any case, with or without a thrown exception
            // HINT: This is being used e.g. to close DB connections no matter what happened.
            // HINT: Open DB connections will slow down the DB server.
        } finally {
            System.out.println("This code will always be executed, no matter if an error occurred or not");
        }

        // 9. The execution continues after the block
        System.out.println("This code will be reached");






        try {
            var calculationResult =  55 / 0;
            throw new FileNotFoundException();

            // 10. We can also declare multiple catch clauses which handle Exceptions specifically
            // Which one will be executed?
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException handled");
        }


        try {
            var calculationResult =  55 / 0;
            throw new FileNotFoundException();

            // 11. We can also declare multiple Exceptions to be caught in a single catch clause
        } catch (ArithmeticException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
