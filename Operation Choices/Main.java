#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int c=0,a=0,b=0;
    cin>>c>>a>>b;
    switch(c)
    {
      case 1:cout<<a+b;
        break;
        
      case 2:cout<<a-b;
        break;
        
      case 3:cout<<a*b;
        break;
        
      case 4:cout<<a/b;
        break;
        
    }
    return 0;
}