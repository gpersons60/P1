package P1;

public class Llama extends Animal{
	private static int llamaCounter = 1;
	public Llama() {
		super();
		setMealAmount(9);
		setName("Llama" + llamaCounter);
		llamaCounter++;
	}
	
	public void sound() {
		if (getAlive() == true) {
			System.out.println("Hmm!");
		}else 
			System.out.println("The dead do not make noises");
	}
	
	public void Jump() {
		System.out.println(getName() + " has jumped");
	}
}

