#include<bits/stdc++.h>
using namespace std;
int main()
{
  char s[100];
  int i;
  cin>>s;
  cin>>i;
  if(strcmp(s,"front")==0) 
  {
    if(i==1)
    {
  cout<<"Left Handed";
   }
    else
    {
      cout<<"Right Handed";
    }
  }
  else if(strcmp(s,"rear")==0)
  {
    if(i==1)
          
  {
    cout<<"Right Handed";
 }
  else
       {
         cout<<"Left Handed";
  }
       }
}
  