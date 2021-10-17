

#include <iostream>
using namespace std;
int main()
{

	int a, b, c;
	cout << "Podaj a: ", cin >> a;
	cout << "Podaj b: ", cin >> b;

	cout << "Wybierz dzialanie:\n1. dodawanie\n2. odejmowanie\n3. mnozenie\n4. dzielenie\n ", cin >> c;

	switch (c)
	{
	case 1:
		cout << "Wynik: " << a + b;
		break;
	case 2:
		cout << "Wynik: " << a - b;
		break;
	case 3:
		cout << "Wynik: "<< a * b;
		break;
	case 4:
		cout << "Wynik: " << a / b;
		break;
	default:
		break;
	}

}

