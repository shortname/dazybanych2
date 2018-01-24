### Podsumowanie

W ramach zajęć projektowych udało się skonfigurować i użyć w działającej aplikacji internetowej mechanizm replikacji synchronicznej typu multimaster.

Bazę danych i mechanizm replikacji oparto o system MySQL i dostępne w nim narzędzia konsolowe i pliki konfiguracyjne. Ponadto stworzono aplikację kliencką stworzoną na platformie Java z użyciem bibliotek Spring Framework. W ramach aplikacji stworzono także obiektowy schemat bazy danych, który został przetłumaczony na stosowany w systemie MySQL system relacyjny z użyciem mechanizmów ORM biblioteki Hibernate.

Przy projektowaniu i implementacji systemu posługiwano się oprogramowaniem Visual Paradigm (do tworzenia modeli) i IntelliJ IDEA (do pisania kodu języka Java).

Celem przetestowania mechanizmu replikacji aplikację kliencką wraz z odpowiednio skonfigurowaną bazą danych umieszczono na trzech maszynach wirtualnych z systemem Ubuntu stworzonych z użyciem oprogramowania VMware i zrealizowano na każdej z nich operacje CRUD. Replikacja przebiegła pomyślnie zarówno przy wszystkich maszynach aktywnych, jak i po wyłączeniu replikacji na wybranych maszynach i uruchomieniu jej ponownie. 

Wobec powyższego można uznać, że projekt zakończył się sukcesem.

