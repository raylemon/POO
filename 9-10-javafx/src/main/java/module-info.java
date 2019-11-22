/* Configuration du module
    Modifier le package selon vos besoins
 */
module be.ifosup.poo.javafx {
    //Utilisation des modules de javafx
    requires javafx.controls;
    requires javafx.fxml;
    opens be.ifosup.poo.javafx.controllers to javafx.fxml; //ouverture du package de notre application à fxml pour accéder aux fonctions de JavaFX.
    exports be.ifosup.poo.javafx.beans; //exportation du package.
    exports be.ifosup.poo.javafx;
}