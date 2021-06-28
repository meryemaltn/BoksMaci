public class Match {
	
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	Match (Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.maxWeight = maxWeight;
		this.minWeight = minWeight;
	}
	
	void run() { 
		
		if (isCheck()) {
		while (this.f1.health > 0 && this.f2.health > 0) {
			this.f2.health = this.f1.hit(this.f2);
			System.out.println(this.f2.health);
			break;
			}
		}
		else {
		System.out.println("Sporcularýn sikletleri uymuyor.");
		}
	}
	boolean isCheck() {
		return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
}
	
	  public boolean isWin() {
          if (f1.health == 0) {
              System.out.println("Maçý Kazanan : " + f2.name);
              return true;
          } else if (f2.health == 0) {
              System.out.println("Maçý Kazanan : " + f1.name);
              return true;
          }

          return false;
      }

      public void printScore() {
          System.out.println("------------");
          System.out.println(f1.name + " Kalan Can \t:" + f1.health);
          System.out.println(f2.name + " Kalan Can \t:" + f2.health);
      }
  }



