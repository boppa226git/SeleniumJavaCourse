package Overridingwebdriver;

public class Test extends Base {

	public static void main(String[] args) {
		
	String browsername="Firefox";
	Test objbase=new Test();
	Webdriver driver=objbase.getbrowserInstant(browsername);

driver.click();
driver.gettext();
driver.sendkeys();
	}

}
