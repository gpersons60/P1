package P1;

public class Cow extends Animal{
	private static int cowCounter = 1;
	public Cow() {
		super();
		setMealAmount(20);
		setName("Cow" + cowCounter);
		cowCounter++;
	}
	
	public void sound() {
		if (getAlive() == true) {
			System.out.println("Moo!");
		}else 
			System.out.println("The dead do not make noises");
	}
	
	public void Milk() {
		System.out.println("Somehow, " + getName() + " is milking another cow");
	}
}
