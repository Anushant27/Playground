#include <iostream> 
using namespace std; 
int main()
{
  int a[10][10],r,c,i,j,s,s1=0,s2=0;
  cin>>r>>c;
        for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
          {
            cin>>a[i][j];
          }
        }
         for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
          {
            if(i==0||i==(r-1))
               {
                 s1+=a[i][j];
               }
          }
         }
      for(i=0;i<r;i++)
        {
          for(j=0;j<i;j++)
          {
            if(i!=0&&i!=(r-1))
               {
                 s2+=a[i][c-1-i];
               }
          }
       } 
 // cout<<s1<<"   "<<s2<<"    ";
  	  s=s1+s2;
     cout<<"Sum of Zig-Zag pattern is "<<s;
}
        