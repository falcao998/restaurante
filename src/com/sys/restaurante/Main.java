package com.sys.restaurante;
	
import com.sys.restaurante.controller.LoginController;
import com.sys.restaurante.utils.ExchangeStage;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	
	private ExchangeStage exchange = new ExchangeStage();
	
	@Override
	public void start(Stage primaryStage) {
		try {
			exchange.exchange("/com/sys/restaurante/view/fxml/Login.fxml", //SCREEN NAME - FXML
							  StageStyle.UNDECORATED,
							  "SYS RESTAURANTE", //TITLE
							  new LoginController()); //CONTROLLER
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
