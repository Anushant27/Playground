#include <iostream>
using namespace std;

void sum(int n,int m)
{
  int sum;
  for(int i=n;i<=m;i++)
  {
    if(i%3==0 && i%5==0)
      sum+=i;
  }
  cout<<sum;
}
int main() 
{
   int n,m;
   cin>>n>>m;
   sum(n,m);
   return 0;
}