echo "Compilation sans echec..."
cd comphile/
./run_and_build.sh
cd ../
cp comphile/target/comphile-1.0-SNAPSHOT-jar-with-dependencies.jar lib/compilateur.jar
cd lib/
./run.sh ${@:1}
cd ../