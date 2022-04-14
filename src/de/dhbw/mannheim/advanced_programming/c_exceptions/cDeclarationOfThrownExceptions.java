package de.dhbw.mannheim.advanced_programming.c_exceptions;

import java.io.FileNotFoundException;
import java.util.List;

public class cDeclarationOfThrownExceptions {

    // 1. The following method throws an IllegalArgumentException and declares it
    void checkArguments(String arguments) throws IllegalArgumentException {
        if (arguments == null || arguments.isEmpty())
            throw new IllegalArgumentException();
    }

    // 2. Unchecked / Runtime Exceptions don't have to be declared as they are not checked by the compiler
    // However, it is considered good practice to declare all Exceptions which are reasonable to handle by the caller
    void checkArguments_withoutDeclaration(String arguments) {
        if (arguments == null || arguments.isEmpty())
            throw new IllegalArgumentException();
    }

    // 3. Checked Exceptions must be declared
    // Try removing the "throws FileNotFoundException" from the method signature to see the compilation fail
    void copyFile(String fileName) throws FileNotFoundException {
        var knownFiles = List.of("file1.txt", "file2.txt", "file3.txt");

        if (!knownFiles.contains(fileName))
            throw new FileNotFoundException();

        // something unexpected happened
        // 4. Exceptions often carry payload like a custom error message or the original cause
        throw new RuntimeException("custom mesage");
    }

}
