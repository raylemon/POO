#Cours 6
- Notion sur Gradle
    - But : simplifier l’installation des bibliothèques
    - Avantages de Gradle
    - Utilisation de Gradle
    - Installer la dernière version (modifier gradle\wrapper\gradle-wrapper.properties) et changer la version pour 6.0.1
    - Modifier le build.gradle.kts
        - modifier *dependencies* en supprimant junit et en ajoutant:
            - **implementation(group = "com.h2database", name = "h2", version = "1.4.196")**
            - **implementation(group = "org.fluttercode.datafactory", name = "datafactory", version = "0.8")**
            - **implementation("com.esotericsoftware:minlog:1.3.1")** (non expliqué en classe par manque de temps)
        - Modifier le niveau de langage de java (ici 12 - ligne 21)
        - Ajouter le plugin *application*. Il permet d’ajouter une tâche ***run***
            - Ajouter la classe principale dans la configuration de l’application (lignes 24-26)
- Conception des *beans*
- Onglet *Database* d’IntelliJ pour créer une datasource H2 in memory et tester l’écriture de script SQL
- Écriture d’une MainApp pour simuler un CRUD

#Cours 7
- Notion d’interfaces et de généricité
    - Écriture de l’interface DAO
- Singleton Pattern (ConnectionSingleton)
    - Utilisation d’une DataSource H2
    - Connection
    - Script de création de la DB (via *Statement* - non recommandé)
- Classes abstraites et héritage
    - H2DAO et implémentations
- Écriture d’un CRUD
    - PreparedStatement (*recommandé*)
    - try-with-resources

#Cours 8
- Rappels sur l’héritage et les classes abstraites
- Suite du projet.