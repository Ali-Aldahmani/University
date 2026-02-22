
import java.util.Scanner; 
public class method {
    public static void main(String[] args) {
        loop1();
        System.out.println("--------------");
        loop2();
        System.out.println("--------------");
        loop3(0, 10);
        System.out.println("--------------");
        loop3(11, 20);

        int area = areaRectangle(5, 10);
        System.out.println("The area of the rectangle is: " + area);

        Scanner rectangle = new Scanner(System.in);
        System.out.println("Enter the value of rectangle hight: ");
        int rectangleHight = rectangle.nextInt();
        System.out.println("Enter the value of rectangle width: ");
        int rectangleWidth = rectangle.nextInt();
        System.out.println("The area of rectangle is: " + areaRectangle(rectangleHight, rectangleWidth));
    }
    public static void loop1() {
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
    public static void loop2() {
        for (int i = 11; i <= 20; i++){
            System.out.println(i);
        }
    }
    public static void loop3(int start, int stop) {
        for (; start <= stop; start++){
            System.out.println(start);
        }
    }
    public static int areaRectangle(int hight, int width) {
        return hight * width;
    }
}
