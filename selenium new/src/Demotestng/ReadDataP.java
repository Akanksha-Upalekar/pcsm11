package Demotestng;

public class ReadDataP {

	@Test(DataProviderClass=demoTestng.ReadDataDemo.class,dataProvider="read")
	public void tc(String user,String pass) {
		System.out.println(user + " "+pass);
		System.setProperty("webdriver.chrome.driver", "./)
	}
	
	
	
}
