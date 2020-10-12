#include <iostream>

using namespace std;

int main()
{
    int item;
  float heat;
  cin>>item>>heat;
  if(item>3)
  {
    cout<<"Number of items is more";
    return 0;
  }
  if(item==2){
    cout<<50/100.0*heat+heat;
  }
  if(item==3){
    cout<<2.0*heat;
  }
  
  

    return 0;
}
