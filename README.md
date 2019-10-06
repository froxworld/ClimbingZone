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


###infos sur docker 
## List Docker CLI commands
docker
docker container --help

## Display Docker version and info
docker --version
docker version
docker info

## Execute Docker image
docker run hello-world

## List Docker images
docker image ls

## List Docker containers (running, all, all in quiet mode)
docker container ls
docker container ls --all
docker container ls -aq
