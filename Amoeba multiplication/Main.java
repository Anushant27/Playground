#include<iostream>
using namespace std;
int main()
{
  int a=0,b=1,c,i,n;
  cin>>n;
  for(i=1;i<n-1;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  cout<<c;
  //Type your code here.
}