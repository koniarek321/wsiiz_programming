

#include <iostream>
using namespace std;


void dec_to_bin(int liczba) {
	string wynik;

	while (liczba) {
		wynik = (liczba % 2 ? "1" : "0") + wynik;
		liczba /= 2;
	}
	cout << wynik;
}

int main() {
	int liczba;
	cout << "Podaj liczbe: " << endl;
	cin >> liczba;
	dec_to_bin(liczba);
}