#include<bits/stdc++.h>
#include<string.h>
using namespace std;
int main()
{
  char s[50],str[50],p[50],r[50];
  cin>>s>>str;
 int j = strlen(str) - 1;
    for (int i = 0; i < j; i++,j--)
    {
        int temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
  
  if(strcmp(s,str)==0)
  {
    cout<<"It is correct";
  }
  else
  {
    cout<<"It is wrong";
  }
  
 
  //Type your code here.
}