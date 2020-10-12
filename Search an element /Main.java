#include <iostream>
using namespace std;

int main() 
{
  int n,x;
  cin>>n;
  int a[n],flag=0;
  for(int i=0;i<n;i++)
    cin>>a[i];
  cin>>x;
  for(int j=0;j<n;j++)
  {
    if(a[j]==x)
    {
      cout<<"index = "<<j;
      flag=1;
      break;
    }
  }
  if(flag==0)
    cout<<"-1";
  return 0;
}