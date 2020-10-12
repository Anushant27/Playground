#include<iostream>
using namespace std;
int main()
{
  int r,i,j,c,a[100][100],b[100][10],mrow,mcol,rsum[100],csum[100],prow,pcol;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {
    rsum[i]=0;
    for(j=0;j<c;j++)
    { 
      rsum[i]+=a[i][j];
    }
    cout<<rsum[i]<<" ";
  }
  cout<<"\n";
  mrow=rsum[i];
  for(i=0;i<r;i++)
  {
    if(rsum[i]>mrow)
    {
      mrow=rsum[i];
      prow=i;
    }
  }
  cout<<"Row "<<prow+1<<" has maximum sum\n";
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
   		b[i][j]=a[j][i];
    }
  }
  cout<<"Sum of columns is ";
  for(i=0;i<c;i++)
  {
    csum[i]=0;
    for(j=0;j<r;j++)
    {
      csum[i]+=b[i][j];
    }
    cout<<csum[i]<<" ";
  }
  cout<<"\n";
  mcol=csum[i];
  for(i=0;i<r;i++)
  {
    if(csum[i]>mcol)
    {
      mcol=csum[i];
      pcol=i;
    }
  }
  cout<<"Column "<<pcol+1<<" has maximum sum\n";  
}

