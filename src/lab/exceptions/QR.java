package lab.exceptions;

import java.io.PrintWriter;
import java.util.Scanner;

public class QR {
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    Scanner in = new Scanner(System.in);

    pen.print("Enter first coefficient: ");
    pen.flush();
    double a = in.nextDouble();

    pen.print("Enter second coefficient: ");
    pen.flush();
    double b = in.nextDouble();

    pen.print("Enter third coefficient: ");
    pen.flush();
    double c = in.nextDouble();

    Quadratic q = new Quadratic(a, b, c);
    try {
      double smallerRoot = q.smallerRoot();
      double valueAtSmallerRoot = q.evaluate(smallerRoot);
      pen.println("The smaller root of this quadratic is " + smallerRoot);
      pen.println("The value of the quadratic at this root is " + valueAtSmallerRoot);
    } catch (DivideByZeroException f) {
      pen.println("Cannot calculate linear roots; first coefficient must be greater than 0.");
    } catch (Exception e) {
      pen.println("Sorry, I could not compute a root.");
    } // catch (Exception)


    pen.close();
    in.close();
  }
}
