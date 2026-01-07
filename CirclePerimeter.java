import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        double perimeter = 2 * Math.PI * r;

        System.out.println("Perimeter of circle = " + perimeter);
        sc.close();
    }
}
