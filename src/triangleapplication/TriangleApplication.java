package triangleapplication;

import java.util.Scanner;

/**
 *
 * @author Eric
 */
public class TriangleApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Enter the length of the first lateral:(0 to exit)");
            double lateral1 = scanner.nextDouble();
            if(lateral1==0)
            {
               return;
            }
            System.out.println("Enter the length of the second lateral:");
            double lateral2 = scanner.nextDouble();
            System.out.println("Enter the length of the third lateral:");
            double lateral3 = scanner.nextDouble();
            Triangle triganle = new Triangle(lateral1, lateral2, lateral3);
            TriangleType tt = triganle.getTriangleType();
            System.out.println("Triangle type is:");
            System.out.println(tt);
        }
    }
}
