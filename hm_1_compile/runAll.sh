#!/bin/sh

cd console/

. ./runConsole.sh

cd ../

cd ant/

. ./runAnt.sh

cd ../../maven/app/

. ./runMaven.sh

cd ../../