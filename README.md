# Compilateur While

## Architecture Projet

Le répertoire comphile contient une architecture Maven avec dans le fichier src le programme java qui Parse le code while en code C++.
Le répertoire src/java/tlc contient :
* analyzer -> table des symbole
* antlr -> Parser + Lexer
* code3adress -> code
* generator -> code C++
* util -> Les outils nécéssaires

Le répertoire doc qui continent l'énoncé du projet
Le répertoire grammaire contient le fichier while.g qui permet de générer l'AST
le répertoire lib contient la librairie C++ 
le répertoire Exemples qui contient une base de données de programme while a tester

à la racine se trouve aussi les 2 scripts bash pour lancer le compilateur et un fichier texte avec un petit programme while de soustraction.

## Compilation du projet

Après avoir décompresser l’archive du projet dans un dossier suivez les étapes suivantes : 
* être sur un système qui peut exécuter des scripts bash et jar.
* écrire votre code while dans un fichier txt. exemple : “nomdufichier.txt” ou utiliser les fichiers du répertoire Exemples
* ouvrir une console et aller dans le projet
* lancer ‘ **./compilateur.sh”**‘ cela vas compiler le compilateur
* lancer ' **./programme.sh “chemin/vers/mon/fichier/while.txt” [param1 param2 …]** afin d'exécuter votre programme  
(si vous n'avez pas fait l'étape précédente, pas de panique, une sécurité est la pour le faire a votre place ;p )

Ce qui sur un programme d’addition donne ‘**./programme.sh “Exemples/add.txt” 1 1**’ et devrais ressortir 2 dans la console.