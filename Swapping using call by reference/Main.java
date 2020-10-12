#include<iostream>
using namespace std;
int swap(int*,int*);
int main()
{
  int a,b;
  cin>>a>>b;
  cout<<"Before swapping a= "<<a<<" and "<<"b="<<b<<endl;
  swap(&a,&b);
  cout<<"After swapping a= "<<a<<" and "<<"b="<<b<<endl;
  return 0;
}
int swap(int *a,int *b)
{
  int t;
  t=*b;
  *b=*a;
  *a=t;
   
}