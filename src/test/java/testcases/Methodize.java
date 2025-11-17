package testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import Base.BaseTest;
import page_object_model.Methodize_Page;


public class Methodize extends BaseTest{
	
	@Test
	public void methodizeclick1() throws IOException{
		
		Methodize_Page page1 = new Methodize_Page(driver);
		page1.clcikmethodize();
	}
	
	
	

}
