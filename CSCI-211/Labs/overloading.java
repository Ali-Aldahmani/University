public class overloading {
    public static void main(String[] args) {
        System.out.println("The area is: " + rectangle(15, 10));
        System.out.println("The area is: " + rectangle(15.5, 10.5));
        System.out.println("The area is: " + square(15));
        System.out.println("The area is: " + square(15.5));
    }
    public static int rectangle(int hight, int width) {
        return hight * width;
    }
    public static double rectangle(double hight, double width) {
        return hight * width;
    }
    public static int square(int side) {
        return side * side;
    }
    public static double square(double side) {
        return side * side;
    }
}
