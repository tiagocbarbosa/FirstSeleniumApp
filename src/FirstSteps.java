import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSteps {

    WebDriver driver;

    @Before
    public void preCondicao() {
        // define o local do driver
        System.setProperty("webdriver.gecko.driver", "C:/Users/tiago/Documents/Programming/Java/Web/geckodriver-v0.30.0-win64/geckodriver.exe");
        // inicia o Firefox
        driver = new FirefoxDriver();
        // acessa a página do Google
        driver.get("http://www.google.com.br");
        // maximiza a tela
        driver.manage().window().maximize();
    }

    @Test
    public void meuPrimeiroTest () {
        // imprime o título da página no console
        System.out.println(driver.getTitle());
        // imprime a URL atual no console
        System.out.println(driver.getCurrentUrl());
    }

    @After
    public void posCondicao() {
        // fecha a janela do navegador
        driver.quit();
    }
}