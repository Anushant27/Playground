#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j,sum=0;
  int a[10][10],b[10][10];
  cin>>m>>n;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
       cin>>b[i][j];
    }
  }
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
       sum+=a[i][j]+b[i][j];
      cout<<sum<<" ";
      sum=0;
    }
    cout<<"\n";
  }
  
  
  
  }