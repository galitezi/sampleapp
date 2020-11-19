package PO;

import org.openqa.selenium.By;

public abstract class ProductDataPO {
	public static final By COMB_INSURANCE_SUM = By.id("insurancesum");
	public static final By COMB_MERITRATING = By.id("meritrating");
	public static final By COMB_DAMAGE = By.id("damageinsurance");
	public static final By COMB_COURTESY_CAR = By.id("courtesycar");
	public static final By TXT_STAR_DATE = By.id("startdate");
	public static final By SELECT_LEGAL = By.id("LegalDefenseInsurance");
	public static final By BTN_NEXT = By.id("nextselectpriceoption");
	public static final By LBL_CONTADOR = By.xpath("//*[@id=\"enterproductdata\"]/span");
	
}
