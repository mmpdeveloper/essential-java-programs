import java.util.Scanner;

public class UltimateCalculatorBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*

         */

        System.out.println("What would you like to do? Enter 0 for Add, 1 for " +
                "Subtract, 2 for Divide, 3 for Multiply, 4 for Area of a Circle" +
                "5 for Celsius to Fahrenheit, 6 for Meters to Feet, " +
                "7 for Pounds to Kilograms, 8 for Modulo, 9 for Exponent Operations : ");
        byte option = input.nextByte();

        if (option == 0) {
            System.out.println("Enter a number: ");
            double add1 = input.nextFloat();
            System.out.println("Enter a second number: ");
            double add2 = input.nextFloat();
            double totalAdd = add1 + add2;
            System.out.println(add1 + " + " + add2 + " = " + totalAdd);
        }
        else if (option == 1){
            System.out.println("Enter a number: ");
            double sub1 = input.nextDouble();
            System.out.println("Enter a second number: ");
            double sub2 = input.nextDouble();
            double totalSub = sub1 - sub2;
            System.out.println(sub1 + " - " + sub2 + " = " + totalSub);
        }
        else if (option == 2) {
            System.out.println("Enter a number: ");
            double div1 = input.nextDouble();
            System.out.println("Enter a second number: ");
            double div2 = input.nextDouble();
            double totalDiv = div1 / div2;
            System.out.println(div1 + " / " + div2 + " = " + totalDiv);
        }
        else if (option == 3) {
            System.out.println("Enter a number: ");
            double mult1 = input.nextDouble();
            System.out.println("Enter a second number: ");
            double mult2 = input.nextDouble();
            double totalMult = mult1 * mult2;
            System.out.println(mult1 + " * " + mult2 + " = " + totalMult);
        }
        else if (option == 4) {
            System.out.println("Enter the radius: ");
            double radius1 = input.nextDouble();
            final double PI = 3.14159;
            double areaCircle = (radius1 * radius1) * PI;
            System.out.println(radius1 + " * " + "2 * 3.14159 = "  + areaCircle);
        }
        else if (option == 5) {
            System.out.println("Enter the temperature in Celsius: ");
            double celsius = input.nextDouble();;
            double celToFahren = (celsius * 1.8) + 32;
            System.out.println(celToFahren);
        }
        else if (option == 6) {
            System.out.println("Enter the length in Meters: ");
            double meters = input.nextDouble();;
            double metersToFeet = meters * 3.28084;
            System.out.println(metersToFeet);
        }
        else if (option == 7) {
            System.out.println("Enter the weight in Pounds: ");
            double pounds = input.nextDouble();
            final double massOfKilos = 2.205;
            double poundsToKilograms = pounds / massOfKilos; //divide mass by 2.205
            System.out.println(poundsToKilograms);
        }
        else if (option == 8) {
            System.out.println("Enter the dividend (initial number): ");
            double dividend = input.nextDouble();;
            System.out.println("Enter the divisor: ");
            double divisor = input.nextDouble();;
            double quotient = dividend/divisor;
            double moduloCalc = dividend - (quotient * divisor);
            System.out.println("The modulo of " + dividend + " and "
                    + divisor + " is " + moduloCalc);
        }
        else if (option == 9) {
            System.out.println("Enter the first number: ");
            double exp1 = input.nextDouble();;
            System.out.println("Enter the second number: ");
            double exp2 = input.nextDouble();;
            double expAns = Math.pow(exp1, exp2);
            System.out.println("The power of " + exp1 + " to "
                    + exp2 + " = " + expAns);
        }











    }
}
