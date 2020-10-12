#include<iostream>
using namespace std;
int main()
{
	int a,i,j,temp=1;
	cin>>a;
	for(i=0;i<a;i++)
	{
		for(j=0;j<a;j++)
		{
			if(i%2==0 && j<a-1)
			{
			cout<<temp;
		    }
		    if(i%2==0 && j==a-1)
		    {
		    	cout<<temp+1;
			}
			if(i%2!=0 && j==0)
			{
				cout<<temp+1;
			}
			if(i%2!=0 && j>0)
			{
				cout<<temp;
				
			}

		}
		temp++;
		cout<<"\n";
	}
}

