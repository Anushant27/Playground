#include<iostream>
using namespace std;
int main()
{
  int m;
  int a[5][5];
  int i,j,s1=0,s2=0;
  cin>>m;
  for(i=0;i<m;i++)
  {
    for(j=0;j<m;j++)
    {
       cin>>a[i][j];
    }
  }
    for(i=0;i<m;i++)
  {
    for(j=0;j<m;j++)
    {
        if(i==j)
        {
          s1+=a[i][j];
        }
    }
   // cout<<s1;
 }
  for(i=0;i<m;i++)
  {
    for(j=0;j<m;j++)
    {
        if(j==m-i-1)
        {
          s2+=a[i][j];
        }
    }
   
   }
  if(s1==s2)
    cout<<"Yes";
  else 
    cout<<"No";
  
}