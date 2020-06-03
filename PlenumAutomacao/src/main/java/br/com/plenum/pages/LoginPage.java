package br.com.plenum.pages;

import br.com.plenum.core.BasePage;
import br.com.plenum.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial(){
		DriverFactory.getDriver().get("https://jdepy.plenum.bio/jde/E1Menu.maf?jdemafjasFrom=Launcher&RENDER_MAFLET=E1Menu&jdeowpBackButtonProtect=PROTECTED&jdemafjasLauncher=MafletContainer");
	}
	
	public void setUserID(String id) {
		escrever("User", id);
	}
	
	public void setPassword(String senha) {
		escrever("Password", senha);
	}
	
	public void entrar(){
		clicarBotaoJde("Sign In");
	}
	
	public void logar(String id, String senha) {
		setUserID(id);
		setPassword(senha);
		entrar();
	}


}
