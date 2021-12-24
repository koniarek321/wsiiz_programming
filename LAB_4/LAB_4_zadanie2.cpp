
#include <iostream>
using namespace std;


bool LiczbaPierwsza(int liczba) {
    for (int i = 2; i < liczba; i++) {
        if (liczba % i == 0) {
            return false;
        }
        return true;
   }

    
}

int main()
{
    cout << LiczbaPierwsza(8) << endl;
}
