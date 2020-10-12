#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int w,m,c;
  cin>>w>>m>>c;
  int res = m*75+c*30;
  
  if(res<w)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
  
}