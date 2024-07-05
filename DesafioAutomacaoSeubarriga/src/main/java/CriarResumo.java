import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CriarResumo {
	
	@Test
	public void MovimentacaodoMes () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		
		driver.findElement(By.id("email")).sendKeys("gabi@teste.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		WebElement bto = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		bto.click(); //Botão Entrar
		Thread.sleep(3000);
		
		WebElement bto1 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[4]/a"));
		bto1.click();//Botão Resumo Mensal
		
		WebElement elementSelecionarmes =  driver.findElement (By.id("mes"));
		Select combo1 = new Select(elementSelecionarmes);
		combo1.selectByValue("05");
		
		WebElement bto2 = driver.findElement(By.xpath("/html/body/div[2]/form/input"));
		bto2.click(); //Botão Buscar
		
		driver.quit();
		
	}
	
	@Test
	public void MovimentacaoForadomes () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		
		driver.findElement(By.id("email")).sendKeys("gabi@teste.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		WebElement bto = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		bto.click(); //Botão Entrar
		Thread.sleep(3000);
		
		WebElement bto1 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[4]/a"));
		bto1.click();//Botão Resumo Mensal
		
		WebElement elementSelecionarmes =  driver.findElement (By.id("mes"));
		Select combo1 = new Select(elementSelecionarmes);
		combo1.selectByValue("02");
		
		WebElement bto2 = driver.findElement(By.xpath("/html/body/div[2]/form/input"));
		bto2.click(); //Botão Buscar
		
		driver.quit();
		
	}
}
