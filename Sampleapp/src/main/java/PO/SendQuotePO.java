package PO;

import org.openqa.selenium.By;

public abstract class SendQuotePO {
	public static final By TXT_EMAIL = By.id("email");
	public static final By TXT_PHOME = By.id("phone");
	public static final By TXT_USERNAME = By.id("username");
	public static final By TXT_PASSWORD = By.id("password");
	public static final By TXT_CONFIRM_PASSWORD = By.id("confirmpassword");
	public static final By BTN_SEND = By.id("sendemail");
	public static final By BTN_OK = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");
	public static final By LBL_MSM = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");
	public static final By LBL_CONTADOR = By.xpath("//*[@id=\"sendquote\"]/span");
	
	
	

}
