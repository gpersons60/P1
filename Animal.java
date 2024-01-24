package P1;

public class Animal {
	private String name;
	private double energy;
	private boolean alive;
	private double mealAmount;
	private double x;
	private double y;
	private double speedX;
	private double speedY;
	
	public Animal() {	
		setEnergy(100);
		setSpeedX(1);
		setSpeedY(1);
	}
	
	public String toString() {
		return getName() + ": " + getAlive() + " at (" + getX() + " , " + getY() + ") Energy = " + getEnergy();
	}
	
	public void move() {
		if (getAlive() == true) {
			setX(getX()+getSpeedX());
			setY(getY()+getSpeedY());
			setEnergy(getEnergy() - .1);
		} else
			System.out.println(getName() + " can't move. It is dead!");
	}
	public void speak() {
		if(getAlive() == true) {
			System.out.println(getName() + " says : Hi!");
		}else 
			System.out.println("The dead do not speak...");
	}
	public void sound() {
		if (getAlive() == true) {
			System.out.println("uknown sound");
		}
	}
	public double eat() {
		double x;
		double foodEaten = 0;
		if(getAlive() == false) {
			System.out.println(getName() + " is dead!");
		}else if(getEnergy() == 100) {
			System.out.println(getName() + " didn't eat becaue it is full!");
		}else 
			setEnergy(getEnergy()+getMealAmount());
			if (getEnergy() > 100) {
				x = getEnergy() - 100;
				foodEaten = getMealAmount() - x;
				setEnergy(100);
			}
		System.out.println(getName() + " ate " + foodEaten + " units, now it is full!");
		return foodEaten;

	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
		if (getEnergy() <= 17) {
			System.out.println(getName() + " is starving!");
		}
		if (getEnergy() <= 50 && getEnergy() >= 17) {
			System.out.println(getName() + " is hungry!");
		}
	}

	public double getMealAmount() {
		return mealAmount;
	}

	public void setMealAmount(double mealAmount) {
		this.mealAmount = mealAmount;
		if (getMealAmount() < 0) {
			setMealAmount(0);
		}else if(getMealAmount() > 100) {
			setMealAmount(100);
		}
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getSpeedX() {
		return speedX;
	}

	public void setSpeedX(double speedX) {
		this.speedX = speedX;
	}

	public double getSpeedY() {
		return speedY;
	}

	public void setSpeedY(double speedY) {
		this.speedY = speedY;
	}
	public boolean getAlive() {
		if (getEnergy() > 0) {
			return true;
		}else
		return false;
	}
	
}
