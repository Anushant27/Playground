#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n,i=0,res=0,x;
  cin>>n;
  while(n>0)
  {
    x=n%10;
    res+=x*pow(2,i);
    n/=10;
    i++;
  }
    cout << res;
    return 0;
}