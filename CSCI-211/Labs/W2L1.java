import java.util.Scanner;
public class W2L1 {
    public static void main(String args[]) {
        // Different between print & println

        // print
        System.out.print("Hi");
        System.out.print("My name is Ali");
        System.out.print("I'm 30 years old.");

        // println
        System.out.println("Hi");
        System.out.println("My name is Ali");
        System.out.println("I'm 30 years old.");

        // if we need to use print and want to new line use \n
        System.out.print("Hi");
        System.out.print("\nMy name is Ali");
        System.out.print("\nI'm 30 years old.");

        // What we can print?
        System.out.println(1);
        System.out.println(1.5);
        System.out.println("A");
        System.out.println("Ali");

        // Some math
        System.out.println(1 + 2 - 4/3);

        // using string & int
        System.out.println("result = " + 1);

        // the output will be int or string?
        System.out.println("result = " + 1 + 2); // the output will be string not int!

        System.out.println("result = " + (1 + 2)); // but here will be int!

        System.out.println("Hello " + "World!"); // we can add two string

        // now we'll play with inputs
        // first we need to import a java.util.Scanner in line 1
        // create a scanner object
        Scanner input = new Scanner(System.in); // input is name of the variable we can name it any things we want!
        int x, y, z;

        // reading the value from keyboard!
        System.out.println("Enter the value of X: ");
        x = input.nextInt();
        System.out.println("Enter the value of Y: ");
        y = input.nextInt();

        z = x + y;
        System.out.println("the result of " + x + " + " + y + " is: "+ z);

        // reading the value from keyboard, but this time with double numbers
        Scanner number = new Scanner(System.in); // number is name of the variable we can name it any things we want!
        double a, b, c;

        // reading the value from keyboard!
        System.out.println("Enter the value of a: ");
        a = number.nextDouble();
        System.out.println("Enter the value of b: ");
        b = number.nextDouble();

        c = a + b;
        System.out.println("the result of " + a + " + " + b + " is: "+ c);

        // but what about String! we can use? yes, we can!
        Scanner string = new Scanner(System.in);
        String d, f, g;

        System.out.println("Enter a string: ");
        d = string.next();
        System.out.println("Enter a string: ");
        f = string.next();
        g = d + f;
        System.out.println(g);

        // what if the user input a full sentence?
        Scanner string1 = new Scanner(System.in);
        String h;

        System.out.println("Enter a string: ");
        h = string.next();
        System.out.println(h); // the output will be only first word!

        // we can store a full sentence? Yes, we can using nextLin.
        Scanner string2 = new Scanner(System.in);
        String k;
        System.out.println("Enter a string: ");
        k = string2.nextLine();
        System.out.println(k);
    }
}
