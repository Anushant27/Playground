#include<iostream>
using namespace std;
  int main()
 { 
    int a,temp=1,i,j,n;
    cin>>a;
 for(i=1;i<=a;i++) 
    {
        n=(i*(i+1))/2;
        for(j=1;j<=i;j++)
       { 
            if(i%2!=0)
            {
               cout<<temp;
            }
            if(i%2==0)
            {
               cout<<n;
            }
            if(i>1 && j<i)
            {
              cout<<"*";
            }
          n--;
          temp++;
        }
       cout<<"\n"; 
    }
     
  }