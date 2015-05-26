package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class test {
	{
		driver.get("http://www.lego.com/en-us/jurassicworld");
		Thread.sleep(1000);
		
		Boolean issliderpresent=driver.findElements(By.xpath("//*[@class='btn fancy-chevron fancy-chevron-right next']")).size()!=0;
		if(issliderpresent==true)
		{
			System.out.println("Slider is present");
			
			WebElement rightarrow=driver.findElement(By.xpath("//*[@class='btn fancy-chevron fancy-chevron-right next']"));
			
			List<WebElement> Parent = driver.findElements(By.xpath("//*[@class='pagination']/li"));
	        int ListCount = Parent.size();

	        for (int i = 0; i < ListCount; i++)
	        {
	        	rightarrow.click();
	        	Thread.sleep(500);
	        }
	        
	        System.out.println("Right Scroll finished");
	        WebElement leftarrow=driver.findElement(By.xpath("//*[@class='btn fancy-chevron fancy-chevron-left prev']"));	
	        
	        for (int i = 0; i < ListCount; i++)
	        {
	        	leftarrow.click();
	        	Thread.sleep(500);
	        }
	        System.out.println("Left Scroll finished");
	        
		}
	        
		else
		{
			System.out.println("Slider is not present");
		}
	
				
		Boolean isbulletpresent=driver.findElements(By.cssSelector("pagination-item ng-scope active")).size()!=0;
		if(issliderpresent==true)
		{
			
			System.out.println("Bullets are present");
			
			WebElement rightbullet=driver.findElement(By.xpath("//*[@class='pagination-item ng-scope active']"));
			
			List<WebElement> Parent = driver.findElements(By.xpath("//*[@class='pagination']/li"));
	        int ListCount = Parent.size();

	               
	        for (int i = 0; i <= ListCount; i++)
	        {
	        	rightbullet.click();
	        	Thread.sleep(500);
	        }
	        System.out.println("Right slide Bullet finished");
	        WebElement leftbullet=driver.findElement(By.xpath("//*[@class='pagination-item ng-scope']"));	
	           
	        
	        for (int i = 0; i <= ListCount; i++)
	        {
	        	leftbullet.click();
	        	Thread.sleep(500);
	        }
	        System.out.println("Left slide Bullet finished");
	        
		}
		    
		else
		{
			System.out.println("Bullets are not present");
		}
	
	}

	}


}
