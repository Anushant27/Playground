#include<iostream>
using namespace std;
int main()
{
  int i,n,a[100],t;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]>a[i+1])
    {
     
      t=a[i];
      a[i]=a[i+1];
      a[i+1]=t;
    }
   
  // Type your code here
}
   cout<<a[i];
}