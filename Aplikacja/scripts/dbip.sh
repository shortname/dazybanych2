sudo systemctl stop mysql &&
sudo sed -e "s/<IPL>/192.168.8.$1/g" -e  "s/<IP1>/192.168.8.$2/g" -e "s/<IP2>/192.168.8.$3/g" pattern.cnf > my.cnf &&
sudo mv my.cnf /etc/mysql/my.cnf &&
sudo systemctl start mysql;
