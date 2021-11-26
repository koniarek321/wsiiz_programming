// LAB_2_zadanie5.cpp : Ten plik zawiera funkcję „main”. W nim rozpoczyna się i kończy wykonywanie programu.
//

#include <iostream>
using namespace std;

int main()
{
	int n, suma=0, liczba;

	cout << "wprowadz ilosc liczb ciagu: ", cin >> n;

	for (int i = 0; i < n; i++)
	{
		cout << "Wprowadz liczbe:", cin >> liczba;
		if (liczba % 2 == 0) {
			suma += liczba;			
		}
		else
			continue;
	}
	cout << suma << endl;
}

