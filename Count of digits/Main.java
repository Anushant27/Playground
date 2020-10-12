#include<iostream>
using namespace std;
int main()
{
  int i,n,count;
  cin>>n;
  do{
    n/=10;
    count++;
  }while(n>0);
  cout<<count;
}