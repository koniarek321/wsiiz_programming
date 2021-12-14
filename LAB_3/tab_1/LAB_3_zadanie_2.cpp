

#include <iostream>
using namespace std;

int main()
{
    int tab[10], temp = 3;

    for (int i = 0; i < 10; i++)
    {
        tab[i] = temp;
        temp += 3;
        if (i % 2 != 0)
            cout << tab[i] << endl;
    }

}

