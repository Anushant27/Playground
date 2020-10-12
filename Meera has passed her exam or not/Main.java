#include<iostream>
using namespace std;
int main()
{
  int a[10],n,i,k,flag=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>k;
  for(i=0;i<n;i++)
  {
    if(a[i]==k)
    {
      flag=1;
      break;
    }
  }
  if(flag==1)
  {
    cout<<"She passed her exam";
  }
  else
  {
    cout<<"She failed";
  }
    
    // Type your code here
}