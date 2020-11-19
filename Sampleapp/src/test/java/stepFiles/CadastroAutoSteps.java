package stepFiles;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import massaTeste.InsurantDataMassaTeste;
import massaTeste.ProductDataMassaTeste;
import massaTeste.SendQuoteMassaTeste;
import massaTeste.VehicleDataMassaTeste;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PO.InsurantDataPO;
import PO.PriceOptionPO;
import PO.ProductDataPO;
import PO.SendQuotePO;
import PO.VehicleDataPO;



public class CadastroAutoSteps {

	private WebDriver driver;
	public Map<String, Object> vars;
	JavascriptExecutor js;
	
	
	 
	@Dado("que o usuário abriu navegador")
	public void que_o_usuário_abriu_navegador() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        
	    
	    
	}

	@Quando("acessar a url do sistema")
	public void acessar_a_url_do_sistema() {
		
		driver.get("http://sampleapp.tricentis.com/101/app.php");
        
	    
	}

	@Então("sistema deve apresentar a tela de cadastro de seguro veiculo")
	public void sistema_deve_apresentar_a_tela_de_cadastro_de_seguro_veiculo() {
		driver.manage().window().maximize();
	    
	}

	@Dado("que Preencheu o formulario na aba Vehcile Data")
	public void que_Preencheu_o_formulario_na_aba_Vehcile_Data() throws InterruptedException {
		
		Select combMake = new Select(driver.findElement(VehicleDataPO.COMB_MAKE));
        combMake.selectByVisibleText(VehicleDataMassaTeste.MAKE);
        Select combModel = new Select(driver.findElement(VehicleDataPO.COMB_MODEL));
        combModel.selectByVisibleText(VehicleDataMassaTeste.MODEL);
        driver.findElement(VehicleDataPO.TXT_CYLINDER).sendKeys(VehicleDataMassaTeste.CYLINDER);
        driver.findElement(VehicleDataPO.TXT_ENGINE).sendKeys(VehicleDataMassaTeste.ENGINE);
        driver.findElement(VehicleDataPO.TXT_DATE).sendKeys(VehicleDataMassaTeste.DATE);
        Select combSteats_01 = new Select(driver.findElement(VehicleDataPO.COMB_SEATS_01));
        combSteats_01.selectByVisibleText(VehicleDataMassaTeste.STEAT);
        driver.findElement(VehicleDataPO.RAD_YES).click();
        Select combSteats_02 = new Select(driver.findElement(VehicleDataPO.COMB_SEATS_02));
        combSteats_02.selectByVisibleText(VehicleDataMassaTeste.STEAT);
        Select combFuel = new Select(driver.findElement(VehicleDataPO.COMB_FUEL));
        combFuel.selectByVisibleText(VehicleDataMassaTeste.FUEL);
        driver.findElement(VehicleDataPO.TXT_PAYLOAD).sendKeys(VehicleDataMassaTeste.PAYLOAD);
        driver.findElement(VehicleDataPO.TXT_WEITHG).sendKeys(VehicleDataMassaTeste.TOTAL_WEIGHT);
        driver.findElement(VehicleDataPO.TXT_PRICE).sendKeys(VehicleDataMassaTeste.PRICE);
        driver.findElement(VehicleDataPO.TXT_PLATE).sendKeys(VehicleDataMassaTeste.PLATE_NUMBER);
        driver.findElement(VehicleDataPO.TXT_MILEAGE).sendKeys(VehicleDataMassaTeste.MILEAGE);
        Assert.assertTrue(driver.findElement(VehicleDataPO.LBL_CONTADOR).getText().equals("0"));
        driver.findElement(VehicleDataPO.BTN_NEXT).click();
        
		Thread.sleep(3000);
	    
	}

	@Dado("Preencheu o formulario na aba Insurante Data")
	public void preencheu_o_formulario_na_aba_Insurante_Data() {
		driver.findElement(InsurantDataPO.TXT_FIRST_NAME).sendKeys(InsurantDataMassaTeste.FIRST_NAME);
        driver.findElement(InsurantDataPO.TXT_LAST_NAME).sendKeys(InsurantDataMassaTeste.LAST_NAME);
        driver.findElement(InsurantDataPO.TXT_BIRTH_DATE).sendKeys(InsurantDataMassaTeste.BIRTH);
        driver.findElement(InsurantDataPO.RAD_GENDER_MALE).click();
        driver.findElement(InsurantDataPO.TXT_STREET).sendKeys(InsurantDataMassaTeste.STREET);
        Select combCounty = new Select(driver.findElement(InsurantDataPO.COMB_COUNTRY));
        combCounty.selectByVisibleText(InsurantDataMassaTeste.COUNTRY);
        driver.findElement(InsurantDataPO.TXT_ZIP_CODE).sendKeys(InsurantDataMassaTeste.ZIP);
        driver.findElement(InsurantDataPO.TXT_CITY).sendKeys(InsurantDataMassaTeste.CITY);
        Select combOccupation = new Select(driver.findElement(InsurantDataPO.COMB_OCCUPATION));
        combOccupation.selectByVisibleText(InsurantDataMassaTeste.OCCUPATION);
        driver.findElement(InsurantDataPO.SELECT_OUTHER).click();
        driver.findElement(InsurantDataPO.TXT_WEB_SITE).sendKeys(InsurantDataMassaTeste.WEB_SITE);
        Assert.assertTrue(driver.findElement(InsurantDataPO.LBL_CONTADOR).getText().equals("0"));
        driver.findElement(InsurantDataPO.BTN_NEXT).click();
	    
	}

	@Dado("Preencheu o formulario na aba Product Data")
	public void preencheu_o_formulario_na_aba_Product_Data() {
		driver.findElement(ProductDataPO.TXT_STAR_DATE).sendKeys(ProductDataMassaTeste.START_DATE);
    	Select combInsurange = new Select(driver.findElement(ProductDataPO.COMB_INSURANCE_SUM));
    	combInsurange.selectByValue(ProductDataMassaTeste.INSURANCE);
    	Select combMeritrating = new Select(driver.findElement(ProductDataPO.COMB_MERITRATING));
    	combMeritrating.selectByVisibleText(ProductDataMassaTeste.MERITRATING);
    	Select combDamage = new Select(driver.findElement(ProductDataPO.COMB_DAMAGE));
    	combDamage.selectByVisibleText(ProductDataMassaTeste.DAMAGE);
    	Actions actions = new Actions(driver);
    	WebElement element =driver.findElement(ProductDataPO.SELECT_LEGAL);
    	actions.moveToElement(element).click().build().perform();
    	Select combCourtesy = new Select(driver.findElement(ProductDataPO.COMB_COURTESY_CAR));
    	combCourtesy.selectByVisibleText(ProductDataMassaTeste.COURTESY);
    	Assert.assertTrue(driver.findElement(ProductDataPO.LBL_CONTADOR).getText().equals("0"));
    	driver.findElement(ProductDataPO.BTN_NEXT).click();
	    
	    
	}

	@Dado("Preencheu o formulario na aba Select Price Option")
	public void preencheu_o_formulario_na_aba_Select_Price_Option() {
		WebElement element =driver.findElement(PriceOptionPO.RAD_SILVER);
    	Actions actions = new Actions(driver);
    	actions.moveToElement(element).click().build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(PriceOptionPO.BTN_NEXT));
    	Assert.assertTrue(driver.findElement(PriceOptionPO.LBL_CONTADOR).getText().equals("0"));
    	driver.findElement(PriceOptionPO.BTN_NEXT).click();
		
	}

	@Dado("Preencheu p formulario na aba Sen quote")
	public void preencheu_p_formulario_na_aba_Sen_quote() {
		driver.findElement(SendQuotePO.TXT_EMAIL).sendKeys(SendQuoteMassaTeste.EMAIL);
        driver.findElement(SendQuotePO.TXT_PHOME).sendKeys(SendQuoteMassaTeste.PHONE);
        driver.findElement(SendQuotePO.TXT_USERNAME).sendKeys(SendQuoteMassaTeste.USERNAME);
        driver.findElement(SendQuotePO.TXT_PASSWORD).sendKeys(SendQuoteMassaTeste.PASSWORD);
        driver.findElement(SendQuotePO.TXT_CONFIRM_PASSWORD).sendKeys(SendQuoteMassaTeste.PASSWORD);
        Assert.assertTrue(driver.findElement(SendQuotePO.LBL_CONTADOR).getText().equals("0"));
        
	}

	@Quando("Acionou a opção Concluir")
	public void acionou_a_opção_Concluir() {
		driver.findElement(SendQuotePO.BTN_SEND).click();
	    
		
	}

	@Então("Sistema deve apresentar mensagem de sucesso")
	public void sistema_deve_apresentar_mensagem_de_sucesso() {
	
	    WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(SendQuotePO.BTN_OK));
        Assert.assertTrue(driver.findElement(SendQuotePO.LBL_MSM).getText().equals("Sending e-mail success!"));
        driver.findElement(SendQuotePO.BTN_OK).click();		
	    
	}

	@Então("registra as informações preenchidas no sistema seguro auto")
	public void registra_as_informações_preenchidas_no_sistema_seguro_auto() {
		
        driver.close();
        driver.quit();
		
	    
	}

	  
	 
} 