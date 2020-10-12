#include<bits/stdc++.h>
using namespace std;
int main()
{
  int a,b,r,d;
  cin>>a>>b>>r;
  d=pow(a,b);
  if(d<r)
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
  else if(d>=r)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
}
    