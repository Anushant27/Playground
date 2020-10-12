#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fsh,ss,sd,ssh,aa,ad,ash;
  int flipkart,snapdeal,amazon;
  cin>> fa>>fd>>fsh>>ss>>sd>>ssh>>aa>>ad>>ash;
  flipkart = fa - ((fd/100.0)*fa) +fsh;
  snapdeal = ss - (sd/100.0*ss) +ssh;
  amazon = aa - (ad/100.0*aa) +ash;
  
  cout<<"In Flipkart Rs."<<flipkart<<endl;;
  cout<<"In Snapdeal Rs."<<snapdeal<<endl;
  cout<<"In Amazon Rs."<<amazon<<endl;
  
  if(flipkart<=snapdeal &&  flipkart<amazon){
      cout<<"He will prefer Flipkart";
  }
  if(flipkart>snapdeal &&  snapdeal<amazon){
      cout<<"He will prefer Snapdeal";
  }
  if(amazon<snapdeal &&  flipkart>amazon){
      cout<<"He will prefer Amazon";
  }
  
  
}