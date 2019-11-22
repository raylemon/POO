package be.ifosup.poo.javafx;

import be.ifosup.poo.javafx.beans.Person;
import be.ifosup.poo.javafx.controllers.MainViewController;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainApp extends Application {
    private ResourceBundle bundle = ResourceBundle.getBundle("i18n");
    private ObservableList<Person> people = FXCollections.observableArrayList();

    /**
     * Launcher
     * Pour tester l’application, utiliser la tâche Application > run
     *
     * @param args no args used
     */
    public static void main(String... args) {
        launch(args);
    }

    /**
     * Méthode principale de lancement de l’application JavaFX
     *
     * @param primaryStage la fenêtre principale
     */
    @Override
    public void start(Stage primaryStage) {
        fill_dummies(people);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("mainview.fxml"), bundle);
            Parent root = loader.load();
            MainViewController controller = loader.getController();
            controller.setList(people);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle(bundle.getString("title"));
            primaryStage.getIcons().add(new Image(String.valueOf(getClass().getClassLoader().getResource("icon.png"))));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void fill_dummies(ObservableList<Person> people) {
        for (int i = 0; i < 5; i++) {
            Person person = new Person();
            person.setFirstName("Sophie"+i);
            person.setLastName("Fonfec"+i);

            people.add(person);
        }
    }
}
