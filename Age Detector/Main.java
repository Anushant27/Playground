#include<iostream>
using namespace std;

int main(){
  signed int current, birth, a;
  
  scanf("%d",&birth);
  
  scanf("%d",&current);  
  if(current<birth)
  {
    birth=100-birth;
    a=birth+current;
    printf("%d",a);
  }
  else
  {
  printf("%d",current-birth);
  }
  return 0;
}