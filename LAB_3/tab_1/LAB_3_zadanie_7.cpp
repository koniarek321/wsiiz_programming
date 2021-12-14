

#include <iostream>
using namespace std;

int main()
{
    int tab[4][4], a=1, suma=0;
    

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++)
        {
            tab[i][j] = a;
            a++;
            cout << tab[i][j] << "\t";
            if (i == j)
            {
                suma += tab[i][j];
            }
        }
        cout << endl;
    }
    cout << suma << endl;
}


