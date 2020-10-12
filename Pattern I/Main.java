#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  int temp=n;
  for(i=temp;i<(temp+4);i++)
  {
    for(j=temp;j<=i;j++)
    {
      cout<<n;
    }
    n++;
    cout<<"\n";
  }
  n--;
   for(i=temp;i<(temp+4);i++)
  {
    for(j=n;j>=temp;j--)
    {
      cout<<n;
    }
     n--;
    cout<<"\n";
   }
}
