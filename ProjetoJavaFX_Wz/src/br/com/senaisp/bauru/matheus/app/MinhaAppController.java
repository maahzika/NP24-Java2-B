package br.com.senaisp.bauru.matheus.app;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Button;

public class MinhaAppController {

	@FXML MenuItem mnItTela01;
	@FXML Button btnSalvar;
	@FXML Button btnCancelar;

	@FXML public void mnItTela01Act() {}
	System.out.println("Chamando tela 01");
	Tela01Main tela01 = new Tela01Main();
	Main.mainStage.setScene(tela01);
	@FXML public void btnCancelarAct() {}

	@FXML public void btn() {}
	
}
