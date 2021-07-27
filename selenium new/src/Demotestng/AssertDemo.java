package Demotestng;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertDemo {
	@Test
	public void tc( ) {
		String ac="Akanksha";
		String ex="Akanksha";
		Assert.assertEquals(ac, ex);
		System.out.println("Hello");
		List<Object> lstl=new ArrayList<Object>();
		lstl.add("akshata");
		lstl.add(122);
		lstl.add(13.33);
		lstl.add(true);
		
		List<Object> lst2=new ArrayList<Object>();
		lst2.add("akshata");
		lst2.add(122);
		lst2.add(13.33);
		lst2.add(true);
		
		Assert.assertEquals(lstl, lst2);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("ank", "unk");
		System.out.println("matched");
		sa.assertAll();
		
		
	}

}
