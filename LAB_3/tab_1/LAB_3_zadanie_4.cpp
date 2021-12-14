

#include <iostream>
#include <time.h>
using namespace std;

int main()
{
    int tab[10], min;
    srand(time(NULL));

    for (int i = 0; i < 10; i++)
    {
        tab[i] = rand() % 74 - 23;
        cout << tab[i] << " ";

        if (i == 0) min = tab[i];
        else if (min > tab[i])
            min = tab[i];
    }
    cout << "min: " << min;
}

