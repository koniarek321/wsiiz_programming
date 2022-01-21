

#include <iostream>
using namespace std;

float ciag(int n) {
    if (n == 1)
        return 0;
    else if (n == 2)
        return 0.5;
    else
        return -(ciag(n - 1)) * ciag(n - 2);
}

int main()
{
    cout << ciag(16);
}

