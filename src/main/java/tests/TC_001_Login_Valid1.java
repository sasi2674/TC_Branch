package tests;

import java.util.ArrayList;

import org.testng.annotations.Test;

import ExtentReports.ExtentTestManager;
import pages.Dashboard;
import utils.Excel_Read_Write;
import utils.Testdata_Path;

public class TC_001_Login_Valid1 extends BaseTest {

	String Class_Name = this.getClass().getCanonicalName();
	Excel_Read_Write Obj_Excel_Read_Write = new Excel_Read_Write();

	@Test(priority = 0, description = "Login Testcase 01")
	public void Invalid_Login_Test() throws Exception {

		String Test_Name = new Throwable().getStackTrace()[0].getMethodName();

		ExtentTestManager.startTest(Class_Name, Test_Name, "Login Test 01 with null data.");

		Login.App_Launch("https://azrscoccwebuiqa01.azurewebsites.net/").Login_UserName_Text("").Login_Password_Text("")
				.Login_Submit_Btn_Invalid().Verify_Error_Msg("Incorrect Username/Password");

	}

}