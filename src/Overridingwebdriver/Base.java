package Overridingwebdriver;

public class Base {
	public Webdriver getbrowserInstant(String browsername)
	{
		if(browsername.equalsIgnoreCase("firefox"))
				return new Firefox();
		else
			//if(browsername.equalsIgnoreCase("Chrome")
					return new Chrome();
				
	}

}
