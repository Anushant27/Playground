#include<iostream>
using namespace std;
int main()
{
  int a,b,c[10];
  cin>>a>>b;


  for(int i=0;i<a;i++)
    {
      cin>>c[i];
    }
    if(a>b)
    {
      cout<<b;
      
    }
    else if(a<=b)
    {
      cout<<a;
    }
}