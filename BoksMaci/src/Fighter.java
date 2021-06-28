public class Fighter {
	
	String name;
	int damage;
	int health;
	int weight;
	
	public Fighter(String name, int damage,int health, int weight) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.weight = weight;
	}

	int hit (Fighter foe) {
		System.out.println(this.name + "=> A " + foe.name + " => B " + this.damage + " hasar vurdu. ");
		return foe.health - this.damage;
	}
	
	 public boolean dodge() {
         double randomValue = Math.random() * 100;  //0.0 to 99.9
         return randomValue <= this.dodge;
     }
}