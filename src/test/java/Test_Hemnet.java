import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Hemnet_Parts.Index;
import Hemnet_Parts.StartPage;



public class Test_Hemnet {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	
	}
	
	@AfterClass
	public static void afterClass(){
		Index.killDriver();
	}

	@Test
	public void test() {
		
		StartPage start = new StartPage();
		start.login();
		
		
		
	}

}
