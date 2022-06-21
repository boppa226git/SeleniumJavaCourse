package Section5corejava;

public class PackagesandAccessmodifiersotherclass {

	
	public static void main(String[] args) {
		
		PackagesandAccessmodifiers objx=new PackagesandAccessmodifiers();
		//System.out.println(objx.privatevar);  //private is not accessible -
		System.out.println(objx.protectedvar);
		System.out.println(objx.publicvar);
		System.out.println(objx.dafacultvar);

	}

}
