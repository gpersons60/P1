package P1;

public class Chicken extends Animal{
	private static int ChickenCounter = 1;
	public Chicken() {
		super();
		setMealAmount(5);
		setName("Chicken" + ChickenCounter);
		ChickenCounter++;
	}
	
	public void sound() {
		if (getAlive() == true) {
			System.out.println("Cluck!");
		}else 
			System.out.println("The dead do not make noises");
	}
	
	public void Swim() {
		System.out.println(getName() + " is swimming");
	}
}

