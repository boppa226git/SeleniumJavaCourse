package Superkeyword;

public class Test {

	public static void main(String[] args) {
		Animal objanimal=new Animal();
		Dog objdog=new Dog();
		
		System.out.println(objanimal.weight);
		System.out.println(objdog.weight);
		objanimal.sound();
		objdog.sound();
		//construcor sequence from parent to child
		
		objdog.sound();
		Dog objdog1=new Dog();
		

	}

}
