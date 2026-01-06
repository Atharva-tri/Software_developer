 import java.util.Scanner;
public class RectanglePerimeter {
   public static void main( String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter length:");
    int length= sc.nextInt();

    System.out.println("Enter width");
    int width= sc.nextInt();

    int perimeter= 2 * (length + width);

    System.out.println("Perimeter of Rectangle is:" +perimeter);

    sc.close();


   }

}
