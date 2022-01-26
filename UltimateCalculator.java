import java.util.Scanner;

public class UltimateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        Includes:
            Calculator
            Practice where if they get the answer wrong, they get 2 tries until the calculator
            goes back and computes the operation for them.
            while (true) {
                        System.out.println("What is " + practiceSubNumber1 + "-" + practiceSubNumber2 + "?");
                        int userSubAnswer = input.nextInt();
                        System.out.println();
                    }
         */

        System.out.println("What would you like to do?\n Enter 0 for Add\n 1 for " +
                "Subtract\n 2 for Divide\n 3 for Multiply\n 4 for Area of a Circle\n " +
                "5 for Celsius to Fahrenheit\n 6 for Meters to Feet\n " +
                "7 for Pounds to Kilograms\n 8 for Modulo\n 9 for Exponent Operations\n" +
                "10 for Practice : ");
        byte option = input.nextByte();

        if (option == 0) {
            System.out.println("Enter a number: ");
            double add1 = input.nextFloat();
            System.out.println("Enter a second number: ");
            double add2 = input.nextFloat();
            long totalAdd = (long) (add1 + add2);
            System.out.println(add1 + " + " + add2 + " = " + totalAdd);
        } else if (option == 1) {
            System.out.println("Enter a number: ");
            double sub1 = input.nextDouble();
            System.out.println("Enter a second number: ");
            double sub2 = input.nextDouble();
            double totalSub = sub1 - sub2;
            System.out.println(sub1 + " - " + sub2 + " = " + totalSub);
        } else if (option == 2) {
            System.out.println("Enter a number: ");
            double div1 = input.nextDouble();
            System.out.println("Enter a second number: ");
            double div2 = input.nextDouble();
            double totalDiv = div1 / div2;
            System.out.println(div1 + " / " + div2 + " = " + totalDiv);
        } else if (option == 3) {
            System.out.println("Enter a number: ");
            double mult1 = input.nextDouble();
            System.out.println("Enter a second number: ");
            double mult2 = input.nextDouble();
            double totalMult = mult1 * mult2;
            System.out.println(mult1 + " * " + mult2 + " = " + totalMult);
        } else if (option == 4) {
            System.out.println("Enter the radius: ");
            double radius1 = input.nextDouble();
            final double PI = 3.14159;
            double areaCircle = (radius1 * radius1) * PI;
            System.out.println(radius1 + " * " + "2 * 3.14159 = " + areaCircle);
        } else if (option == 5) {
            System.out.println("Enter the temperature in Celsius: ");
            double celsius = input.nextDouble();
            ;
            double celToFahren = (celsius * 1.8) + 32;
            System.out.println(celToFahren);
        } else if (option == 6) {
            System.out.println("Enter the length in Meters: ");
            double meters = input.nextDouble();
            ;
            double metersToFeet = meters * 3.28084;
            System.out.println(metersToFeet);
        } else if (option == 7) {
            System.out.println("Enter the weight in Pounds: ");
            double pounds = input.nextDouble();
            final double massOfKilos = 2.205;
            double poundsToKilograms = pounds / massOfKilos; //divide mass by 2.205
            System.out.println(poundsToKilograms);
        } else if (option == 8) {
            System.out.println("Enter the dividend (initial number): ");
            double dividend = input.nextDouble();
            ;
            System.out.println("Enter the divisor: ");
            double divisor = input.nextDouble();
            ;
            double quotient = dividend / divisor;
            double moduloCalc = dividend - (quotient * divisor);
            System.out.println("The modulo of " + dividend + " and "
                    + divisor + " is " + moduloCalc);
        } else if (option == 9) {
            System.out.println("Enter the first number: ");
            double exp1 = input.nextDouble();
            ;
            System.out.println("Enter the second number: ");
            double exp2 = input.nextDouble();
            ;
            double expAns = Math.pow(exp1, exp2);
            System.out.println("The power of " + exp1 + " to "
                    + exp2 + " = " + expAns);

            //while Loop practice
        } else if (option == 10) {
            int method = (int) (Math.random() * 10);
            if (method == 0) {
                int practiceAddNumber1 = (int) (Math.random() * 100);
                int practiceAddNumber2 = (int) (Math.random() * 100);
                int correctAddAnswer = practiceAddNumber1 + practiceAddNumber2;
                while (true) {
                    System.out.println("What is " + practiceAddNumber1 + " + " + practiceAddNumber2 + "?");
                    int userAddAnswer = input.nextInt();
                    System.out.println(userAddAnswer);
                    if (userAddAnswer != correctAddAnswer)
                        System.out.println("Incorrect");
                    else {
                        System.out.println("Correct");
                        break;
                    }
                }
            }
            else if (method == 1) {
                    int practiceSubNumber1 = (int) (Math.random() * 100);
                    int practiceSubNumber2 = (int) (Math.random() * 100);
                    int correctSubAnswer = practiceSubNumber1 - practiceSubNumber2;
                    int i;
                    for (i = 0; i < 100; i++) {
                        System.out.println("Let's practice Subtraction! What is ");
                    }


            }
            if (method == 2) {
                System.out.println("test2");
            }
            if (method == 3) {
                System.out.println("test3");
            }
            if (method == 4) {
                System.out.println("test4");
            }
            if (method == 5) {
                System.out.println("test5");
            }
            if (method == 6) {
                System.out.println("test6");
            }
            if (method == 7) {
                System.out.println("test6");
            }
            if (method == 8) {
                System.out.println("test6");
            }
            if (method == 9) {
                System.out.println("test6");
            }



        }




    }
}