package application;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Scene scene = new Scene(root,700,400,Color.TAN);
			primaryStage.setTitle("TextFiled");
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		    GridPane G=new GridPane();
		    G.setPadding(new Insets (10,10,10,10));
		    G.setVgap(5);
		    G.setHgap(5);
		    scene.setRoot(G);
		    
		    /************************************/
		    Label nom= new Label ("Enter your First Name ");
		    GridPane.setConstraints(nom, 0, 0);
		    G.getChildren().add(nom);
		    nom.getStyleClass().add("lb");

		    /************************************/
		    
		    TextField name =new TextField();
		    GridPane.setConstraints(name, 1, 0);
		    G.getChildren().add(name);
		    name.getStyleClass().add("tf");

		    /************************************/
		    
		    Label prenom= new Label ("Enter your Last Name");
		    GridPane.setConstraints(prenom, 0, 1);
		    G.getChildren().add(prenom);
            prenom.getStyleClass().add("lb");
		    /************************************/
		    
		    TextField lastname =new TextField();
		    GridPane.setConstraints(lastname, 1, 1);
		    G.getChildren().add(lastname);
            lastname.getStyleClass().add("tf");
		    /************************************/
            
		    Label password= new Label ("Enter Password ");
		    GridPane.setConstraints(password, 0, 2);
		    G.getChildren().add(password);
		    password.getStyleClass().add("lb");

		    /************************************/
		    
		    TextField passwordL =new TextField();
		    GridPane.setConstraints(passwordL, 1, 2);
		    G.getChildren().add(passwordL);
		    passwordL.getStyleClass().add("tf");
		    
            /************************************/
		    
		    TextField passtext =new TextField();
		    GridPane.setConstraints(passtext , 1, 2);
		    G.getChildren().add(passtext );
		    passtext .getStyleClass().add("tf");
;
		    
            /************************************/
		    
		    CheckBox passtoggle = new CheckBox();
		    G.add(passtoggle,2,2);
		    passtoggle.getStyleClass().add("lb");
		    passtoggle.selectedProperty().addListener((ObservableValue < ? extends Boolean > ov, Boolean old_val , Boolean new_val)->{
		    	if(passtoggle.isSelected()) {
		    		passtext.setText(passwordL.getText());
		    		passtext.setVisible(true);
		    		passwordL.setVisible(false);
		    		return;
		    	}
		    	passwordL.setText(passtext.getText());
		    	passwordL.setVisible(true);
		    	passtext.setVisible(false);
		    	
		    });
;
		    
            /*
		    
		   
		    Label label1= new Label ();
		    GridPane.setConstraints(label1, 0,4);
		    GridPane.setColumnSpan(label1, 2);
		    G.getChildren().add(label1);

		    
           
            /************************************/
            
		    Label Comment= new Label ("Enter your Comment ");
		    GridPane.setConstraints(Comment, 0, 3);
		    G.getChildren().add(Comment);
		    Comment.getStyleClass().add("lb");

		    /************************************/
		    
		    TextField commentL =new TextField();
		    GridPane.setConstraints(commentL, 1, 3);
		    G.getChildren().add(commentL);
		    commentL.getStyleClass().add("tf");

		    /************************************/
		   
		    Button submit =new Button ("Submit");
		    GridPane.setConstraints(submit, 2, 0);
		    G.getChildren().add(submit);
            submit.getStyleClass().add("btn");
		    /************************************/
		    
		    Button clear =new Button ("Clear");
		    GridPane.setConstraints(clear, 2, 1);
		    G.getChildren().add(clear);
		    clear.getStyleClass().add("btn");
		    /************************************/
			 
		    Label label= new Label ();
		    GridPane.setConstraints(label, 0,5);
		    GridPane.setColumnSpan(label, 2);
		    G.getChildren().add(label);
		    
		    /************************************/
			 
		    submit.setOnAction((ActionEvent e)->{
		    	if(commentL.getText()!=null && !commentL.getText().isEmpty()) {
		    		label.setText(name.getText()+" "+lastname.getText()+" , "+"Thank you for your comment");
		    	}else {
		    		label.setText("you have not lafet a comment");
		    	}
		    });
		    
		    
		    /************************************/
		    
			   Button login =new Button("Login");
			   G.add(login, 2,3); 
			   login.getStyleClass().add("btn");
			   login.setOnAction(new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {

						if (name.getText() != null && lastname.getText()!= null && !passwordL.getText().isEmpty()) {
							label.setText(name.getText()+" "+lastname.getText()+" , "+"Thank you for your login");
							label.setTextFill(Color.rgb(21,117,84));
						
						}else {
							label.setText("Enter youe user name");
						}
							
							
					}
				});
			   
			   
		    /************************************/
			 
		    clear.setOnAction((ActionEvent e)->{
		    name.clear();
		    lastname.clear();
		    commentL.clear();
		    passwordL.clear();
		    label.setText(null);
		    });
		    primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
