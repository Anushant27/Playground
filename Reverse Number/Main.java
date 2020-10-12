#include <iostream>
using namespace std;

int main() 
{
	int i,n,rem,rev;
  cin>>n;
  while(n!=0)
  {
    rem=n%10;
    rev=rev*10+rem;
    n=n/10;
  }cout<<rev;// Type your code here
	return 0;
}