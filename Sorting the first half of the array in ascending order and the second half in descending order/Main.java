#include <bits/stdc++.h>
using namespace std;

int main() 
{
  vector<int> v;
  int n,input;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>input;
    v.push_back(input);
  }
  int x=(n/2);
  sort(v.begin()+0,v.begin()+x);
  sort(v.begin()+x,v.end(),greater<int>());
  for(int i=0;i<v.size();i++)
  {
    cout<<v[i]<<" ";
  }
    return 0;
}