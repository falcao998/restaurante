package com.sys.restaurante.utils;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ExchangeStage {

	public void exchange(String screeName, StageStyle style, String title, Object controller) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(screeName));
			fxmlLoader.setController(controller);
			Parent parent = fxmlLoader.load();
			Scene scene = new Scene(parent);
			Stage stage = new Stage(style);
			stage.setTitle(title);
			
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage.centerOnScreen();
			stage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void exchange(String screeName, StageStyle style, String title, Object controller, String cssStyle, boolean maximize) {
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(screeName));
			fxmlLoader.setController(controller);
			Parent parent = fxmlLoader.load();
			Scene scene = new Scene(parent);
			Stage stage = new Stage(style);
			stage.setTitle(title);
			if(maximize) {
				stage.setHeight(Screen.getPrimary().getVisualBounds().getHeight());
				stage.setWidth(Screen.getPrimary().getVisualBounds().getWidth());
			}
			stage.initModality(Modality.APPLICATION_MODAL);
			scene.getStylesheets().add(cssStyle);
			stage.setScene(scene);
			stage.centerOnScreen();
			stage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
