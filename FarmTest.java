package P1;

public class FarmTest {

	public static void main(String[] args) {
		Animal Cow = new Animal();
		System.out.println(Cow.toString());
		Cow.move();
		Cow.setEnergy(15);
		System.out.println(Cow.toString());
	}

}
