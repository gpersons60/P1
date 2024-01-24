package P1;

public class Animal {
	public void speak() {
		if(getAlive() == true) {
			System.out.println(getName() + " says : Hi!");
		}
	}
	public void sound() {
		if (getAlive() == true) {
			System.out.println("uknown sound");
		}
	}
	public double eat() {
		double x;
		double foodEaten;
		if(getAlive() == false) {
			System.out.println(getName() + " is dead!");
		}else if(getEnergy == 100) {
			System.out.println(getName() + " didn't eat becaue it is full!");
		}else 
			setEnergy(getEnergy()+getMealAmount());
			if (getEnergy() > 100) {
				x = getEnergy() - 100;
				foodEaten = getMealAmount() - x;
				System.out.println(getName() + " ate " + foodEaten + " units, now it is full!");
				return foodEaten;
			}
		
	}
}

