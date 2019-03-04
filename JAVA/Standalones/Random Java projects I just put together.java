public double absoluteValue(double a){
	if (a < 0){
		return a * -1;
	}
	else{
		return a;
	}
}

public double calculateTip(double cost){
	double secondCost = cost * 0.15; 
	return secondCost;
}

public String nameTagText(String name){
	nametag = "Hello my name is: " + name;
	return nametag;
}




public double fahrenheitToCelsius(double f){
	c = ((f - 32) * (5/9));
	return c;
}

public void printTemperature(double f){
	fahrenhietValue = "F: " + f;
	c = fahrenheitToCelsius(f);
	calsiusValue = "C: " + c;
}




public int dice(int sides){
	double diceRoll = (math.random() * sides) + 1;
	return (int) diceRoll;
}

public int monopolyRoll(){
	int diceRollOne = dice(6);
	int diceRollTwo = dice(6);
	if (diceRollOne == diceRollTwo){
		int diceRollThree = dice(6);
		int diceRollFour = dice(6);
		int totalDouble = diceRollThree + diceRollFour;
		return totalDouble;
	}
	else{
		total = diceRollOne + diceRollTwo;
		return total;
	}

}


/*public double eachProduct(double money, double cost){
	double checker = math.max(money, cost);
	if (checker > money){
		return "You cannot afford this!";
	}
	else{
		double remaning = money - cost;
		return remaning; 
	}
}*\
import java.util.Scanner;

public void shopping(){
	System.out.println("How many stores would you like to go to for your shopping and how meny products from each store in ONE day?")
	
	Scanner locationReader= new Scanner(System.in);  // creates object and reading off systems.in
	System.out.println("How many stores would you like to hit: "); //tells some guy to input double into the command line
	int numOfStores = locationReader.nextInt(); // scans the next token of the input as a double and sets it to a 
	locationReader.close(); //tells it so stop reading for inputs
	
	Scanner moneyReader = new Scanner(System.in);  
	System.out.println("How much money for your trip: "); 
	double money = locationReader.nextDouble(); 
	moneyReader.close(); 
	
	int counter = 0;
	int counterTwo = 0;

	while (counter < numOfStores){
		Scanner productReader = new Scanner(System.in); 
		System.out.println("Number Products you would like to buy: "); 
		int numOfProducts = productReader.nextInt();  
		productReader.close(); 
		counter++;
		while (counterTwo < numOfProducts){
			Scanner costReader = new Scanner(System.in); 
			System.out.println("Cost of each product in your list: "); 
			double cost = productReader.nextDouble(); 
			productReader.close(); 
			counterTwo++;
		}
		
	}	


	

}

