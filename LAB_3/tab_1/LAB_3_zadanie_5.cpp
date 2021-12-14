

#include <iostream>
#include <time.h>
using namespace std;

int main()
{
    int tab[10], a,b;
    srand(time(NULL));


    cout<< "Podaj tab[0]: ",cin >> tab[0];
    cout << "Podaj tab[1]: ", cin >> tab[1];

    for (int i = 2; i < 10; i++)
    {
        tab[i] = tab[i - 1] + tab[i - 2];
        
        cout << tab[i] << endl;
    }
}


