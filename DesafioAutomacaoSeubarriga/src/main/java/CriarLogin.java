import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CriarLogin {

	@Test
	public void CadastroSeubarriga () {
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://seubarriga.wcaquino.me/cadastro");
		
		driver.findElement(By.id("nome")).sendKeys("Gabi");
		driver.findElement(By.id("email")).sendKeys("gabi2@teste.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		WebElement bto = driver.findElement(By.xpath("/html/body/div[2]/form/input"));
		bto.click();
		
		driver.quit();
	}
	
	@Test
	public void LoginSeubarriga () {
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://seubarriga.wcaquino.me/login");
		
		driver.findElement(By.id("email")).sendKeys("gabi@teste.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		WebElement bto = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		bto.click();
		
		//driver.quit();
	}
	
}
