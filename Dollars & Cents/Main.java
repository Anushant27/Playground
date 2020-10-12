#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,m,n;
  cin>>a>>b>>c>>d;
  m=a+c;
 
  n=b+d;
  if(n>100)
  {
    m=m+(n/100);
  n=n%100;
  }
  cout<<m<<endl<<n;
  //Type your code here.
}