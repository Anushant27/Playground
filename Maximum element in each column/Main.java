#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  int lar=a[0][0];
   for(i=0;i<n;i++)
  {
    for(j=0;j<m;j++)
    {
      if(a[j][i]>lar)
         {
           lar=a[j][i];
         }
    }
     cout<<lar<<"\n";
     lar=0;
   }     
}