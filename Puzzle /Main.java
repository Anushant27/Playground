#include<iostream>
using namespace std;
int main()
{
    int r,c,i,j;
  int a[10][10];
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(j=0;j<c;j++)
  {
    for(i=0;i<r;i++)
    {
      cout<<a[i][j]<<" ";
    }
    cout<<"\n";
  }
}// Type your code here
