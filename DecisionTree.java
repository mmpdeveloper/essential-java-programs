import java.util.Scanner;

public class DecisionTree {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Are Your Parents Visiting? Enter 1 for Yes or 2 for No: ");
    int parentsVisiting = input.nextInt();

    System.out.print("Is The Weather Good? Enter 1 for Good or 2 for Bad: ");
    int goodWeather = input.nextInt();

	System.out.print("Are You Rich? Enter 1 for Rich or 2 for Poor: ");
    int isRich = input.nextInt();

   if (parentsVisiting == 1 && goodWeather == 2)
   	System.out.println("Stay in");
   else if (parentsVisiting == 1 && goodWeather == 1)
   	System.out.println("Go to the Cinema");
   else if (parentsVisiting == 2 && isRich == 2)
   	System.out.println("Stay in");
   else if (parentsVisiting == 2 && goodWeather == 1 && isRich == 1)
   	System.out.println("Go Shopping");
   else
   		System.out.println("Go to the cinema");

   	}
}