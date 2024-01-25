import java.util.Scanner;
public class Main{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Veg Pizza and 2 for Non-Veg Pizza");
		boolean choice = sc.nextInt() == 1 ? true : false;
		System.out.println("Enter 1 for Delux Pizza and 2 for Regular Pizza");
		boolean pizzaChoice = sc.nextInt() == 1 ? true : false;
		if(pizzaChoice){
			DeluxPizza basePizza = new DeluxPizza(choice);
			System.out.println("Would you like to take away ?\n");
			String takeAway = sc.nextLine();
			if(takeAway == "YES"){
				basePizza.takeAway();
			}
			basePizza.getbill();
			sc.close();
			return;
		}
		else{
			Pizza basePizza = new Pizza(choice);
			System.out.println("Would you like to add some Cheese ?");
			sc.nextInt();
			String cheese = sc.nextLine();
			if(cheese == "YES"){
				basePizza.addExtraCheese();
			}
			System.out.println("Would you like to add some Toppings ?");	
			String toppings = sc.nextLine();
			if(toppings == "YES"){
				basePizza.addExtraToppings();
			}
			System.out.println("Would you like to take away ?");
			String takeAway = sc.nextLine();
			if(takeAway == "YES"){
				basePizza.takeAway();
			}
			basePizza.getbill();
			sc.close();
			return;
		}
	}
}
