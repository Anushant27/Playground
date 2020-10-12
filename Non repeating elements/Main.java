#include <bits/stdc++.h>
using namespace std;

int main() 
{
  int x=-12346;
  vector<int> a,b;
  int n,m,i,j,input,cnt=0;
  cin>>n>>m;
  for(i=0;i<n;i++)
  {
    cin>>input;
    a.push_back(input);
  }
  for(i=0;i<m;i++)
  {
    cin>>input;
    b.push_back(input);
  }
  for(i=0;i<a.size();i++)
  {
    for(j=0;j<b.size();j++)
    {
      if(a[i]==b[j])
      {
        a[i]=x;
        b[j]=x;
        break;
      }
    }
  }
  for(i=0;i<a.size();i++)
  {
    if(a[i]!=x)
    {
      cout<<a[i]<<" ";
      cnt++;
    }
  }
  for(i=0;i<b.size();i++)
  {
    if(b[i]!=x)
    {
      cout<<b[i]<<" ";
      cnt++;
    }
  }
  cout<<endl<<cnt;
  return 0;
}