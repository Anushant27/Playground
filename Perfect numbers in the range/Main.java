#include<iostream>
using namespace std;
int main()
{
  int a,b,i,sum=0,n;
  cin>>a>>b;
   for(n=a;n<=b;n++){
    i=1;
    sum = 0;

    while(i<n){
      if(n%i==0)
           sum=sum+i;
          i++;
    }

    if(sum==n)
      printf("%d ",n);
  }

  return 0;
}
