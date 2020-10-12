#include <iostream>
using namespace std;
#include <string.h>
struct student
{
char name[50];
  char dept[50];
int roll;
float marks;
} s[100];

int main()
{
int i,n,j=0;
struct student s[100],t;

cout<<"Enter the number of colleges";
cin>>n;

for(i=0;i<n;i++)
{
cout<<"\nEnter the details of college "<<i+1;
cout<<"\nEnter name";
cin>>s[i].name;
cout<<"\nEnter city";
  cin>>s[i].dept;
cout<<"\nEnter year of establishment";
cin>>s[i].roll;

cout<<"\nEnter pass percentage";
cin>>s[i].marks;
}
for(i=0;i<n;i++)
     {
          for(j=i+1;j<n;j++)
          {
               if(strcmp(s[i].name,s[j].name)>0)
               {
                    t=s[i];
                    s[i]=s[j];
                    s[j]=t;
               }
          }
     }
cout<<"\nDetails of colleges";
for(i=0;i<n;i++)
{
cout<<"\nCollege:"<<i+1;
cout<<"\nName:"<<s[i].name;
cout<<"\nCity:"<<s[i].dept;
  cout<<"\nYear of establishment:"<<s[i].roll;

cout<<"\nPass percentage:"<<s[i].marks;

}

return 0;
}