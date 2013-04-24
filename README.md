TEST
=========
######## ISTY INI 1     ######## 
######## NAHA MYRIAM    ######## 
######## GARBAYA SYRINE ######## 
######## 24 / 04 / 2013 ######## 

This is a java project to learn about Maven / GIT / Collections ...add a lot of other things

The sujbect of the project : 

On veut simuler le fonctionnement d’un système de ﬁchier. Un ﬁchier est représenté par son nom et
sa taille. Un répertoire est déﬁni par son nom et peut contenir des ﬁchiers et/ou des répertoires. La
base de l’arborescence du système de ﬁchier est le répertoire racine.
On veut pouvoir calculer la taille totale d’un répertoire.

1. Proposer une implémentation de ce modèle.
2. Créer une arborescence de test et vériﬁer le calcul de la taille.

  Le CC de POO/TOI est à rendre pour le 24/04/2013 en respectant les contraintes suivantes :
  - le travail s'effectue en binôme,
  - le code source de l'exercice 2.3 (système de fichier) de POO est à rendre,
  - le code doit respecter les conventions SUN (y compris Javadoc),
  - la gestion d'erreur se fera avec des exceptions,
  - les classes devront se trouver dans un package nommé filesys,
  - le projet devra inclure des tests JUnit 4 pertinents, en particulier :
    * différentes situations pour le calcul de taille,
    * on ne peut pas ajouter une référence null à un répertoire,
    * on ne peut pas ajouter dans un répertoire un élément de même nom qu'un élément déjà dans le répertoire,
    * un répertoire ne peut pas être ajouté à lui-même,
    * un répertoire ne peut pas être un sous-répertoire de lui-même (même indirectement).
  - le projet doit être un projet maven avec les caractéristiques suivantes (hors IDE) :
    * "mvn package" doit générer un jar du projet,
    * "mvn site" doit créer le site du projet intégrant la documentation Javadoc, le rapport Checkstyle et Findbugs, le rapport des tests JUnit 4.
  - le projet devra être disponible sur github :
    * plusieurs commits devront être visibles,
    * aucun élément généré ne devra se trouver dans le système de gestion de versions (javadoc, .class, ...).

License
-------
You may use under the terms of the my License.
@dd have fun


Code Layout
-----------
You need Maven

Please try mvn package to compile
