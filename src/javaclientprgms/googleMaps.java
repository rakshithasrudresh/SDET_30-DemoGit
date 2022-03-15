package javaclientprgms;

public class googleMaps {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver d=new FirefoxDriver();
			d.get("https://www.google.com/maps");
			Thread.sleep(2000);
			
			d.findElement(By.xpath("//img[@class='xoLGzf-T3iPGc-icon']")).click();
			Thread.sleep(2000);
			
			
			d.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @spellcheck='false' and @placeholder='Choose starting point, or click on the map...']")).sendKeys("Bengaluru");
			Thread.sleep(2000);
			d.findElement(By.xpath("//button[@class='nhb85d-BIqFsb' and @data-tooltip='Search' and @jsaction='search;focus:pane.focusTooltip;blur:pane.blurTooltip']")).click();
			Thread.sleep(2000);
			d.findElement(By.xpath("//input[@tooltip='Choose destination, or click on the map...' and @placeholder='Choose destination, or click on the map...']")).sendKeys("Mysore");
			Thread.sleep(2000);
			d.findElement(By.xpath("(//button[@jsaction='search;focus:pane.focusTooltip;blur:pane.blurTooltip'])[2]")).click();
			Thread.sleep(2000);
		}
			
		}	
		





}
