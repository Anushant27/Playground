#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,i,sqr,cnt=0,r,r1,c1=0;
  int s1;
  int s2,sum=0;
  cin>>n;
  int m=n;
  sqr=pow(n,2);
  int sq=sqr;
  while(n>0)
  {r=n%10;
   cnt++;
   n/=10;
  }
  while(sqr>0)
  {r=sqr%10;
   c1++;
   sqr/=10;
  }
  int p=pow(10,cnt);
  s1=sq%p;
  s2=sq/pow(10,(c1-cnt));
  sum=sum+s1+s2;
  if(sum==m)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}
  
  //Type your code here.
