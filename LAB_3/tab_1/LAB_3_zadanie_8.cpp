

#include <iostream>
using namespace std;

int main()
{
    int tab1[4][5];
    int tab2[4][5], a = 1;
    int tab3[4][5];

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5; j++) 
        {
            tab1[i][j] = a;
            a++;
            cout << tab1[i][j] << "\t";
        }
    cout << endl;
    }

    cout << endl;

    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5; j++)
        {
            tab1[i][j] = a;
            a++;
            cout << tab2[i][j] << "\t";
            
        }
        cout << endl;
    }

    cout << endl;
    
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5; j++)
        {
            tab3[4][5] = tab1[i][j] + tab2[i][j];
            cout << tab3[i][j] << "\t";
        }
        cout << endl;
    }
}


