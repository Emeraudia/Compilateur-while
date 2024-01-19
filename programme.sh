if [ -f $1 ]
then
    cd lib/
    ./run.sh "${@:1}"
    cd ../
else
    echo "le fichier source n'existe pas :/"
fi