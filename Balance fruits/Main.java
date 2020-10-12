#include <iostream>
using namespace std;

int main() 
{
  int a,m,rs,x;
  cin>>a>>m>>rs;
  if(a>m)
  {
    x=abs(a-m);
    cout<<rs-x;
  }
  else
  {
    x=m-a;
    cout<<rs+x;
  }
    return 0;
}