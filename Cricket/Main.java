#include<bits/stdc++.h>  
using namespace std;
int main()
{
int a,b,c,d;
  float m,n,p,q,o,t;
cin>>a>>b>>c>>d;
 m=a/6;
 t=d/6;
p=d%6;
 n= t+ (p/10);
 q=c/n;
 o=b/m;
cout<<m<<"\n"<<fixed << setprecision(1) <<n<<"\n"<<q<<"\n"<<o;
if(q>o)
{
  cout<<"\nEligible to Win";
}
  else 
  {
cout<<"\nNot Eligible to Win";
  return 0;
}
}