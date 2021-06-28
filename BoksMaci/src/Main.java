public class Main {
	public static void main (String[] args) {
		
		Fighter f1 = new Fighter (name: "A" + damage: 10 + health: 120 + weight: 100);
		Fighter f2 = new Fighter (name: "B" + damage: 20 + health: 85 + weight: 85);	
		Match match= new Match (f1,f2, minWeight: 90, maxWeight: 95); 
		match.run();
	}
	
}