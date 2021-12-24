

#include <iostream>
using namespace std;

void dwusilnia(int n) {
    if (n > 0 && n<=30) {
        if (n % 2 == 0) {
            int wynik =1, iloczyn = n+2;
            for (int i = 0; i < n; i++) {
                if (iloczyn < 3) break;

                iloczyn -= 2;
                wynik *= iloczyn;
                cout << wynik << endl;
            }
        }
        else {

            int wynik = 1, iloczyn = n + 2;
            for (int i = 0; i < n; i++) {
                if (iloczyn <2) break;

                iloczyn-=2;
                wynik *= iloczyn;
                cout << wynik << endl;
            }
        }
    }
    else if (n == 0) {
        cout << "Wynik: 1";
    }
    else
        cout << "Wartosc 'n' musi byc liczba nieujemna i mniejsza od 31" << endl;
}



int main()
{
    dwusilnia(31);
}

