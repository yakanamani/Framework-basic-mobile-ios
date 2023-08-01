# TestNG Framework with Appium, Java 11 and Allure Report on IOS
Le Framework Basic Mobile IOS est un framework d'automation de test mobile basé sur Appium et TestNG, contenant Allure Report et qui s'exécute sur les devices et simulateurs IOS.

Si vous souhaitez tester une application mobile de préférence sur `IOS` et `Mac`.<br/>
🌟Si vous êtes `TESTEUR AUTOMATICIEN` et que vous voulez apprendre à automatiser des tests fonctionnels.<br/>
🌟Si vous êtes un `RECRUTEUR` pour évaluer les compétences de nos testeurs automaticiens talentueux.<br/>
🌟 Ou encore si vous êtes un `PARTICULIER` ou une `ENTREPRISE` à la recherche de solution répondant à vos besoins d'automatisation en test alors ce framework est fait pour vous!<br/><br/>

🎁 Ce framework permet d'exécuter vos tests en séquentiel sur le périphérique IOS de votre choix, que ce soit un device physique ou un simulateur IOS et également sur la plateforme Mac.<br/>
🎁 Vous pouvez consulter un rapport détaillé des tests avec Allure report.<br/>

### 🎯Sommaire:
🏷️[Architecture et Présentation du framework](#architecture-et-présentation-du-framework)<br/>
🏷️[Technologies et outils utilisés](#technologies-et-outils-utilisés)<br/>
🏷️[Fonctionnalités](#fonctionnalités)<br/>
🏷️[Environnement de développement](#environnement-de-dévelopement)<br/>
🏷️[Installation du framework](#installation-du-framework)<br/>
🏷️[Pré-requis](#prérequis)<br/>
🏷️[Exécution du framework](#exécution-du-framework)<br/>
🏷️[Reporting](#reporting)<br/>
🏷️[Mise à jour et adaptation du Framework](#mise-à-jour-et-adaptation-du-framework)<br/>
🏷️[Déboggage et Maintenance](#déboggage-et-maintenance)<br/>

### 🎯Architecture et Présentation du framework 
````
📦framework-basic-mobile-ios
┣ 📂src
┃ ┣ 📂main
┃ ┃ ┣ 📂resources
┃ ┃ ┃ ┗ 📜config.properties
┃ ┣ 📂test
┃ ┃ ┣ 📂java
┃ ┃ ┃ ┣📂FrameworkSimpleIos
┃ ┃ ┃ ┃ ┣ 📂base
┃ ┃ ┃ ┃ ┃ ┗ 📜BaseTest.java
┃ ┃ ┃ ┃ ┣ 📂pages
┃ ┃ ┃ ┃ ┃ ┗ 📜LoginPage.java
┃ ┃ ┃ ┃ ┃ ┗ 📜MenuPage.java
┃ ┃ ┃ ┃ ┃ ┗ 📜ProductPage.java
┃ ┃ ┃ ┃ ┃ ┗ 📜SettingsPage.java
┃ ┃ ┃ ┃ ┃ ┣ 📂tests
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜LoginTests.java
┃ ┃ ┃ ┃ ┃ ┣ 📂utils
┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TestUtils.java
┃ ┃ ┣ 📂resources
┃ ┃ ┃ ┃ ┣ 📂app
┃ ┃ ┃ ┃ ┃ ┗ 📑app.MyRNDemoApp.app
┃ ┃ ┃ ┃ ┣ 📂data
┃ ┃ ┃ ┃ ┃ ┗ 📑loginUsers.json
┃ ┃ ┃ ┃ ┣ 📂strings
┃ ┃ ┃ ┃ ┃ ┗ 📑strings.xml
┃ ┃ ┃ ┃ ┗ 📑allure.properties
┃ ┃ ┣ 📂Test-output
┃ ┃ ┃ ┗ 📂allure-report
┃ ┃ ┃ ┗ 📂allure-results
┣ 📑pom.xml
┣ 📑README.md
┣ 📑testng.xml
````

## 🎯Technologies et outils utilisés

➡️IntelliJ - IDE<br/>
➡️Appium - Mobile Automation library<br/>
➡️Maven - Build automation tool<br/>
➡️Java - Programming language<br/>
➡️TestNG - Unit testing framework<br/>
➡️Allure Reports - Reporting framework<br/>

## 🎯Fonctionnalités

✅ Abstraction layer pour les intérations UI (click, sendkeys, ...)<br/>
✅ Paramétrisation par les fichier TestNG XML et config.properties<br/>
✅ Abstraction layer pour les jeux de données<br/>
✅ Abstraction layer pour les textes statiques<br/>
✅ Exécution sur devices physiques (et/ou Simulateur )iOS<br/>
✅ Démarrage automatique programmé du serveur Appium<br/>


## 🎯Environnement de dévelopement

| **Logiciel**                   | **version**       | **Description**                                                                                                                                                          |**Macbook** |
|--------------------------------|-------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| Java JDK                       | JAVA 11           | [Dowloadable here](https://www.oracle.com/eg/java/technologies/javase/jdk11-archive-downloads.html)                                                                      |X           |
| Android SDK via Android studio | current available | [Dowloadable here](https://developer.android.com/studio?gclid=Cj0KCQjwuLShBhC_ARIsAFod4fIcuMWb00yxfjGTPrFEemQ_pc3UrvmvB45VSYcnueWrfyX8fLJpz_4aAthfEALw_wcB&gclsrc=aw.ds) |X           |
| Node.js                        | 18.15.0           | [Dowloadable here](https://nodejs.org/en/download)                                                                                                                       |X           |
| npm                            | 9.5.0             | Downloaded with node.js                                                                                                                                                  |X           |
| appium                         | 2.0.0-beta.59     | terminal: npm install -g appium@next                                                                                                                                     |X           |
| appium client (wd)             | current available | terminal: npm install wd                                                                                                                                                 |X           |
| Carthage                       | -                 | terminal: brew install carthage                                                                                                                                          |X           |
| libimobiledevice               | current available | terminal : brew install libimobiledevice                                                                                                                                 |X           |
| Xcode                          | -                 | Downloadable via App Store                                                                                                                                               |X           |
| Authorize-ios                  | current available | terminal : npm install authorize-ios                                                                                                                                     |X           |
| ios-deploy                     | current available | terminal : npm install ios-deploy                                                                                                                                        |X           |
| ideviceinstaller               | current available | terminal : npm install ideviceinstaller                                                                                                                                  |X           |
| maven                          | 3.8.6             | terminal : brew install maven                                                                                                                                            |X           |

## 🎯Installation du framework

#### Prérequis
🟥 NB: POUR EXÉCUTER CE FRAMEWORK, VOUS DEVEZ AVOIR UNE BONNE CONNEXION INTERNET !

- Devices
  - 📌**Device physique**
  
  | **Pré-requis**                        | **Obligatoire** | 
  |---------------------------------------|-----------------|
  | Mode développeur activé sur le device | x               | 
  | Débogage usb activé                   | x               | 
  | Connexion internet activée            | x               | 
  | Device déverouillé                    | x               | 
  | Device connecté au poste via usb      | x               | 

  - 📌**Simulateur** : </br>
    - Le simulateur doit être lancé et en bon état de marche

#### 🎯Mise à jour du fichier testng.xml
- Remplir les informations concernant le device utilisé pour les tests automatisés  
  Les informations concernant les caractéristiques du device sont a modifier dans le fichier config.properties  (path_du_repertoire_du_framework/src/main/resources/config.properties)

  1) **Mettre a jour le paramètre platformName**
  2) **Mettre a jour le paramètre udid**:
    Il est récupérable depuis le terminal (Le device doit etre connecté a l'ordinateur(device physique) ou démarré (device virtuel))
    ```bash
        # Terminal  
        xcrun simctl list
    ```
  3) **Mettre la jour la variable emulator**:
    - True (Simulator)
    - False (Real device)

## 🎯Exécution du framework

- **Depuis l'IDE**:</br>
  Depuis un éditeur de code, lancer l'exécution du fichier **testng.xml**

- **Depuis la CLI** (Command Line Interface = invite de commandes):</br>
  Commandes a exécuter depuis un terminal:
```shell
  cd project_repository
  mvn clean test
```
## 🎯Reporting 
Les différents rapports et artefacts resultants de l'exécution des tests seront disponnibles dans le dossier:
- **_test-output_**/**_allure-report_**

## 🎯Mise à jour et adaptation du Framework

#### 🪙Ajouter une nouvelle application
1. Ajouter la(les) nouvelle(s) application(s) dans le dossier **apps** (_chemin d'accès_: src/test/resources/apps)
2. Mettre a jour les informations de l'application dans le fichier **config.properties**(_chemin d'accès_: src/main/resources/config.properties)</br>

   | **Variable** | **value**        |   
   |--------------|------------------|
   | AppLocation  | app_path         | 
   | BundleId     | apk_BundleId     | 
   | udid         | apk_package_name |

#### 🪙Ajouter de nouveaux tests
La redaction des tests se fera dans le dossier **tests** (_chemin d'accès: src/test/FrameworkSimpleIos/tests_ ) grâce au page Object Design pattern.
Les pages du Page OBject Design pattern seront ,quand à elles , définies dans le dossier **pages** (_chemin d'accès: src/test/java/FrameworkSimpleAndroid/pages_)

## 🎯Déboggage et Maintenance

### 🔴Débogage
- Erreur suite à une tentative de **_Build module_** :
  Vérifier que l'environnement de travail et l'IDE sont bien paramétrés pour **Java 11**
- Erreur suite à une tentative de **_maven compile_** :
  Vérifier que l'environnement de travail et l'IDE sont bien paramétrés pour **Java 11**

### 🔴Maintenance
- **_Dépendances_**:
  Régulièrement vérifier le fichier pom.xml pour s'assurer que les dependances sont a jour, si non les mettre a jour.
  Site de téléchargement des dépendances maven : https://mvnrepository.com
