#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int n,i,j,pos;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cin>>pos;
  for(i=0;i<n;i++)
  {
    if(i==(pos-1))
      continue;
    else
      cout<<arr[i]<<" ";
  }
  
  
    return 0;
}