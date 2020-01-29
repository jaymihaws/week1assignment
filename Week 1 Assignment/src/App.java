
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sodaPrice = 1.89;
		double pantsPrice = 98.99;
		
		int jaymisMoney = 15;
		int birthdayMoney = 100;
		
		int jaymisFriends = 48;
		int facebookFriends = 1107;
		
		int jaymisAge= 24;
		int husbandsAge = 28;
		
		
		String firstName = "Jaymi";
		String husbandsFirstName = "Simon";
				
		String LastName = "Haws";
		String husbandsLastName = "Haws";
		
		char middleInitial = 'N';
		char husbandsMiddleInitial = 'P';
		
		
		double moneyInWallet = jaymisMoney + birthdayMoney - sodaPrice;
		int friendsPerYear = jaymisFriends / jaymisAge;
		String fullName = firstName + " " + middleInitial + " " + LastName;
		
        System.out.println("My favorite soda costs $" + sodaPrice);
        System.out.println("My  favorite pants cost $" + pantsPrice);
        System.out.println("In my wallet, I have $" + jaymisMoney);
        System.out.println("In my wallet I have, $" + birthdayMoney + " left of my birthday money");
        System.out.println("I have " + jaymisFriends + " close friends");
        System.out.println("I have " + facebookFriends + " friends on facebook");
        System.out.println("I am " + jaymisAge + " years old");
        System.out.println("My husband is " + husbandsAge + " years old");
        System.out.println("My first name is " + firstName);
        System.out.println("My husbands first name is " + husbandsFirstName);
        System.out.println("My last name is " + LastName);
        System.out.println("My husbands last name is " + husbandsLastName);
        System.out.println("My middle initial is " + middleInitial);
        System.out.println("My husbands middle initial is " + husbandsMiddleInitial);
		System.out.println("After buying a soda I have $" + moneyInWallet + " left in my wallet");
		System.out.println("Per year, I make " + friendsPerYear + " close friends");
		System.out.println("My full name is " + fullName);
	}

}
