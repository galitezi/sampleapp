package PO;

import org.openqa.selenium.By;

public abstract class VehicleDataPO {
	public static final By COMB_MAKE = By.id("make");
	public static final By COMB_MODEL = By.id("model");
	public static final By COMB_SEATS_01 = By.id("numberofseats");
	public static final By COMB_SEATS_02 = By.id("numberofseatsmotorcycle");
	
	public static final By COMB_FUEL = By.id("fuel");
	public static final By TXT_CYLINDER = By.id("cylindercapacity");
	public static final By TXT_ENGINE = By.id("engineperformance");
	public static final By TXT_DATE = By.id("dateofmanufacture");
	public static final By TXT_PAYLOAD = By.id("payload");
	public static final By TXT_WEITHG = By.id("totalweight");
	public static final By TXT_PRICE = By.id("listprice");
	public static final By TXT_PLATE = By.id("licenseplatenumber");
	public static final By TXT_MILEAGE = By.id("annualmileage");
	public static final By RAD_YES = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1)");
	public static final By BTN_NEXT = By.id("nextenterinsurantdata");
	public static final By LBL_CONTADOR = By.xpath("//*[@id=\"entervehicledata\"]/span");
	
	
	
	

}
