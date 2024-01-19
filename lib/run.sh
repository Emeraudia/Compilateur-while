fichier="${1##*/}"
fichier="${fichier%".txt"}"
if ! [ -f compilateur.jar ]
then
    echo "pas de compilo T_T"
    cd ../
    ./compilateur.sh
    cd lib/
fi
java -jar compilateur.jar ${1}
g++ node.cpp output_while.cpp -o "last_compil"
rm output_while.cpp
echo 
echo "Sortie du programme $fichier : "
./last_compil "${@:2}"