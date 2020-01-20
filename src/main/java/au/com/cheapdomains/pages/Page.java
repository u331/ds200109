package au.com.cheapdomains.pages;

import au.com.cheapdomains.model.Account;
import au.com.cheapdomains.utils.TestHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
    private WebDriver driver;
    private Wait<WebDriver> wait;
    private Alert alert;

    @FindBy(css = "#first_name input")
    private WebElement first_name_input;
//    public WebElement first_name_input;

    @FindBy(css = "#last_name input")
    private WebElement last_name_input;

    @FindBy(css = "#address input")
    private WebElement address_input;

    @FindBy(css = "#city input[name='city']")
    private WebElement city_input;

    @FindBy(css = "#city input[name='post_code']")
    private WebElement post_code_input;

    @FindBy(css = "#country_name")
    private WebElement country_name;

    Select countrySelect;

    @FindBy(css = "#state_field")
    private WebElement state_field;

    Select stateSelect;

    @FindBy(css = "#phone_number")
    private WebElement phone_number;

    @FindBy(css = "#email input")
    private WebElement email_input;

    @FindBy(css = "#account_type_personal")
    private WebElement account_type_personal;

    @FindBy(css = "#account_type_business")
    private WebElement account_type_business;

    @FindBy(xpath = ".//*[@id='account_type_personal']/..")
    private WebElement account_type_wrapper;

    @FindBy(css = "#abn input")
    private WebElement abn_input;

    @FindBy(css = "#business")
    private WebElement business_name;

    @FindBy(css = "#business_type_element")
    private WebElement business_type_element;

    Select business_typeSelect;

    @FindBy(css = "#business_number_element")
    private WebElement business_number_element;

    @FindBy(css = "#username input")
    private WebElement username_input;

    @FindBy(css = "#password input")
    private WebElement password_input;

    @FindBy(css = "#content_pad input[value='Continue Order']")
    private WebElement continueOrderBtn;

//    Constructor
    public Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
//        wait = new WebDriverWait(driver, 5, 5000);
        wait = new WebDriverWait(driver, 1, 1000);
        countrySelect = new Select(country_name);
        stateSelect = new Select(state_field);
        business_typeSelect = new Select(business_type_element);
    }

    public String getText_first_name_input(){
//        return first_name_input.getText();
        return first_name_input.getAttribute("value");
    }

    public Page setText_first_name_input(String text){
        first_name_input.sendKeys(text);
        return this;
    }

    public String getCssBorder_first_name_input() {
        return first_name_input.getCssValue("border");
    }

    public String getText_last_name_input(){
        return last_name_input.getAttribute("value");
    }

    public Page setText_last_name_input(String text){
        last_name_input.sendKeys(text);
        return this;
    }

    public String getCssBorder_last_name_input() {
        return last_name_input.getCssValue("border");
    }

    public String getText_address_input(){
        return address_input.getAttribute("value");
    }

    public Page setText_address_input(String text){
        address_input.sendKeys(text);
        return this;
    }

    public String getCssBorder_address_input() {
        return address_input.getCssValue("border");
    }

    public String getText_city_input(){
        return city_input.getAttribute("value");
    }

    public Page setText_city_input(String  text){
        city_input.sendKeys( text);
        return this;
    }

    public String getCssBorder_city_input() {
        return city_input.getCssValue("border");
    }

    public String getText_post_code_input(){
        return post_code_input.getAttribute("value");
    }

    public Page setText_post_code_input(String text){
        post_code_input.sendKeys(text);
        return this;
    }

    public String getCssBorder_post_code_input() {
        return post_code_input.getCssValue("border");
    }

    public String getValue_country_name(){
        return country_name.getAttribute("value");
    }

    public String getText_countrySelect(){
        return countrySelect.getFirstSelectedOption().getText();
    }

    public String getValue_countrySelect(){
        return countrySelect.getFirstSelectedOption().getAttribute("value");
    }

    public Page setText_countrySelect(String visibleText){
        countrySelect.selectByVisibleText(visibleText);
        return this;
    }

    public Page setValue_countrySelect(String value){
        countrySelect.selectByValue(value);
        return this;
    }

    public Page setIndex_countrySelect(int index){
        countrySelect.selectByIndex(index);
        return this;
    }

    public String getCssBorder_country_name() {
        return country_name.getCssValue("border");
    }

    public String getText_state_field(){
        switch (state_field.getTagName()){
            case "input" :
                return state_field.getAttribute("value");
            case "select" :
                return stateSelect.getFirstSelectedOption().getText(); // ?
            default:
                return "unknown";
        }
    }

    public Page setText_state_field(String text){
        switch (state_field.getTagName()){
            case "input" :
                state_field.sendKeys(text);
                break;
            case "select" :
                stateSelect.selectByVisibleText(text);
                break;
            default:
                System.out.println("not expected tag name: " + state_field.getTagName());;
        }
        return this;
    }

    public String getValue_stateSelect(){
        return stateSelect.getFirstSelectedOption().getAttribute("value");
    }

    public Page setValue_stateSelect(String value){
        stateSelect.selectByValue(value);
        return this;
    }

    public Page setIndex_stateSelect(int index){
        stateSelect.selectByIndex(index);
        return this;
    }

    public String getCssBorder_state_field() {
        return state_field.getCssValue("border");
    }

    public String getText_phone_number(){
        return phone_number.getAttribute("value");
    }

    public Page setText_phone_number(String text){
        phone_number.sendKeys(text);
        return this;
    }

    public String getTag_state_field(){
        return state_field.getTagName();
    }

    public String getCssBorder_phone_number() {
        return phone_number.getCssValue("border");
    }

    public String getText_email_input(){
        return email_input.getAttribute("value");
    }

    public Page setText_email_input(String text){
        email_input.sendKeys(text);
        return this;
    }

    public String getCssBorder_email_input() {
        return email_input.getCssValue("border");
    }

    public Boolean isAccount_type_personal(){
        return account_type_personal.isSelected();
    }

    public Boolean isAccount_type_business(){
        return account_type_business.isSelected();
    }

    public String getValue_account_type(){
        if(account_type_personal.isSelected() && !account_type_business.isSelected()){
            return account_type_personal.getAttribute("value");
        }
        if(!account_type_personal.isSelected() && account_type_business.isSelected()){
            return account_type_business.getAttribute("value");
        }
        return "unknown";
    }

    public Page setValue_account_type(String value){
        if(account_type_personal.getAttribute("value").equals(value)){
            account_type_personal.click();
        }
        if(account_type_business.getAttribute("value").equals(value)){
            account_type_business.click();
        }
        return this;
    }

    public String getCssBorder_account_type_wrapper() {
        return account_type_wrapper.getCssValue("border");
    }

    public String getText_abn_input(){
        return abn_input.getAttribute("value");
    }

    public Page setText_abn_input(String text){
        abn_input.sendKeys(text);
        return this;
    }

    public String getCssBorder_abn_input() {
        return abn_input.getCssValue("border");
    }

    public String getText_business_name(){
        return business_name.getAttribute("value");
    }

    public Page setText_business_name(String text){
        business_name.sendKeys(text);
        return this;
    }

    public String getCssBorder_business_name() {
        return business_name.getCssValue("border");
    }

    public String getValue_business_type_element(){
        return business_type_element.getAttribute("value");
    }

    public String getText_business_typeSelect(){
        return business_typeSelect.getFirstSelectedOption().getText();
    }

    public String getValue_business_typeSelect(){
        return business_typeSelect.getFirstSelectedOption().getAttribute("value");
    }

    public Page setText_business_typeSelect(String visibleText){
        business_typeSelect.selectByVisibleText(visibleText);
        return this;
    }

    public Page setValue_business_typeSelect(String value){
        business_typeSelect.selectByValue(value);
        return this;
    }

    public Page setIndex_business_typeSelect(int index){
        business_typeSelect.selectByIndex(index);
        return this;
    }

    public String getCssBorder_business_type_element() {
        return business_type_element.getCssValue("border");
    }

    public String getText_business_number_element(){
        return business_number_element.getAttribute("value");
    }

    public Page setText_business_number_element(String text){
        business_number_element.sendKeys(text);
        return this;
    }

    public String getCssBorder_business_number_element() {
        return business_number_element.getCssValue("border");
    }

    public String getText_username_input(){
        return username_input.getAttribute("value");
    }

    public Page setText_username_input(String text){
        username_input.sendKeys(text);
        return this;
    }

    public String getCssBorder_username_input() {
        return username_input.getCssValue("border");
    }

    public String getText_password_input(){
        return password_input.getAttribute("value");
    }

    public Page setText_password_input(String text){
        password_input.sendKeys(text);
        return this;
    }

    public String getCssBorder_password_input() {
        return password_input.getCssValue("border");
    }

    public Page fillRegForm(Account account){
        if(account.getFirstName() != null) setText_first_name_input(account.getFirstName());
        if(account.getLastName() != null) setText_last_name_input(account.getLastName());
        if(account.getAddress() != null) setText_address_input(account.getAddress());
        if(account.getCity() != null) setText_city_input(account.getCity());
        if(account.getPostCode() != null) setText_post_code_input(account.getPostCode());
        if(account.getCountry() != null) setText_countrySelect(account.getCountry());
        if(account.getState() != null) setText_state_field(account.getState());
        if(account.getPhoneNumber() != null) setText_phone_number(account.getPhoneNumber());
        if(account.getEmail() != null) setText_email_input(account.getEmail());
        if(account.getUserType() != null) {
            setValue_account_type(account.getUserType());
            if (account.getUserType().equals(account_type_personal.getAttribute("value"))) {
                if (account.getAbn() != null) setText_abn_input(account.getAbn());
            } else if (account.getUserType().equals(account_type_business.getAttribute("value"))) {
                if (account.getBusinessName() != null) setText_business_name(account.getBusinessName());
                if (account.getBusinessType() != null && TestHelper.isElementPresent(business_type_element)) {
//                if (account.getBusinessType() != null && account.getCountry().equals("Australia")) {
                    setText_business_typeSelect(account.getBusinessType());
                }
                if (account.getBusinessNumber() != null) setText_business_number_element(account.getBusinessNumber());
            }
        }
        if(account.getUserName() != null) setText_username_input(account.getUserName());
        if(account.getPassword() != null) setText_password_input(account.getPassword());
        return this;
    }

    public Page continueOrderClick(){
        continueOrderBtn.click();
        return this;
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e){
            e.printStackTrace();
            return false;
        }
    }

    public String getText_alert(){
        try {
            alert = driver.switchTo().alert();
            return alert.getText();
        } catch (NoAlertPresentException e){
            e.printStackTrace();
            return "Alert error";
        }
    }

    public void acceptAlert(){
        try {
            alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e){
            e.printStackTrace();
        }
    }

}

