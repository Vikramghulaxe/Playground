#include <iostream>
using namespace std;
int main() 
{
    // Type your code here
	int n,k;
  	cin>>n;
  	int t=n;
  	for(int i=1;i<=n;i++)
    {
      for(int j=1;j<n;j++)
      {
        if(i%2!=0)
        {
          k=i;
          cout<<k;
          if(j==n-1)
          	cout<<i+1<<"\n";
        }
        else
        {
          if(j==1)
          	cout<<i+1;
          k=i;
          cout<<k;
          if(j==n-1)
            cout<<"\n";
          
        }
      }
    }
    return 0;
}