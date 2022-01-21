

#include <iostream>
using namespace std;

int NWD(int a, int b)
{
    if (b != 0)
        return NWD(b, a % b);

    return a;
}




int main()
{
    cout << NWD(80, 100);
}

