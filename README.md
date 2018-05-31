# Project Lorann

The goal is to rewrite the old game from 1985 'LORANN' in Java.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Base

Une architecture de base vous est fournie afin que vous puissiez vous concentrer sur la conception du
jeu en lui-même.
Cette base contient :
UN PROJET MAVEN SOUS ECLIPSE
5 modules avec toutes les dépendances préconfigurées
- controller
- model
- view
- contract
- main
Le plugin Junit préconfiguré ainsi qu’un test d’exemple implémenté sur une des classes du module
contract.
Le plugin JXR préconfiguré afin de produire une documentation des fichiers sources
(http://maven.apache.org/jxr/maven-jxr-plugin/). 
Projet Java / POO / UML
Le plugin Shade préconfiguré permettant une génération d’un Uber-Jar
(http://maven.apache.org/plugins/maven-shade-plugin/). Ceci permet de ne générer qu’un seul JAR
contenant l’ensemble du projet.
Le plugin JavaDoc préconfiguré.
Le plugin SureFire préconfiguré afin de produire la documentation des résultats des test
(https://maven.apache.org/surefire/maven-surefire-plugin/). 

### Constraints

L’utilisation de Java, Maven, Git et Junit est obligatoire.
Aucun Framework graphique autre que Swing n’est autorisé.
Début du projet : Lundi 28 Mai.
Fin du projet : Mercredi 6 Juin.
L’équipe de développement sera constituée de 4 membres maximum.
Un chef de projet sera désigné. Il aura la responsabilité de :
- la bonne répartition de la charge entre les membres de l’équipe
- les livrables (délai et contenu)
- la prise de rendez-vous facultatifs (mais conseillés) avec votre tuteur
Aucune requête SQL ne devra être présente dans le code Java. L’intégralité des appels devra se faire
via des procédures stockées. 

## Deliverables

- JavaDoc complet de votre projet (tests compris)
- JXR complet de votre projet (tests compris)
- Rapport SureFire de votre projet
- Diagramme de composants
- Diagramme de packages
- Diagramme de classes (un par package)
- Diagramme de séquence (autant que vous en jugerez utiles pour comprendre et expliquer le
fonctionnement de votre programme) 
Projet Java / POO / UML
- Un rapport GIT permettant d’identifier la production de chacun des membres de l’équipe.
- Tous les autres documents que vous j

## Built With

* [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java SE Development Kit 8
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **BORRUTO Luca** - *Initial work* - [lborruto](https://github.com/lborruto)
* **WORETH Guillaume** - *Initial work* - [guillaumew74](https://github.com/guillaumew74)
* **BEN M BAREK Ahmed** - *Initial work* - [ahmed01ben](https://github.com/ahmed01ben)
