// LAB_2_zadanie4.cpp : Ten plik zawiera funkcję „main”. W nim rozpoczyna się i kończy wykonywanie programu.
//

#include <iostream>
using namespace std;

int main()
{
    int liczba, iu=0, id=0, su=0, sd=0;
    

    for (int i = 0; i < 10; i++)
    {
        cout << "Wprowadz liczbe: ", cin >> liczba;
        if (liczba < 0)
        {
            
            iu++;
            su += liczba;
            
            
        }
        else
        {
            
            id++;
            sd += liczba;
        }
    }
        cout << "Liczba ujemnych: " << iu << endl;
        cout << "Suma ujemnych: " << su << endl;
        cout << "Liczba dodatnich: " << id << endl;
        cout << "Suma dodatnich: " << sd << endl;
}

// Uruchomienie programu: Ctrl + F5 lub menu Debugowanie > Uruchom bez debugowania
// Debugowanie programu: F5 lub menu Debugowanie > Rozpocznij debugowanie

// Porady dotyczące rozpoczynania pracy:
//   1. Użyj okna Eksploratora rozwiązań, aby dodać pliki i zarządzać nimi
//   2. Użyj okna programu Team Explorer, aby nawiązać połączenie z kontrolą źródła
//   3. Użyj okna Dane wyjściowe, aby sprawdzić dane wyjściowe kompilacji i inne komunikaty
//   4. Użyj okna Lista błędów, aby zobaczyć błędy
//   5. Wybierz pozycję Projekt > Dodaj nowy element, aby utworzyć nowe pliki kodu, lub wybierz pozycję Projekt > Dodaj istniejący element, aby dodać istniejące pliku kodu do projektu
//   6. Aby w przyszłości ponownie otworzyć ten projekt, przejdź do pozycji Plik > Otwórz > Projekt i wybierz plik sln
