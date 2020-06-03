/*package br.com.plenum.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.plenum.core.DriverFactory;
import br.com.plenum.pages.LoginPage;

@RunWith(Suite.class)
@SuiteClasses({
})

public class SuiteGeral {
	private LoginPage page = new LoginPage();
	
	public void reset(){
		
		page.acessarTelaInicial();
		page.setEmail("jpassos@svlabs.com.br");
		page.setSenha("teste2020");
		page.entrar();
		
		page.resetar();
		
		DriverFactory.killDriver();
	}
}*/
