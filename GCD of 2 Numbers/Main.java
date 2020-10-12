#include<iostream>
using namespace std;
int gcd(int,int);

int main()
{
  int a,b;
  cin>>a>>b;
  
  cout<<"G.C.D of "<<a<<" and "<<b<< " = "<<gcd(a,b);
  return 0;
  
}
int gcd(int a,int b)
{
  if(a==0)
    return b;
  if(b==0)
    return a;
  else
    gcd(b,a%b);
}