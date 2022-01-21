

#include <iostream>
using namespace std;

int dzies_to_bin(int n) {
	if (n == 1)
		return 1;
	else if (n <= 0)
		return 0;
	cout << n % 2 << endl;
	return dzies_to_bin(n / 2);
	
		
	
}



int main()
{
	cout << dzies_to_bin(67);
}

