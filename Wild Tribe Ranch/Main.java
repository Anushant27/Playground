#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  if(a<b)
    std::cout<<"Sorry, you can't enter";
  else if(a==b)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Yes, you can enter.";
}