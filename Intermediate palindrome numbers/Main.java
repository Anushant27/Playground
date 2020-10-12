#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int low,upp,i,pal,num,sum,rev=0;
  cin>>low>>upp;
  for(i=low;i<=upp;i++)
  {
    pal=i;
    num=i;
    rev=0;
    while(num!=0)
    {
     sum=num%10;
      rev=rev*10+sum;
      num=num/10;
    }
    if(pal==rev)
      cout<<pal<<" ";
  }
  
    return 0;
}