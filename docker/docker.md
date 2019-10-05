###installation de mysql dans un container
####info sur mes dockers installés
docker images
docker ps
docker volume ls

### recompose
docker-compose up --build

### effacement de docker
docker rm $(docker ps -a -q) -f
docker volume prune

### effacement des images docker 
docker rmi IdDEl'image
docker rmi -f `docker images -q`

####telechargement de l'image mysql
docker pull mysql

#### lancement 
docker run --name mysql -e MYSQL_ROOT_PASSWORD=fa1 MYSQL_DATABASE=escalade -e MYSQL_USER=fa1 MYSQL_PASSWORD=fa1 -d mysql:8
docker run --name climbing-mysql -e MYSQL_ROOT_PASSWORD=fafa1 -d mysql:latest
