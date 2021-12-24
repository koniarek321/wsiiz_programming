

#include <iostream>

using namespace std;


double kolo(int r) {
    double pole, pi = 3.14;
    pole = pi * pow(r, 2);
    return pole;
}

float prostokat(float a, float b) {
    float pole = a * b;
    return pole;
}

float trojkat(float a, float h) {
    float pole = (a * h) / 2;
    return pole;
}


float szescian(float a) {
    float pole = 6 * pow(a, 2);
    float obj = pow(a, 3);
    cout << "Pole: " << pole << endl;
    cout << "Objetosc: " << obj << endl;
    return 0;
}

float walec(float r, float h) {
    float pi = 3.14;
    float Pp = pi * pow(r, 2);
    float Pb = 2 * pi * r * h;
    float pole = 2 * Pp + Pb;
    float obj = Pp * h;
    cout << "Pole: " << pole << endl;
    cout << "Objetosc: " << obj << endl;
    return 0;
}




int main()
{
    cout << kolo(5.2) << endl;
    cout << endl;
    cout << prostokat(5.1, 7.7) << endl;
    cout << endl;
    cout << trojkat(4.2, 23.5) << endl;
    cout << endl;
    cout << szescian(7.65) << endl;
    cout << endl;
    cout << walec(5.24, 7.5) << endl;
}



