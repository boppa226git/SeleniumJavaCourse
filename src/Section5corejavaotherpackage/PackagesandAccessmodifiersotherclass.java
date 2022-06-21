package Section5corejavaotherpackage;

import Section5corejava.PackagesandAccessmodifiers;

public class PackagesandAccessmodifiersotherclass extends PackagesandAccessmodifiers {

	
	public static void main(String[] args) {
		
		PackagesandAccessmodifiersotherclass objx=(PackagesandAccessmodifiersotherclass) new PackagesandAccessmodifiers();
		//System.out.println(objx.privatevar);  // not accesible -
		System.out.println(objx.protectedvar);
		System.out.println(objx.publicvar);
		//System.out.println(objx.dafacultvar);//not accesible -

	}

}
