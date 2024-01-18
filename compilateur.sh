if [ -f $1 ]
then
    if [ -f lib/compilateur.jar ]
    then
        cd lib/
        ./run.sh ${@:1}
        cd ../
    else
        ./compilateur_sans_echec.sh ${@:1}
    fi
else
    echo "Le fichier entrée n'existe pas :/"
fi