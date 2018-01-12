## Instrukcja stawiania środowiska (wersja bez edytowania aplikacji)

1. Sklonuj repo

2. Zainstaluj MySQL (username: root, password: admin)

3. Stwórz w MySQL bazę danych "hrs"

### Wersja dla Ubuntu

1. Zainstaluj JDK w wersji co najmniej 1.8 (sprawdź czy masz: javac -version)
2. Zainstaluj Mavena (sprawdź czy masz: mvn -v)
3. Wejdź do folderu Aplikacja
4. Uruchom skrypt start.sh (Nie zamykaj procesu!
5. Wejdź w przeglądarce na stronę [http://localhost:8080](http://localhost:8080). Powinieneś zobaczyć JSONa z danymi.

### Wersja dla Windowsa (NIEZWERYFIKOWANA!)

Przeprowadź to samo, co dla linuxa, tylko komendy ze skryptów shellowych: compile.sh, a potem run.sh wykonaj ręcznie (ewentualnie skopiuj te skrypty z rozszerzeniem ".bat" i uruchom).

### Instrukcja uruchamiania aplikacji na maszynie wirtualnej

1. Uruchom wszystkie maszyny wirtualnej

2. Na każdej z maszyn sprawdź adres ip poleceniem

   ```
   ifconfig
   ```

3. Przejdź do folderu z aplikacją (na pulpice)

4. Na każdej z maszyn uruchom skrypt

   ```
   sh dbip.sh <IPL> <IP1> <IP2>
   ```

   Jako parametry podaj

   - <IPL> - adres ip danej maszyny
   - <IP1> - adres drugiej maszyny
   - <IP2> - adres trzeciej maszyny (albo dowolny)

5. Na jednej z maszyn uruchom skrypt

   ```
   sh sql.sh first-host
   ```

   Jako hasło podaj: admin

6. Na pozostałych maszynach uruchom skrypt

   ```
   sh sql.sh other-host
   ```
   Hasło również: admin

7. Na każdej z maszyn uruchom aplikację poleceniem

   ```
   sh start.sh
   ```

   ​