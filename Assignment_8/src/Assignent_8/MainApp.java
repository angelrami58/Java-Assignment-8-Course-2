/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Assignent_8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *
 * @author angelramirez-rivera
 */
public class MainApp extends Application {

    private static final int ALLEN_HALL_COST = 1800;
    private static final int PIKE_HALL_COST = 2200;
    private static final int FARTHING_HALL_COST = 2800;
    private static final int UNIVERSITY_SUITES_COST = 3000;

    private static final int SEVEN_MEALS_PER_WEEK_COST = 600;
    private static final int FOURTEEN_MEALS_PER_WEEK_COST = 1100;
    private static final int UNLIMITED_MEALS_PER_WEEK_COST = 1800;

    private ComboBox<String> dormitoryComboBox;
    private ComboBox<String> mealPlanComboBox;
    private Label totalChargesLabel;
    
    /**
     * @param args the command line arguments
     */
       public void start(Stage primaryStage) throws Exception {
        // Create the dormitory ComboBox
        dormitoryComboBox = new ComboBox<>();
        dormitoryComboBox.getItems().addAll(
                "Allen Hall", "Pike Hall", "Farthing Hall", "University Suites"
        );

        // Create the meal plan ComboBox
        mealPlanComboBox = new ComboBox<>();
        mealPlanComboBox.getItems().addAll(
                "7 meals per week", "14 meals per week", "Unlimited meals"
        );

        // Create the total charges label
        totalChargesLabel = new Label();

        // Create the calculate button
        Button calculateButton = new Button("Calculate");
        calculateButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                calculateTotalCharges();
            }
        });
          // Create the layout
        VBox layout = new VBox();
        layout.setPadding(new Insets(10));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(dormitoryComboBox, mealPlanComboBox, calculateButton, totalChargesLabel);

        // Create the scene
        Scene scene = new Scene(layout);

        // Set the title of the stage
        primaryStage.setTitle("Dorm and Meal Plan Calculator");

        // Set the scene and show the stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 private void calculateTotalCharges() {
        int dormitoryCost = 0;
        int mealPlanCost = 0;

        String selectedDormitory = dormitoryComboBox.getValue();
        switch (selectedDormitory) {
            case "Allen Hall":
                dormitoryCost = ALLEN_HALL_COST;
                break;
            case "Pike Hall":
                dormitoryCost = PIKE_HALL_COST;
                break;
            case "Farthing Hall":
                dormitoryCost = FARTHING_HALL_COST;
                break;
            case "University Suites":
                dormitoryCost = UNIVERSITY_SUITES_COST;
                break;
        }
     String selectedMealPlan = mealPlanComboBox.getValue();
        switch (selectedMealPlan) {
            case "7 meals per week":
                mealPlanCost = SEVEN_MEALS_PER_WEEK_COST;
                break;
            case "14 meals per week":
                mealPlanCost = FOURTEEN_MEALS_PER_WEEK_COST;
                break;
            case "Unlimited meals":
                mealPlanCost = UNLIMITED_MEALS_PER_WEEK_COST;
                break;
        }
        int totalCharges = dormitoryCost + mealPlanCost;
        totalChargesLabel.setText("Total charges for the semester: $" + totalCharges);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args;
    }
}
