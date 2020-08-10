
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player = new Player();
		player.name = "Tim";
		player.hitPoints = 20;
		player.weapon = "Sword";
		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaining health is: "+player.hitPoints);
}

}
