# Generics 2020

## Zadanie 1:
1. Przygotuj implementację generycznej listy jednokierunkowej
1. Dodatkowa klasa (Node), modeluje pojedynczy element: zawiera wartość elementu oraz referencje do kolejnego elementu
1. Do listy jednokierunkowej możemy: dodawać, pobierać elementy, oprócz tego możemy sprawdzać czy lista jest pusta, sprawdzać jej rozmiar, oraz usuwać wszystkie elementy
1. Przygotuj klasę Step z jednym polem o nazwie description i typie String oraz dziedziczące po niej klasy: SimpleStep i ComplexStep
1. Wykorzystaj implementację listy jednokierunkowej i stwórz trzy listy, której typami będą klasy z punktu 4
1. Wypełnij listy testowymi elementami
1. Stwórz metody "serwisowe":
    - wyświetlające wartość danego elementu z naszych list
    - wyświetlające zawartość całej listy
    - łączące ze sobą dwie listy


## Zadanie 2:
1. Zaimplementuj słownik
1. Słownik posiada dwa elementy: klucz - termin, oraz wartość - wyjaśnienie terminu. Te dwa elementy są naszymi typami parametrycznymi.
1. Do naszego słownika możemy dodawać nowe elementy, usuwać, pobierać wyjaśnienie podanego terminu, sprawdzać czy termin juz istnieje oraz sprawdzać rozmiar słownika
1. Przygotuj klasy Term, Definition; mozemy mieć różne rodzaje terminów np. terminy prawne, literackie, muzyczne...
1. Pamiętaj, że terminy w słowniku przechowywane są alfabetycznie!
1. Wykorzystaj implementację generycznego słownika i stwórz kilka słowników zawierające albo konkretne typy terminów albo ich miks, stwórz kilka danych testowych
1. Stwórz metody "serwisowe" z których:
	- wypiszesz wszystkie terminy z podanego słownika
	- zwrócisz definicję dla podanego terminu
	- połączysz ze sobą dwa słowniki
	

## Zadanie 3: Wypożyczalnia
1. Zwróc uwagę na klasę	`pl.p.lodz.zzpj2020.generics.Rental`
2. Przygotuj generyczną klasę która usunie kłopotliwe castowanie
