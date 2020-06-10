package com.Scripts.ActitimeProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.ActitimeProject.Basetest;
import com.pages.ActitimeProject.PomActitimeLogin;

   @Test
   public class TestActitimeLogin extends Basetest {
	
	public void Login() throws IOException
	{
		PomActitimeLogin p=new PomActitimeLogin(driver);
		p.LoginMethod();
	}

}
