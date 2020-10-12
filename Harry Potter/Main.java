#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int last = n%10;
  n /=1000; 
  int first = n%10;
  cout<<first+last;
  return 0;
}