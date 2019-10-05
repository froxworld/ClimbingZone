//installation de mysql

sudo apt-get update
sudo apt-get install mysql-server

// pour mettre les mot de passe 
// du coup celui normal de l'université Fafa... ..!

If you have iptables enabled and want to connect to the MySQL database from another machine, you must open a port in your server’s firewall (the default port is 3306). You don’t need to do this if the application that uses MySQL is running on the same server.
Run the following command to allow remote access to the mysql server:

sudo ufw enable
sudo ufw allow mysql

sudo mysql_secure_installation utility

To ensure that the database server launches after a reboot, run the following command:
sudo systemctl enable mysql



