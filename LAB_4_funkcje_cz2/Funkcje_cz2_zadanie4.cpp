

#include <iostream>
using namespace std;


//REKURENCYJNIE

int silnia(int n) {
    if (n < 2)
        return 1;
    return n * silnia(n - 1);
}

int main()
{
    //cout << silnia(6);

    //ITERACYJNIE

    int k;
    cout << "Podaj k: ", cin>> k;
    int iloczyn = 1;
    for (int i=k; i >1; i--) {
        
        iloczyn *= i;
        
    }
    cout << iloczyn << endl;

}

