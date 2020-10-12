#include <iostream>
using namespace std;

int main() 
{
  int n,x;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  cin>>x;
  if(x>n)
    cout<<"No node found";
  else
    cout<<arr[x-1];
  return 0;
}