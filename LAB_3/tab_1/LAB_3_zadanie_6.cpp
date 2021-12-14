

#include <iostream>
using namespace std;

int main()
{
    int tab[19], temp=0;

    for (int i = 0; i < 10; i++)
    {
        temp += 3;
        tab[i] = temp;
        
    }
   
    for (int i = 10; i < 20; i++)
    {
        tab[i] = tab[i - 10];
        
        
    }
    for (int i = 0; i < 20; i++)
    {
        cout << tab[i] << endl;
    }
}


