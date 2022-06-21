package Section5corejavaotherpackage;

import Section5corejava.PackagesandAccessmodifiers;

public class PackagesandAccessmodifiersotherclassinheritance {

	
	public static void main(String[] args) {
		
		PackagesandAccessmodifiers objx=new PackagesandAccessmodifiers();
		//System.out.println(objx.privatevar);  //private is not accesible -
		//System.out.println(objx.protectedvar);//not accesible -
		System.out.println(objx.publicvar);
		//System.out.println(objx.dafacultvar);//not accesible -

	}

}
