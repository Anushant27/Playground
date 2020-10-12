#include <iostream>
using namespace std;

int main() 
{
  string s;
  cin>>s;
  char ch1,ch2;
  cin>>ch1>>ch2;
  for(int i=0;i<s.size();i++)
  {
    if(s[i]==ch2)
      s[i]=ch1;
    else if(s[i]==ch1)
      s[i]=ch2;
  }
    cout << s;
    return 0;
}