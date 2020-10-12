#include <iostream>
using namespace std;

int main() 
{
  int num1,num2,cnt=0,car=0,x,y;
  cin>>num1>>num2;
  while(num1>0 && num2>0)
  {
    x=num1%10;
    y=num2%10;
    if((x+y+car)>=10)
    {
      car=1;
      cnt++;
    }
    num1/=10;
    num2/=10;
  }
  cout << cnt;
  return 0;
}