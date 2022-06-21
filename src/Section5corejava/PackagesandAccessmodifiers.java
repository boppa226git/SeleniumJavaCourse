package Section5corejava;

public class PackagesandAccessmodifiers {

	public int publicvar=10;
	private int privatevar=20;
	protected int protectedvar=30;
	int dafacultvar=40;
	public static void main(String[] args) {
		
		PackagesandAccessmodifiers objx=new PackagesandAccessmodifiers();
		System.out.println(objx.privatevar);
		System.out.println(objx.protectedvar);
		System.out.println(objx.publicvar);
		System.out.println(objx.dafacultvar);

	}

}
