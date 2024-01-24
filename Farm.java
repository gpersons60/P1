package P1;

public class Farm {
	private double availableFood;	
	Animal[] animals = {new Chicken(),new Cow(),new Llama(),new Llama()};
	
	public Farm() {
		setAvailableFood(1000);
	}
	public void makeNoise() {
		
	}
	public void feedAnimals() {
		
	}

	public double getAvailableFood() {
		return availableFood;
	}
	public void setAvailableFood(double availableFood) {
		this.availableFood = availableFood;	
	}
	public Animal[] getAnimals() {
		return animals;
	}
}
