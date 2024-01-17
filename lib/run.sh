java -jar compilateur.jar ${1}
g++ node.cpp output_while.cpp -o "programme"
rm output_while.cpp
mv programme ../programme
cd ../
echo
echo "Sortie du programme $1 : "
./programme ${@:2}