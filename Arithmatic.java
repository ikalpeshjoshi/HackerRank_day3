import java.util.*;

public class Arithmatic{
private static double findMealTotal(double mealCost,
        int tipPercent, int taxPercent) {
    double tipTotal = mealCost * tipPercent / 100;
    double taxTotal = mealCost * taxPercent / 100;

    return mealCost + tipTotal + taxTotal;
}

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double mealCost = in.nextDouble();
    int tipPercent = in.nextInt();
    int taxPercent = in.nextInt();
    in.close();

    double mealTotal = findMealTotal(mealCost, tipPercent,
        taxPercent);
    System.out.println(Math.round(mealTotal));
}
}


*/Alternate Code /*

import java.util.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        double tip= ((mealCost*tipPercent)/100);
        double tax=((mealCost*taxPercent)/100);
        double numberToRoundHere= tip + tax + mealCost;
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(numberToRoundHere);
      
        // Print your result
        System.out.println(totalCost);
    }
}
