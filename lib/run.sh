java -jar compilateur.jar ${1}
g++ node.cpp output_while.cpp
echo
echo "Sortie du programme $1 : "
./a.out ${@:2}