

#include <iostream>
using namespace std;

int main()
{
    float a, b;
    cout << "Wprowadz wartosc a: ", cin >> a;
    cout << "Wprowadz wartosc b: ", cin >> b;
    if (a > b) {
        cout << a << " jest wieksze od " << b << endl;
    }
    else if   (a<b) {
        cout << b << " jest wieksze od " << a << endl;
    }
    else  {
        cout << "liczby " << a << " i " << b << " sa rowne" << endl;
    }
}

