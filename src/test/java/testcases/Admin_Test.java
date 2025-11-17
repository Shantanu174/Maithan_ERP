package testcases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.BaseTest;
import page_object_model.Admin_POM;


public class Admin_Test extends BaseTest {
	@Test
public void methodizeclick1() throws IOException{
		
		Admin_POM page1 = new Admin_POM(driver);
		page1.clcikmethodize();
		page1.clickadminleftmenu();
		page1.clickrolemngmntbtn();
		page1.clickprocdrop();
		page1.handlePermissionAlert();
		
		
		// Step 2: Get the visible User count
        String userCount = page1.getUserCount1();
        System.out.println("Visible User Count on Dashboard: " + userCount);

        // Step 3: (Optional) Validate the count is greater than zero
        try {
            int count = Integer.parseInt(userCount);
            Assert.assertTrue(count > 0, "User count should be greater than 0");
        } catch (NumberFormatException e) {
            Assert.fail("User count is not a valid number: " + userCount);
        }

        

        System.out.println("✅ Test Completed Successfully!");
    }
	}
