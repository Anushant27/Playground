#include <iostream>
using namespace std;

int b_d(int n)
{
  int bin_dec[32],i,j;
  while(n>0)
  {
    bin_dec[i]=n%2;
    i++;
    n=n/2;
  }
  for (j = i - 1; j >= 0; j--) 
        cout << bin_dec[j]; 
}
int main() 
{
  int n;
  cin>>n;
  b_d(n);
  return 0;
}