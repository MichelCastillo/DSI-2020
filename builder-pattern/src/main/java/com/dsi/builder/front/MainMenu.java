package com.dsi.builder.front;

import javafx.application.Application;
import java.util.AbstractMap.SimpleEntry;
import java.util.Map.Entry;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.effect.Glow;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainMenu extends Application{
	
	final PageData[] pages = new PageData[] {
	        new PageData("Title",
	            "Description ",
	            "Subtitle"),
	        new PageData("Title",
		        "Description ",
		        "Subtitle"),
	        new PageData("Title",
		        "Description ",
		        "Subtitle"),
	        new PageData("Title",
		        "Description ",
		        "Subtitle")
	    };
	
	final String[] viewOptions = new String[] {
	        "Title", 
	        "Binomial name", 
	        "Picture", 
	        "Description"
	    };
	 
	    final Entry<String, Effect>[] effects = new Entry[] {
	        new SimpleEntry<String, Effect>("Sepia Tone", new SepiaTone()),
	        new SimpleEntry<String, Effect>("Glow", new Glow()),
	        new SimpleEntry<String, Effect>("Shadow", new DropShadow())
	    };
	 
	    final ImageView pic = new ImageView();
	    final Label name = new Label();
	    final Label binName = new Label();
	    final Label description = new Label();
	 
	    public static void main(String[] args) {
	        launch(args);
	    }
	 
	    @Override
	    public void start(Stage stage) {
	        stage.setTitle("Menu Sample");
	        Scene scene = new Scene(new VBox(), 400, 350);
	        scene.setFill(Color.OLDLACE);
	 
	        MenuBar menuBar = new MenuBar();
	 
	        // --- Menu File
	        Menu menuFile = new Menu("File");
	 
	        // --- Menu Edit
	        Menu menuEdit = new Menu("Edit");
	 
	        // --- Menu View
	        Menu menuView = new Menu("View");
	 
	        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
	 
	 
	        ((VBox) scene.getRoot()).getChildren().addAll(menuBar);
	 
	        stage.setScene(scene);
	        stage.show();
	    }
	 
	
	private class PageData {
        public String name;
        public String description;
        public String binNames;
        public Image image;
        public PageData(String name, String description, String binNames) {
            this.name = name;
            this.description = description;
            this.binNames = binNames;
            image = new Image(getClass().getResourceAsStream(name + ".jpg"));
        }
    }

}
