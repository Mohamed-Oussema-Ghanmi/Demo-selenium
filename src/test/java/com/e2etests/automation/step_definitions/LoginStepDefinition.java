package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.pages_objects.LoginPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginStepDefinition {
private LoginPageObject loginPageObject; 
public LoginStepDefinition ()
{
	loginPageObject= new LoginPageObject();
}
	
	
	@Given("j accede a l application SwagLabs")
	public void jAccedeALApplicationSwagLabs() {
	   loginPageObject.connectToApp();
	}
	@When("je saisi le username {string}")
	public void jeSaisiLeUsername(String string) {
	    loginPageObject.fillUsername(string);
	}
	@When("je saisi le mot de passe {string}")
	public void jeSaisiLeMotDePasse(String string) {
		loginPageObject.fillPasword(string);
	   
	}
	@When("je clique sur le bouton de conexion")
	public void jeCliqueSurLeBoutonDeConexion() {
		loginPageObject.clickBtn(); 
	}

	@Then("Je me redirige vers la page d'acceuil {string}")
	public void jeMeRedirigeVersLaPageDAcceuil(String msg) {
	  String titlePage=LoginPageObject.title.getText();
	  Assert.assertEquals(msg, titlePage);
	}






}
