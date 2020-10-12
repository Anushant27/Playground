#include<iostream>
using namespace std;
int factorial(int);
int main()
{
  int n,fact=1;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<factorial(n);
  return 0;
  //Type your code here.
}

int factorial(int n)
{
  if(n==1)
    return 1;
  else
    return(n*factorial(n-1));
}