
#include <string>
#include <iostream>
using namespace std;


int main()
{
    char str[9], str2[15], str3[20]="DOM";
    
    cout << "Podaj stringa do 10 znakow: ", cin >> str;
    cout << "Podstawowa wersja stringa: " << str << endl;
    
     strcpy_s(str2, str);
     cout << "Kopia string do string2: " << str2 << endl;

     strcat_s(str3, str);
     cout<<"Laczenie: " << str3 << endl;

     string suma;
     suma = str3;

     cout<<"Liczba znakow: " << suma.length() << endl;



    
    
    

    







}


