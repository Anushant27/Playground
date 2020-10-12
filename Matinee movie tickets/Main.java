#include<iostream>
using namespace std;
int main()
{
  float a,b;
  cin>>a>>b;
  if(a>=13)
  {
    if(b>10.15)
    {
      cout<<"$5.00";
    }
    else
    {
      cout<<"$8.00";
    }
  }
  else if(a<13)
  {
    if(b>10.15)
    {
      cout<<"$2.00";
    }
    else
    {
      cout<<"$4.00";
    }
}
}