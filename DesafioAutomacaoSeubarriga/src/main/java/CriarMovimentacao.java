import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CriarMovimentacao {
	@Test
	public void CriarMovimentacoes () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		
		driver.findElement(By.id("email")).sendKeys("gabi@teste.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		WebElement bto = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		bto.click(); //Botão Entrar
		Thread.sleep(3000);
		
		WebElement bto1 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a"));
		bto1.click();//Botão Criar Movimentação
		driver.quit();
		
	}
	
	@Test
	public void ValidarMensagemDescricao () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		
		driver.findElement(By.id("email")).sendKeys("gabi@teste.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		WebElement bto = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		bto.click(); //Botão Entrar
		Thread.sleep(3000);

		WebElement bto1 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a"));
		bto1.click();//Botão Criar Movimentação
		
		WebElement elementMovimentacao =  driver.findElement (By.id("tipo"));
		Select combo1 = new Select(elementMovimentacao);
		combo1.selectByValue("DESP");
		driver.findElement(By.id("data_transacao")).sendKeys("03/05/2024");
		driver.findElement(By.id("data_pagamento")).sendKeys("03/05/2024");
		driver.findElement(By.id("interessado")).sendKeys("Seu barriga");
		driver.findElement(By.id("valor")).sendKeys("50");
		WebElement bto2 = driver.findElement(By.cssSelector("body > div.col-lg-10 > form > div.btn-group > button"));
		bto2.click(); //Botão Salvar
		
		Assert.assertEquals("Descrição é obrigatório", driver.findElement(By.xpath("/html/body/div[1]/ul")).getText());
		driver.quit();
		
	}
	
	@Test
	public void ValidarMensagemDataP () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		
		driver.findElement(By.id("email")).sendKeys("gabi@teste.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		WebElement bto = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		bto.click(); //Botão Entrar
		Thread.sleep(3000);
		WebElement bto1 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a"));
		bto1.click();//Botão Criar Movimentação
		
		WebElement elementMovimentacao =  driver.findElement (By.id("tipo"));
		Select combo1 = new Select(elementMovimentacao);
		combo1.selectByValue("DESP");
		driver.findElement(By.id("data_transacao")).sendKeys("03/05/2024");
		driver.findElement(By.id("descricao")).sendKeys("TESTE TESTE");
		driver.findElement(By.id("interessado")).sendKeys("Seu barriga");
		driver.findElement(By.id("valor")).sendKeys("50");
		WebElement bto4 = driver.findElement(By.cssSelector("body > div.col-lg-10 > form > div.btn-group > button"));
		bto4.click(); //Botão Salvar
		
		Assert.assertEquals("Data do pagamento é obrigatório", driver.findElement(By.xpath("/html/body/div[1]/ul")).getText());
		driver.quit();
	}
	
	@Test
	public void ValidarMensagemDataM () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		
		driver.findElement(By.id("email")).sendKeys("gabi@teste.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		WebElement bto = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		bto.click(); //Botão Entrar
		Thread.sleep(3000);
		WebElement bto1 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a"));
		bto1.click();//Botão Criar Movimentação
		
		WebElement elementMovimentacao =  driver.findElement (By.id("tipo"));
		Select combo1 = new Select(elementMovimentacao);
		combo1.selectByValue("DESP");
		driver.findElement(By.id("data_pagamento")).sendKeys("03/05/2024");
		driver.findElement(By.id("descricao")).sendKeys("TESTE TESTE");
		driver.findElement(By.id("interessado")).sendKeys("Seu barriga");
		driver.findElement(By.id("valor")).sendKeys("50");
		WebElement bto4 = driver.findElement(By.cssSelector("body > div.col-lg-10 > form > div.btn-group > button"));
		bto4.click(); //Botão Salvar
		
		Assert.assertEquals("Data da Movimentação é obrigatório", driver.findElement(By.xpath("/html/body/div[1]/ul")).getText());
		driver.quit();
	}
	
	@Test
	public void ValidarMensagemValor () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		
		driver.findElement(By.id("email")).sendKeys("gabi@teste.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		WebElement bto = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		bto.click(); //Botão Entrar
		Thread.sleep(3000);
		WebElement bto1 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a"));
		bto1.click();//Botão Criar Movimentação
		
		WebElement elementMovimentacao =  driver.findElement (By.id("tipo"));
		Select combo1 = new Select(elementMovimentacao);
		combo1.selectByValue("DESP");
		driver.findElement(By.id("data_transacao")).sendKeys("03/05/2024");
		driver.findElement(By.id("data_pagamento")).sendKeys("03/05/2024");
		driver.findElement(By.id("descricao")).sendKeys("TESTE TESTE");
		driver.findElement(By.id("interessado")).sendKeys("Seu barriga");
		WebElement bto4 = driver.findElement(By.cssSelector("body > div.col-lg-10 > form > div.btn-group > button"));
		bto4.click(); //Botão Salvar
		
		Assert.assertEquals("Valor é obrigatório", driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]")).getText());
		Assert.assertEquals("Valor deve ser um número", driver.findElement(By.xpath("/html/body/div[1]/ul/li[2]")).getText());
		driver.quit();
	}
	
	@Test
	public void ValidarCriarmovimentacao () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/login");
		
		driver.findElement(By.id("email")).sendKeys("gabi@teste.com");
		driver.findElement(By.id("senha")).sendKeys("123456");
		WebElement bto = driver.findElement(By.xpath("/html/body/div[2]/form/button"));
		bto.click(); //Botão Entrar
		Thread.sleep(3000);
		WebElement bto1 = driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[3]/a"));
		bto1.click();//Botão Criar Movimentação
		
		WebElement elementMovimentacao =  driver.findElement (By.id("tipo"));
		Select combo1 = new Select(elementMovimentacao);
		combo1.selectByValue("DESP");
		driver.findElement(By.id("data_transacao")).sendKeys("03/05/2024");
		driver.findElement(By.id("data_pagamento")).sendKeys("03/05/2024");
		driver.findElement(By.id("descricao")).sendKeys("TESTE TESTE");
		driver.findElement(By.id("interessado")).sendKeys("Seu barriga");
		driver.findElement(By.id("valor")).sendKeys("50");
		WebElement bto4 = driver.findElement(By.cssSelector("body > div.col-lg-10 > form > div.btn-group > button"));
		bto4.click(); //Botão Salvar
		
		Assert.assertEquals("Movimentação adicionada com sucesso!", driver.findElement(By.xpath("/html/body/div[1]")).getText());
		driver.quit();
	}
}
