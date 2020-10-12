#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a,b,n,i;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==0)
    {
      a=(pow(i,2))-2;
      cout<<a<<" ";
    }
    else
    {
      b=(pow(i,2))-1;
      cout<<b<<" ";
    }
  }
}
