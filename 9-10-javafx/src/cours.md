# Cours 9
- Principes du MVC. JavaFX utilise le MVC pattern.
- Paramétrage du projet : le projet sera modulaire via Jigsaw. Java9 minimum requis (Java13 recommandé pour JavaFX).
    - mise à jour de gradle vers la v6 (important!). Ouvrir *gradle\wrapper\gradle-wrapper.properties*
    
    - build.gradle.kts
        - ajouter le plugin *application* et *javafxplugin* (voir ligne 4). Ce plugin installera automatiquement JavaFX.
        - modifier la version de java (ligne 19)
        - configurer le module *javafx* (lignes 22-26). Indique les modules à utiliser et la version de JavaFX.
        - configurer le module *application* (lignes 28-32). Indique la classe principale du programme. Utiliser ${moduleName} à cause de Jigsaw.
    
    - créer à la base des sources le fichier **module-info.java**
        - création du package et de la classe principale.
        Pour que les tests fonctionnent, il faut modifier le *classpath* afin d’intégrer **javafx**. La tâche ***run*** de
        Gradle permet d’inclure correctement le classpath. Il faut donc utiliser ***run*** depuis Gradle au lieu de la
        compilation standard.

- Installer le plugin SceneBuilder (par Gluon) (ou installer SceneBuilder en autonome - préféré)
    - Objet métier Person + propriétés (StringProperty …)
    - Conception de l’interface graphique en fxml (à mettre dans resources - *mainview.fxml*)
    - Création du contrôleur *MainViewController*. Ouvrir le *mainview.fxml* dans l’IDE et suivre toutes les remarques de l’IDE.
    modifier la portée **public** de tous les éléments en **private** et ajouter *@FXML*
    - Typage des objets (lignes 27-31 du *MainViewController*)

- Contrôleur et chargement du fxml (*MainApp*)
     - Chargement du FXML dans MainApp
     - Notion de Scene et de Stage
     - Ajout du titre de l’application
     - Premier affichage de l’interface graphique via ***run***
     
# Cours 10
- Ajout d’une icône (MainApp - ligne 39)
- Collection d’Observable dans MainApp. Comment passer cette liste dans le contrôleur ?
    - Appeler *getController* après le chargement du fxml (MainApp - ligne 42)
    - Afficher les **dummies** (*fill_dummies* dans MainApp)
        - Méthode *initialize* dans le **MainViewController**
        - Notions de Binding
        - Création d’un *formatter* pour bloquer le textfield **zipcode** en chiffres uniquement
    
    - PersonViewModel : objet permettant la modification d’un contact sans modifier la liste. Permet aussi de *commit* ou de *rollback* via les bindings
    
     - MainViewController
        - Modifier la méthode *initialize*
        - Ajout du code sur les boutons
- Dialogs (non vu)
- ResourceBundle et CSS
     - Création du ResourceBundle
     - Modification du fxml avec des %
     - Modification des fichiers sources avec bundle.getString
     - CSS