package com.pages.ActitimeProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.ActitimeProject.AutoConstant;
import com.generics.ActitimeProject.ExcelLibrary;

public class PomActitimeLogin implements AutoConstant{
	
	
	//Declaration
    @FindBy(id="username")
    private WebElement UserNameTextField;

    @FindBy(xpath="//input[@name='pwd']")
    private WebElement PasswordTextField;

    @FindBy(id="keepLoggedInCheckBox")
    private WebElement CheckBoxButton;

    @FindBy(id="loginButton")
    private WebElement LoginButton;
    
    //Intilization
    
    public  PomActitimeLogin(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    //Utilization
    
    public void LoginMethod() throws IOException
    {
        UserNameTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, Sheetname, 1, 0));
        PasswordTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, Sheetname, 1, 1));
        LoginButton.click();
    }

}
