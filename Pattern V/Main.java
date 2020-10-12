 #include <iostream>
using namespace std;

int main()
{
    int n,l=1,r,space;
    int i,j;
    cin>>n;
    int m=n-1;
    r=n*n+1;
    for(i=n;i>=1;i--)
    {
        for(space=n;space>i;space--)
            cout<<"--";
        for(j=1;j<=i;j++)
        {
          //if(j==i)  cout<<l;
            //else
            cout<<l; cout<<"*";
            l++;
        }
        //cout<<endl;
        for(j=1;j<=i;j++)
        {
            cout<<r;
            if(j!=i)
                cout<<"*";
            r++;
        }
        //r=r-(i-1)*2-1;
        r=r-(2*m)-1;
        m--;
        cout<<endl;
    }
    return 0;
}


