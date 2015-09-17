package sec06.exam01;

public class Pet extends Animal{
	private String name;
	private int age;  // year
	private double weight;  // pounds
	
	//�������̵�
	public String toString() {
		return ("Name: " + name + "Age: " + age + "years" + "\nWeight" + weight + " pounds");
	}
	
	public Pet(String initialName, int initialAge, double initialWeight, String iniGender) {
		super(iniGender);
		name = initialName;
		age = initialAge;
		weight = initialWeight;
		// �����Ͻÿ�
	}
	
	 // �����ε�
	public Pet(String initialName) {
		name = initialName;
		age = 0;
		weight = 0;
	}
		
	public Pet(int initialAge) {
		name = "No name yet. ";
		weight = 0;
		if (initialAge < 0) {
			System.out.println("Error: Negative age.");
			System.exit(0);
		} else
			age = initialAge;
	}
	
	public Pet() {
		name = "No name yet.";
		age = 0;
		weight = 0;
	}
	
	public void set(String newName, int newAge, double newWeight) {
		name = newName;
		age = newAge;
		weight = newWeight;
		 
		// ���� �Ͻÿ�.
	}
	
	public void setAge( int newAge) {
		age = newAge;
               // �����Ͻÿ�.
	}
	
	public void setWeight( double newWeight) {
		weight = newWeight;
	      // �����Ͻÿ�.
       }
	
	public String getName() {
		return name;
		// �����Ͻÿ�.
	}
	
	public int getAge() {
		return age;
		// �����Ͻÿ�.
	}
	
	public double getWeight() {
		return weight;
		// �����Ͻÿ�.
	}
	
}