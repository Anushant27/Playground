#include<iostream>
using namespace std;
int main()
{
char str[1000];
 int i,vo=0,cons=0,spa=0,dig=0,sym=0;
  gets(str);
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]=='a'|| str[i]=='e' || str[i]=='i'|| str[i]=='o'|| str[i]=='u'|| str[i]=='A' ||
       str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U')
          vo++;
   else if((str[i]>='a' && str [i]<='z') || (str[i]>='A' && str [i]<='Z'))
      cons++;
   else if(str[i]>='0' && str[i]<='9')
      dig++;
   else if(str[i]==' ')
      spa++;
    else
      sym++;
  }
  cout<<"Vowels:"<<vo<<"\n";
  cout<<"Consonants:"<<cons<<"\n";
  cout<<"White Spaces:"<<spa<<"\n";
  cout<<"Digits:"<<dig<<"\n";
  cout<<"Symbols:"<<sym<<"\n";
  //Type your code here.
}