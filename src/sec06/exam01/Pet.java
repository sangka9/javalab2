package sec06.exam01;

public class Pet extends Animal{
	private String name;
	private int age;  // year
	private double weight;  // pounds
	
	//오버라이딩
	public String toString() {
		return ("Name: " + name + "Age: " + age + "years" + "\nWeight" + weight + " pounds");
	}
	
	public Pet(String initialName, int initialAge, double initialWeight, String iniGender) {
		super(iniGender);
		name = initialName;
		age = initialAge;
		weight = initialWeight;
		// 구현하시오
	}
	
	 // 오버로딩
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
		 
		// 구현 하시오.
	}
	
	public void setAge( int newAge) {
		age = newAge;
               // 구현하시오.
	}
	
	public void setWeight( double newWeight) {
		weight = newWeight;
	      // 구현하시오.
       }
	
	public String getName() {
		return name;
		// 구현하시오.
	}
	
	public int getAge() {
		return age;
		// 구현하시오.
	}
	
	public double getWeight() {
		return weight;
		// 구현하시오.
	}
	
}