#include<iostream>
using namespace std;
int main()
{
  int a[21],n,l,key,i;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>l;
  if(l>n)
  {
    cout<<"Invalid Input";
    return 0;
  }
  cout<<"Enter the value to insert\n";
  cin>>key;
  for(i=n;i>l;i--)
  {
    a[i]=a[i-1];
  }
  a[l]=key;
  int t;
  t=a[l-1];
  a[l-1]=a[l];
  a[l]=t;
  cout<<"Array after insertion is\n";
  for(i=0;i<n+1;i++)
    cout<<a[i]<<"\n";
  
}
