package com.sys.restaurante.controller;

import com.sys.restaurante.utils.ExchangeStage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.StageStyle;

public class LoginController {
	
	private ExchangeStage exchange = new ExchangeStage();

	@FXML
	private AnchorPane anchorPane;
	
	@FXML
	private TextField tfUsuario;
	
	@FXML
	private PasswordField tfSenha;
	
	@FXML
	private Button btQ;
	
	@FXML
	private Button btA;
	
	@FXML
	private Button btZ;
	
	@FXML
	private Button btX;
	
	@FXML
	private Button btS;
	
	@FXML
	private Button btW;
	
	@FXML
	private Button btE;
	
	@FXML
	private Button btD;
	
	@FXML
	private Button btC;
	
	@FXML
	private Button btV;
	
	@FXML
	private Button btF;
	
	@FXML
	private Button btR;
	
	@FXML
	private Button btT;
	
	@FXML
	private Button btG;
	
	@FXML
	private Button btB;
	
	@FXML
	private Button btN;
	
	@FXML
	private Button btH;
	
	@FXML
	private Button btY;
	
	@FXML
	private Button btU;
	
	@FXML
	private Button btJ;
	
	@FXML
	private Button btM;
	
	@FXML
	private Button btLimpar;
	
	@FXML
	private Button btK;
	
	@FXML
	private Button btI;
	
	@FXML
	private Button btO;
	
	@FXML
	private Button btL;
	
	@FXML
	private Button btP;
	
	@FXML
	private Button btCorrige;
	
	@FXML
	private Button bt7;
	
	@FXML
	private Button bt4;
	
	@FXML
	private Button bt1;
	
	@FXML
	private Button bt2;
	
	@FXML
	private Button bt5;
	
	@FXML
	private Button bt8;
	
	@FXML
	private Button bt9;
	
	@FXML
	private Button bt6;
	
	@FXML
	private Button bt3;
	
	@FXML
	private Button bt0;
	
	@FXML
	private Button btnSair;
	
	@FXML
	private Button btnEntrar;
	
	@FXML
	public void handleSair() {
		System.exit(0);
	}
	
	@FXML
	public void handleButton(ActionEvent event) {
		Button button = (Button)event.getSource();
		if(tfUsuario.isFocused())
			tfUsuario.setText(tfUsuario.getText()+button.getText());
		if(tfSenha.isFocused())
			tfSenha.setText(tfSenha.getText()+button.getText());
	}
	
	@FXML
	public void handleLimpar() {
		if(tfUsuario.isFocused())
			tfUsuario.setText("");
		if(tfSenha.isFocused())
			tfSenha.setText("");
	}
	
	@FXML
	public void handleCorrige() {
		if((tfUsuario.isFocused()) && (tfUsuario.getText().length() > 0))
			tfUsuario.setText(tfUsuario.getText().substring(0, tfUsuario.getText().length()-1));
		if((tfSenha.isFocused()) && (tfSenha.getText().length() > 0))
			tfSenha.setText(tfSenha.getText().substring(0, tfSenha.getText().length()-1));
	}
	
	@FXML
	public void handleLogin() {
		exchange.exchange("/com/sys/restaurante/view/fxml/Principal.fxml",
						  StageStyle.UNIFIED,
						  "SYS RESTAURANTE",
						  null,
						  "/com/sys/restaurante/view/css/principal.css",
						  true);
	}
}