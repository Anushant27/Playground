#include <iostream>
using namespace std;

int main() 
{
  int x,n,m;
  cin>>x;
  int a[x];
  for(int i=0;i<x;i++)
    cin>>a[i];
  cin>>n>>m;
  for(int i=0;i<x;i++)
  {
    if((a[i]-n)<m)
      cout<<a[i]+1<<" ";
    else
      cout<<a[i]<<" ";
  }
    return 0;
}