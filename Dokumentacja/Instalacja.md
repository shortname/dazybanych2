### Instrukcja instalacji systemu

Instrukcja dla systemu operacyjnego Linux Ubuntu 17.10.

1. Należy przygotować bazę danych zgodnie z opisem z rozdziału "Opis implementacji mechanizmu replikacyjnego multi-master".

2. W konsoli bazy danych należy uruchomić polecenie

   ```sql
   create database hrs;
   ```

3. W folderze głównym aplikacji uruchomić skrypt run.sh poleceniem

   ```shell
   sh run.sh
   ```

4. Aplikacja będzie odtąt dostępna w przeglądarce internetowej pod adresem [http://localhost:8080/project](http://localhost:8080/project)