

#include <iostream>
#include <string>
using namespace std;

int main()
{
    int  skill, staz;
    char ulica[20], nr_domu[20];

    cout << " Podaj nazwę ulicy na której mieszkasz: ", cin.get(ulica,20);
    cout << "Podaj nr domu: ", cin >> nr_domu;
    cout << "Na ile oceniasz swoje umiejętności programowania w skali[2 - 5] :", cin >> skill;
    cout << "Twój staż programistyczny :", cin >> staz;

    cout << endl;

    cout << " Podaj nazwę ulicy na której mieszkasz: " << ulica << endl;
    cout << "Podaj nr domu: " << nr_domu << endl;
    cout << "Na ile oceniasz swoje umiejętności programowania w skali [2 - 5]: " << skill << endl;
    cout << "Twój staż programistyczny: " << staz << endl;
    
    strcat_s(ulica, nr_domu);
    cout << "Adres: " << ulica << endl;
    if (skill <= 2) {
        cout << "Ocena: " << 2 << endl;
    }
    else if (skill > 6) {
        cout << "Ocena: " << 5 << endl;
    }
    else {
        cout << "Ocena: " << skill - 1 << endl;
    }

    cout << "Staz: " << staz << " dni" << endl;

    

       
}

