#include<iostream>
using namespace std;
int fibonacci(int);
int main()
{
  int i,n;
  cin>>n;
 cout<<"The term "<<n<<" in the fibonacci series is "<<fibonacci(n-1);
  return 0;//Type your code here.
}
int fibonacci(int n)
{
  if( n<=1)
    return n;
  else
    return fibonacci(n-1)+fibonacci(n-2);
}