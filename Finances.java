import java.util.Scanner;

public class Finances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*This is a program to keep track of my finances
        other calculations, can i afford this?
        practice using ternary operators
        practice using switch statements
        practice using Math.random()
        code a loop to add 1 to total purchases for every purchase i make


         */

        double $currentTotal = 2564.00; //2564 is a literal
        double $totalPurchases = 0;
        double newTotal = 0;

        System.out.println("What would you like to do?: Enter 1 for " +
                "new purchase, Enter 2 to check affordability: ");
        byte userChoice = input.nextByte();



        System.out.println("Enter a purchase amount: ");
        double newPurchase1 = input.nextDouble();
        newTotal = $currentTotal - newPurchase1;
        ++$totalPurchases;
        System.out.println("You have made " + $totalPurchases + ". Your new total" +
                " is " + newTotal);

        System.out.println("Enter a purchase amount: ");
        double newPurchase2 = input.nextDouble();
        newTotal = newTotal - newPurchase2;
        ++$totalPurchases;
        System.out.println("You have made " + $totalPurchases + ". Your new total" +
                " is " + newTotal);
        //Example of Casting
        System.out.println((int)$currentTotal);
        //System.out.println((double)$currentTotal); any double value can be rounded up using (int)(x+0.5)


        String purchasesSoFar;
        //use if statement to extract purchases so far from above
        //System.out.println("Purchases so far include: " + newPurchase1);





    }
}
