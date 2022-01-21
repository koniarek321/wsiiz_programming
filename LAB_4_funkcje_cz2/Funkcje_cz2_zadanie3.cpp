
#include <iostream>
using namespace std;


int cFibo(int n) {
    if (n == 0)
        return 0;
    else if (n == 1)
        return 1;
    else if (n > 1)
        return cFibo(n - 2) + cFibo(n - 1);
   

}

int main()
{
    cout << cFibo(5) << endl;
}


