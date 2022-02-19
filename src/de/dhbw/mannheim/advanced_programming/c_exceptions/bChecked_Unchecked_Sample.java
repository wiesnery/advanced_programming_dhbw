package de.dhbw.mannheim.advanced_programming.c_exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class bChecked_Unchecked_Sample {
    public static void main(String[] args) {

        // 1. Checked Exceptions

        // Uncomment the line below to see a compile-time error because of an unhandled Unchecked Exception
        // This call throws a java.io.FileNotFoundException
        // new FileInputStream("non_existent_filename");

        // Right-click the "FileNotFoundException" constructor
        // and select "Go to" -> "Declaration or Usages" to see, that it inherits a FileNotFoundException
        //
        // Repeat the same for the IOException and you see, that it inherits from plain Exception
        // This means, that it is a checked Exception
        var fileNotFoundException = new FileNotFoundException();
        var ioException = new IOException();

        // 2. Unchecked Exceptions
        // The following call will throw a java.lang.ArithmeticException
        // Repeat the same steps as above on the ArithmeticException see, that it is a RuntimeException
        // No need to handle this if you don't consider it important
        // HINT: Gladly, our smart IDE notices that the code will raise a ArithmeticException and warns us
        // HINT: This is possible due to "static code analysis"

        var divisionResult = 42/0;
        var arithmeticException = new ArithmeticException();
    }
}
