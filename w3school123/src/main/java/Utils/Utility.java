package Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void Capturescreenshot(WebDriver driver,String testid) throws IOException{
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		SimpleDateFormat mydate = new SimpleDateFormat("dd MM yyyy HH mm ss");
		
		Date d = new Date();
		String s1 = mydate.format(d);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\app\\abc"+s1+".png");
		FileHandler.copy(src, des);

}
}