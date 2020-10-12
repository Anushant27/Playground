#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}

int main()
{
    int n,rem,res=0,t,cnt=0;
    std::cin>>n;
  t=n;
  while(t!=0)
  {
    
    cnt++;
    t=t/10;
  }
  t=n;
  while(t!=0)
  {
    rem=t%10;
    res+=power(rem,cnt);
    t=t/10;
  }
    if(n==res)
    {
        std::cout<<"Kindly proceed with encrypting";
    }
    else{
        std::cout<<"It is not an Armstrong number";
    }
    
}