#include<iostream>
using namespace std;
int main()
{
  int n,i,a[30],c1=0,c2=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cout<<"Enter the number of elements in the array\n";
  cout<<"Enter the elements in the array\n";
   for(i=0;i<n;i++)
   {
     if(a[i]%2==0)
     {
      	c1++;
     }
     else if(a[i]%2==1)
     {
       c2++;
     }
   }
  if(c1==n)
    cout<<"The array is Even";
  else if(c2==n)
    cout<<"The array is Odd";
  else 
    cout<<"The array is Mixed";
}