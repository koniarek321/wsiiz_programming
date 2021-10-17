

#include <iostream>
using namespace std;


int main()
{
	int a;
	cout << "Podaj liczbe do sprawdzenia: ", cin >> a;
	if (a % 2 == 0) {
		cout << a + " jest liczba parzysta" << endl;
   }
	else {
		cout << a + " jest liczba nieparzysta" << endl;
	}
}

