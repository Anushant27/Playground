#include<iostream>
using namespace std;
int main()
{
  int i,a,n,N,sum=0,r;
  cin>>N;
  n=N;
  while(n)
  {
    r=n%10;
    sum=sum+r;
    n=n/10;
  }
  //int r N%sum
  if(N%sum==0)
  {
    cout<<"Harshad Number";
  }
  else
    {
    cout<<"Not Harshad Number";
  }
    //Type your code here.
}