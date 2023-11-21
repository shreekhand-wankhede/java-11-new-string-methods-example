// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Java11NewStringMethodsExample.java {
    public static void main(String[] args) {
        List<String> lines = multilineString.lines()
  .filter(line -> !line.isBlank())
  .map(String::strip)
  .collect(Collectors.toList());
        System.out.println("Lines"+lines);
    }
}

// These methods can reduce the amount of boilerplate involved in manipulating string objects, and save us from having to import libraries.
// In the case of the strip methods, they provide similar functionality to the more familiar trim method; however, with finer control and Unicode support.
