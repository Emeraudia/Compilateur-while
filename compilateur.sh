cd comphile/
./run_and_build.sh
cd ../
cp comphile/target/comphile-1.0-SNAPSHOT-jar-with-dependencies.jar lib/compilateur.jar
cd lib/
java -jar compilateur.jar ${1}
./run.sh ${@:2}
cd ../