package org;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WynkMusic {
	
	
	WebDriver driver;
	JavascriptExecutor js;
	
	
			
	@BeforeSuite
	public void launchBrowser() {

		
		System.setProperty("Webdriver.chrome.driver","D:\\New folder\\Selenium\\driver\\chromedriver.exe");
	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test(priority=1)
	public void urlLaunched() {

		//Launch URL
		driver.get("https://wynk.in/music/album/online/pc_MCPL0034");
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public void screen1() throws InterruptedException, IOException {
		Thread.sleep(2000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File des=new File("D:\\New folder\\Selenium\\screenshot\\Browser.png");
        FileHandler.copy(src, des);
	}
	
	@Test(priority=3)
	public void login() throws InterruptedException, IOException {
		//click to login
		 driver.findElement(By.xpath("//div[text()='Login']")).click();
		 Thread.sleep(2000);
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File des=new File("D:\\New folder\\Selenium\\screenshot\\login.png");
	        FileHandler.copy(src, des);
	   
		 //enter phnumber
		 driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"))
		 .sendKeys("9025728882");
		 Thread.sleep(2000);
	
		 //send otp btn clk
		 driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		 Thread.sleep(15000);
       
	}
	@Test(priority=4)
	public void searchSong() throws InterruptedException, IOException {
		 //search click
		 driver.findElement(By.xpath("//input[@placeholder='Search Songs']")).click();
		 Thread.sleep(3000);
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File des=new File("D:\\New folder\\Selenium\\screenshot\\search first .png");
	        FileHandler.copy(src, des);
		 
		 //search to enter the songs
		 driver.findElement(By.xpath("(//input[@type='search'])[1]"))
         .sendKeys("Leo movie  songs",Keys.ENTER);
		 Thread.sleep(20000);
	}
	@Test(priority=5)
	public void playPauseSong() throws InterruptedException, IOException {
		 //click and play the song
		 driver.findElement(By.xpath("//h5[text()='Naa Ready (From \"Leo\")']")).click();
		 Thread.sleep(20000);File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File des=new File("D:\\New folder\\Selenium\\screenshot\\search secound.png");
	        FileHandler.copy(src, des);
		 
		 //pause the song
		 driver.findElement(By.xpath("//button[@title='Pause']")).click();
		 Thread.sleep(3000);
	}
	@Test(priority=6)
	public void nextSong() throws InterruptedException, IOException {
		 //search to next song
		 driver.findElement(By.xpath("//input[@placeholder='Search Songs']")).click();
		 Thread.sleep(3000);
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File des=new File("D:\\New folder\\Selenium\\screenshot\\search thrid.png");
	        FileHandler.copy(src, des);
		 
		 //Enter the song name in search button
		  driver.findElement(By.xpath("//input[@data-testid='searchInputField']"))
		  .sendKeys("Singappenney",Keys.ENTER);
		  Thread.sleep(20000);
	}
	@Test(priority=7)
	public void secondSong() throws InterruptedException, IOException {
		  //search on click
		  driver.findElement(By.xpath("//h5[text()='Singappenney (From \"Bigil\")']")).click();
		  Thread.sleep(20000);File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File des=new File("D:\\New folder\\Selenium\\screenshot\\song select.png");
	        FileHandler.copy(src, des);
		  
		  //stop the song
		  driver.findElement(By.xpath("//button[@data-testid='playerPause']")).click();
		
	}
		@Test(priority=8)
		public void thirdSong() throws InterruptedException, IOException {
		  //search to another song
		  driver.findElement(By.xpath("//input [@type='search']")).click();
		  Thread.sleep(3000);File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        File des=new File("D:\\New folder\\Selenium\\screenshot\\selected.png");
	        FileHandler.copy(src, des);
		  
		  //click on song
		 driver.findElement(By.xpath("//input[@title='Search']"))
		 .sendKeys("Ranjithame",Keys.ENTER);
		 Thread.sleep(3000);
		  
		  
		  //Enter the song name in search button
		  driver.findElement(By.xpath("(//h5[@data-testid='searchResultTitle'])[1]")).click();
		  Thread.sleep(20000);
		 		
		 
		 
	}
        
}