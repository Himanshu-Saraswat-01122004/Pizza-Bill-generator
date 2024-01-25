 public class Pizza {
	private int price;
	private boolean veg;
	private int basePizzaPrice;
	public Pizza(boolean veg){
		this.veg = veg;
		if(this.veg){
			this.price = 120;
		} else {
			this.price = 300;
		}
		basePizzaPrice = this.price;
	}
	private int extraCheese = 20;
	private int extratoppings = 30;
	private int backpackPrice = 30;
	boolean isExcheese, isExtoppings, isbackpack;
	public void getPizzaPrice(){
		System.out.println(this.price);
	} 
	public void addExtraCheese(){
		isExcheese = true;
		this.price += extraCheese;	
	}
	public void addExtraToppings(){
		isExtoppings = true;
		this.price += extratoppings;	
	}
	public void takeAway(){
		isbackpack = true;
		this.price += backpackPrice;	
	}
	public void getbill(){
		String bill = "";
		System.out.println("Pizza; "+basePizzaPrice);
		if(isExcheese){
			bill += "Extra Cheese added: "+extraCheese+"\n";
		}
		if(isExtoppings){
			bill += "Extra toppings addedL: "+extratoppings+"\n";
		}
		if(isbackpack){
			bill += "Take Away: " +backpackPrice+"\n";
		}
		bill += "Bill: "+this.price+"\n";
		System.out.println(bill);
		
	}
	
}
