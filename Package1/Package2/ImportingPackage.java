package Package2;

import static Package1.Example.printMessage; //packagename.classname.methodname (Syntax).

public class ImportingPackage {

    public static void main(String[] args) {
        printMessage(); // calling the method from another package
    }
}
