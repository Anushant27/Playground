#include <iostream>
using namespace std;
#include<string.h>

struct student
{
char name[50],desn[100];
  int dept;
int roll;
float marks;
} s[100];

int main()
{
int i,n=1,j;
struct student s[100],t;


for(i=0;i<n;i++)
{

cout<<"Enter name:";
cin>>s[i].name;
cout<<"\nEnter ID:";
  cin>>s[i].dept;
  
cout<<"\nEnter age:";
cin>>s[i].marks;
  cout<<"\nEnter designation:";
  cin>>s[i].desn;
cout<<"\nEnter Salary:";
cin>>s[i].roll;

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

for(i=0;i<n;i++)
{
cout<<"\nEmployee Details\n";
cout<<"Name of the Employee : "<<s[i].name;
cout<<"\nID of the Employee : "<<s[i].dept;
  cout<<"\nAge of the Employee : "<<s[i].marks;
  cout<<"\nDesignation of the Employee : "<<s[i].desn;
  cout<<"\nSalary of the Employee : "<<s[i].roll;
}

return 0;
}