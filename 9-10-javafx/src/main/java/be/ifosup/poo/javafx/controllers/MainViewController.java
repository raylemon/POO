package be.ifosup.poo.javafx.controllers;

import be.ifosup.poo.javafx.beans.Person;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.ParsePosition;
import java.util.ResourceBundle;

public class MainViewController {

    @FXML
    private Button btnCommit;

    @FXML
    private Button btnRollback;

    @FXML
    private Button btnDelete;
    @FXML
    private TableView<Person> tablePeople;
    @FXML
    private TableColumn<Person, String> firstNameColumn;
    @FXML
    private TableColumn<Person, String> lastNameColumn;
    @FXML
    private TextField tfFirstName;
    @FXML
    private TextField tfLastName;
    @FXML
    private TextField tfAddress;
    @FXML
    private TextField tfZipCode;
    @FXML
    private TextField tfCity;
    @FXML
    private TextField tfPhoneNumber;
    @FXML
    private TextField tfEmailAddress;
    @FXML
    private DatePicker dpBirthday;

    private PersonViewModel viewModel = new PersonViewModel();
    private ResourceBundle bundle = ResourceBundle.getBundle("i18n");

    @FXML
    private void doClose(ActionEvent actionEvent) {
        Stage stage = (Stage) tablePeople.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void doNewPerson(ActionEvent actionEvent) {
        Person person = new Person();
        tablePeople.getItems().add(person);
        tablePeople.getSelectionModel().select(person);
        if (tablePeople.getItems().size() > 0) btnDelete.setDisable(false);
    }

    @FXML
    private void doDeletePerson(ActionEvent actionEvent) {
        Person toRemove = tablePeople.getSelectionModel().getSelectedItem();
        tablePeople.getItems().remove(toRemove);
        if (tablePeople.getItems().size() == 0) btnDelete.setDisable(true);
    }

    @FXML
    private void doAbout(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.NONE, "", ButtonType.OK);
        alert.setTitle(bundle.getString("about.title"));
        alert.setHeaderText(bundle.getString("about.header"));
        alert.setContentText(MessageFormat.format(bundle.getString("about.content"), System.getProperty("javafx.version"), System.getProperty("java.version")));
        alert.showAndWait();
    }

    @FXML
    private void initialize() {

        firstNameColumn.setCellValueFactory(celldata -> celldata.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(celldata -> celldata.getValue().lastNameProperty());

        tfPhoneNumber.setTextFormatter(new TextFormatter<>(change -> {
            DecimalFormat format = new DecimalFormat();
            if (change.getControlNewText().isEmpty()) return change;

            ParsePosition parsePosition = new ParsePosition(0);
            Number number = format.parse(change.getControlNewText(), parsePosition);

            if (number == null || parsePosition.getIndex() < change.getControlNewText().length()) return null;
            else return change;
        }));

        tfFirstName.textProperty().bindBidirectional(viewModel.firstNameProperty());
        tfLastName.textProperty().bindBidirectional(viewModel.lastNameProperty());
        tfAddress.textProperty().bindBidirectional(viewModel.addressProperty());
        tfCity.textProperty().bindBidirectional(viewModel.cityProperty());
        tfZipCode.textProperty().bindBidirectional(viewModel.zipcodeProperty(), new NumberStringConverter());
        tfPhoneNumber.textProperty().bindBidirectional(viewModel.phoneNumberProperty());
        tfEmailAddress.textProperty().bindBidirectional(viewModel.emailAddrProperty());
        dpBirthday.valueProperty().bindBidirectional(viewModel.birthdayProperty());

        btnCommit.disableProperty().bind(viewModel.disableProperty());
        btnRollback.disableProperty().bind(viewModel.disableProperty());

        tablePeople.getSelectionModel().selectedItemProperty().addListener(((observable, oldValue, newValue) -> {
            if (newValue != null) viewModel.setPerson(newValue);
        }
        ));
    }

    public void setList(ObservableList<Person> people) {
        tablePeople.setItems(people);
    }

    @FXML
    public void doCommit(ActionEvent actionEvent) {
        viewModel.commit();
    }

    @FXML
    public void doRollback(ActionEvent actionEvent) {
        viewModel.rollback();
    }
}
