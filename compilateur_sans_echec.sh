echo "Compilation sans echec..."
cd comphile/
./run_and_build.sh

cd lib/
./run.sh ${@:1}
cd ../