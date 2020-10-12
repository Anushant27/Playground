#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,t;
  float res;
  float i,amt;
  float disc,total;
  cin>>p>>r>>t;
  i=p*r*t/100;
  amt = p+i;
  disc = 0.02*i;
  total = amt - disc;
  
  cout<<i<<endl;
  cout<<amt<<endl;
  cout<<disc<<endl;
  cout<<total<<endl;
 
  return 0;
}