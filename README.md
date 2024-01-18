#Compilateur While

##Architecture Projet

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

à la racine se trouve aussi les 2 scripts bash pour lancer le compilateur et un fichier texte avec un petit programme while de soustraction.

##Compilation du projet

Après avoir décompresser l’archive du projet dans un dossier suivez les étapes suivantes : 
* être sur un système qui peut exécuter des scripts bash et jar.
* écrire votre code while dans un fichier txt. exemple : “nomdufichier.txt”
* ouvrir une console et aller dans le projet
* lancer ‘ **./compilateur.sh “chemin/vers/mon/fichier/while.txt”**‘

Cela va lancer les différents scripts permettant de créer le compilateur s’il n’est pas compilé puis va compiler le programme while dans un exécutable qui seras placé à la racine du projet sous le nom “programme”.

Ce script vas aussi lancer le programme donc dans le cas ou des paramètre son nécessaire vous pouvez lancer la commande ‘**./compilateur.sh “chemin/vers/mon/fichier/while.txt” [param1 param2 …]**‘
ce qui sur un programme d’addition donne ‘**./compilateur.sh “addition.txt” 1 1**’ et devrais ressortir 2 dans la console.

Dans le cas ou vous voulez lancer le une autre fois le programme il suffit d’utiliser la commande ‘./programme [param1 param2 …]’