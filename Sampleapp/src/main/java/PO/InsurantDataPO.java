package PO;

import org.openqa.selenium.By;

public abstract class InsurantDataPO {
	public static final By COMB_COUNTRY = By.id("country");
	public static final By COMB_OCCUPATION = By.id("occupation");
	public static final By TXT_FIRST_NAME = By.id("firstname");
	public static final By TXT_LAST_NAME = By.id("lastname");
	public static final By TXT_BIRTH_DATE = By.id("birthdate");
	public static final By TXT_STREET = By.id("streetaddress");
	public static final By TXT_ZIP_CODE = By.id("zipcode");
	public static final By TXT_CITY = By.id("city");
	public static final By TXT_WEB_SITE = By.id("website");
	public static final By RAD_GENDER_MALE = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1)");
	public static final By SELECT_OUTHER = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(5)");
	public static final By BTN_NEXT = By.id("nextenterproductdata");
	public static final By LBL_CONTADOR = By.xpath("//*[@id=\"enterinsurantdata\"]/span");
	
}
