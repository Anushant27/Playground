#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int unit;
  cin>>unit;
  if(unit<=200){
     cout<<"Rs."<<int(unit*0.5);
  }
  else if(unit<=400){
    
   cout<<"Rs."<<(unit*0.65)+100.0;
  }
    else if(unit<=600){
    
   cout<<"Rs."<<(unit*0.80)+200.0;
  }
  else{
    
   cout<<"Rs."<<(unit*1.25)+425.0;
  }
}