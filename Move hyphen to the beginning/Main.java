#include <bits/stdc++.h>
using namespace std;

int main() 
{
    string s;
    cin>>s;
    int x=count(s.begin(),s.end(),'-');
    s.erase(remove(s.begin(),s.end(),'-'),s.end());
    for(int i=0;i<x;i++)
      cout<<'-';
    cout<<s;
    return 0;
}