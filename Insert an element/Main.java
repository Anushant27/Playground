#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int n,input,x,y;
  cin>>n;
  vector<int> v;
  for(int i=0;i<n;i++)
  {
    cin>>input;
    v.push_back(input);
  }
  cin>>x>>y;
  for(int i=0;i<v.size();i++)
  {
    if(i==x-1)
      cout<<y<<" ";
    cout<<v[i]<<" ";
  }
    return 0;
}