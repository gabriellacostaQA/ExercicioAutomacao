import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CriarConta {
	@Test
	public void CriarContas () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		
		driver.findElement(By.id("email")).sendKeys("gabi@teste.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		WebElement bto = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		bto.click(); //Botão Entrar
		Thread.sleep(3000);
		
		WebElement bto1 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a"));
		bto1.click();//Botão Contas
		WebElement bto2 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[1]/a"));
		bto2.click();//Botão Adicionar
		driver.findElement(By.id("nome")).sendKeys("Conta do Seu Madruga");
		WebElement bto3 = driver.findElement(By.xpath("/html/body/div[2]/form/div[2]/button"));
		bto3.click();//Botão Salvar
		driver.quit();
	}
	
	@Test
	public void ListarContas () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		
		driver.findElement(By.id("email")).sendKeys("gabi@teste.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		WebElement bto = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		bto.click(); //Botão Entrar
		Thread.sleep(3000);
		
		WebElement bto1 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a"));
		bto1.click();//Botão Contas
		WebElement bto2 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/ul/li[2]/a"));
		bto2.click();//Botão Listar
		driver.quit();
		}
}
