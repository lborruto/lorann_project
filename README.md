# Project Lorann

The goal is to rewrite the old game from 1985 'LORANN' in Java.

## Getting Started

Il ne s‘agit pas de reproduire à l’identique cet abandonware. Ainsi, pour accéder aux différents niveaux
du jeu (au nombre de 101), l’utilisateur devait déplacer le personnage (zone jeu) dans une salle
permettant l’accès aux niveaux. Toute cette partie n’est bien entendu, pas demandée.
De plus, le jeu original intègrait un éditeur de niveau (zone atelier) incluant des contrôles permettant
de valider la jouabilité et la viabilité du niveau. Cette fonctionnalité n’est, elle non plus, pas demandée.
Il s’agit de réaliser quelques niveaux (5 suffiront) accessibles par paramétrage dans le code. C’est-à-
dire pour être plus explicite, qu’il n’est pas nécessaire que vous implémentiez une fonctionnalité
permettant de changer de niveau au sein même du jeu. L’accès à un niveau différent pourra se faire 
Projet Java / POO / UML
via un paramètre dans votre code, un fichier de configuration ou un enregistrement dans votre base
de données.
Les niveaux devront impérativement être stockés dans une base de données.
Beaucoup d’éléments graphiques sont présents dans le jeu. Certains représentent des éléments de
décors des niveaux, d’autres des items à ramasser ou à éviter et certains des éléments mobiles. Il est
inutile de tous les implémenter.
Seuls les éléments suivants du jeu sont attendus : 

![Alt text]http://prntscr.com/jowakd

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
- Tous les autres documents que vous jugerez nécessaires (MCD, procédures stockées, autres
diagrammes, commentaires, …) 

## Built With

* [Eclipse](https://www.eclipse.org/) - Eclipse Integrated Development Environment
* [Java](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java SE Development Kit 8
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **BORRUTO Luca** - *Initial work* - [lborruto](https://github.com/lborruto)
* **WORETH Guillaume** - *Initial work* - [guillaumew74](https://github.com/guillaumew74)
* **BEN M BAREK Ahmed** - *Initial work* - [ahmed01ben](https://github.com/ahmed01ben)
