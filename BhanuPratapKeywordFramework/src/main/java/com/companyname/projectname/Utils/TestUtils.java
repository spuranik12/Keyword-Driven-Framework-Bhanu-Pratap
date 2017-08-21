package com.companyname.projectname.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

public class TestUtils extends Resources
{
	public static String now(String format) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat fm = new SimpleDateFormat();
		return fm.format(cal.getTime());
	}
	
	public static void getScreenShot(String fileName) throws IOException {
		File outputFile = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(outputFile,new File(System.getProperty("user.dir")+"//src//main//java//com//companyname//projectname//Screenshot"+fileName+".jpg"));
	}
}
