
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car avenger = new Car();
		Car porsche = new Car();
		porsche.setModel("Dodge");
		
		BankAccount moneyBags = new BankAccount(1000000, 500.00, "will", "willpghfan@gmail.com", "412-807-9473");
		moneyBags.depositFunds(50.00);
		moneyBags.withdrawFunds(700);
		moneyBags.withdrawFunds(30.25);
		
	}

}
