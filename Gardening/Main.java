#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row,col;
  cin>>row>>col;
  int n;
  cin>>n;
  
  if( n>row && n<=2*col){
    cout<<"It is a mango tree";
  }
  else if(n<=(row*col -col) &&  n>(row*col - 2*col) ){
    cout<<"It is a mango tree";}
  else{
    
    cout<<"It is not a mango tree";
  }
  
}