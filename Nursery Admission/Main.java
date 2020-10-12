#include<bits/stdc++.h>
using namespace std;
int main()
{
  char str[100];
  int i=0,count=0;
  cin>>str;
  while(str[i]!='\0')
  {
    if((str[i]>='a' && str[i]<='z')||(str[i]>='A' && str[i]<='Z'))
    {
      count++;
    }
    i++;
  }
  cout<<"The number of letters in the name is "<<count;
}
