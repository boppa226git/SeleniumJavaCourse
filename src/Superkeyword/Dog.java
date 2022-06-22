package Superkeyword;

public class Dog extends Animal {
	int weight=20;
	Dog()
	{
		System.out.println("dog construtor");
	}
	void sound()
	{
	
		super.sound();
		System.out.println("dog sound");
		System.out.println(weight);
		System.out.println(super.weight);
		
	}


}
