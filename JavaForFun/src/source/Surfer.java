package source;


import java.util.Scanner;

public class Surfer {

	public String getPlayerName() {
		return playerName;
	}

	public String setPlayerName(String playerName) {
		return this.playerName = playerName;
	}

	public double getCoins() {
		return coins;
	}

	public double setCoins(double coins) {
		return this.coins = coins;
	}

	public float getMeters() {
		return meters;
	}

	public float setMeters(float meters) {
		return this.meters = meters;
	}

	public int getMutiplier() {
		return mutiplier;
	}

	public int setMutiplier(int mutiplier) {
		return this.mutiplier = mutiplier;
	}
	
	private String playerName;
	private double coins;
	private float meters;
	private int mutiplier;


	public static void calculateScore(float meters , int multiplier) {
			Surfer sc = new Surfer();
			float ranMeters = sc.setMeters(meters);
			System.out.println("you inserted " + ranMeters + " as meters");
			int ranMultiplier = sc.setMutiplier(multiplier);
			System.out.println("you inserted " + ranMultiplier + " as multiplier");
			float totalScore = ranMeters * ranMultiplier;
			System.out.println("Total score is " +  totalScore);

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter meter ran: ");
		float meters = sc.nextFloat();
		
		System.out.println("Enter multiplier to calculate total score: ");
	
		int multiplier = sc.nextInt();
		calculateScore(meters, multiplier);
		
		

	}
}
