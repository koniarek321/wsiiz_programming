

#include <iostream>
#include <string>
using namespace std;

int main()
{
    int  liczba_spolglosek = 0,liczba_samoglosek=0;
    string tekst, spolgloski = "bcdfghjklmnpqrstwxzBCDFGHJKLMNPRQSTWXZ", samogloski="aeiouóyąęAEIOUÓYĄĘ";
    cout << "Podaj stringa: ", cin >>tekst;

    

    for (int i = 0; i < tekst.length(); i++) {

        for (int j = 0; j < spolgloski.length(); j++) {
            if (tekst[i] == spolgloski[j]) liczba_spolglosek++;
        }
    }
    cout << "Ilosc spolglosek: " << liczba_spolglosek << endl;



    

    for (int i = 0; i < tekst.length(); i++) {

        for (int j = 0; j < samogloski.length(); j++) {
            if (tekst[i] == samogloski[j]) liczba_samoglosek++;
        }
    }
    cout << "Ilosc samoglosek: " << liczba_samoglosek << endl;
}


