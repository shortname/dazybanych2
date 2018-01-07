sudo systemctl stop mysql &&
sudo sed "s/<IP>/$1/g" pattern.cnf > my.cnf &&
sudo mv my.cnf /etc/mysql/my.cnf &&
sudo systemctl start mysql;
