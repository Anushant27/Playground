#include<iostream>
using namespace std;
int main()
{
  int a[10],b,i,n;
  int sum=0,sum1=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      sum=sum+a[i];
    }
    else if(a[i]%2!=0)
    {
      sum1=sum1+a[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<sum<<endl;
  cout<<"The sum of the odd numbers in the array is "<<sum1;
  
  //Type your code here.
}