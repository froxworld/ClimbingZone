# ClimbingZone
pour sortir CTRL D


##### Docker-compose
ps aux | grep mysql

docker-compose up

pour aller sur la machine distante :
Acces BD:
docker-compose exec db bash
Accès vueJs
docker-compose exec vue-client /bin/sh
Accès Angular
docker-compose exec angular-client /bin/sh




pour appeler l'api sur le reseau docker
ne pas utiliser localhost:8080
mais api:8080
