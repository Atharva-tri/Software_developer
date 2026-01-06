import java.util.*;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double length;
        double breadth;
        double area;

        System.out.println("Enter length:");
        length = sc.nextDouble();

        System.out.println("Enter breadth:");
        breadth = sc.nextDouble();

        area = length * breadth;

        System.out.println("Area of Rectangle is: " + area);
    }
}
