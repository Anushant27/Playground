#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,i,r,e=0,o=0;
  cin>>n;
  if(n==0)
  {
    cout<<"No";
  }
  else
  {
    while(n!=0)
    {
      r=n%10;
      if(r%2==0)
      {
        e=e+r;
      }
      else
      {
        o+=r;
      }
      n/=10;
    }
    if(e==o)
      cout<<"Yes";
    else
      cout<<"No";
  }
}