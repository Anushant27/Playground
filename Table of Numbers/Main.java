#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int n=0,i=0,sum=0,res=0;
  cin>>n;
  for(i=1;i<=10;i++)
  {
    res = i*n;
   	cout<<res<<" ";
    sum+=res;
    
  } 
  cout<<endl<<sum;
   
    return 0;
}