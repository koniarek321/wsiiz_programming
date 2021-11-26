

#include <iostream>
using namespace std;

int main()
{
    int n, i = 0;
    float pkt, temp = 0, suma = 0;

    cout << "Wprowadz liczbe studentow: ", cin >> n;


    
        while (true)
        {
            cout << "Podaj liczbe punktow: ", cin >> pkt;
            if (pkt < 0 || pkt > 100)
                continue;

            i++;
            suma += pkt;
            temp = suma / n;

        }
        
    
    cout << temp << endl;
}

