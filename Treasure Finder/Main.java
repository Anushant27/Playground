#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if((a>b && a<c)||(a>c &&a<b))
  {
    cout<<"The treasure is in box which has number "<<b<<endl;
    if(a%b==0)
    {
      cout<<"The code to open the box is "<<b;
    }
    else if(a%c==0)
       {
         cout<<"The code to open the box is "<<c;
       }
       else
       {
         cout<<"The code to open the box is 1";
       }
       }
  if((b>a && b<c)||(b>c) &&(b<a))
  {
    cout<<"The treasure is in box which has number "<<b<<endl;
    if(b%a==0)
    {
      cout<<"The code to open the box is "<<a;
    }
    else if(b%c==0)
       {
         cout<<"The code to open the box is "<<c;
       }
       else
       {
         cout<<"The code to open the box is 1";
       }
       }
  else if((c>a && c<b)||(c>b) &&(c<a))
  {
    cout<<"The treasure is in box which has number "<<c<<endl;
    if(c%b==0)
    {
      cout<<"The code to open the box is "<<b;
    }
    else if(c%a==0)
       {
         cout<<"The code to open the box is "<<a;
       }
       else
       {
         cout<<"The code to open the box is 1";
       }
       }
       }   
         