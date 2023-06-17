package preTraining;

public class Dog implements Animal {

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void animalSound() {
		System.out.println("The dog says: bow bow");
		
	}
	@Override
	public void sleep() {
		System.out.println("dog is sleeping");	
	}

}
