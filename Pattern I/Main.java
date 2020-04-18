#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  for(int i=0;i<=3;i++)
  {
    for(int j=0;j<=4;j++)
    {
      if(i<j)
        cout<<" ";
      else
      	cout<<n+i;
    }
    cout<<"\n";
  }
  for(int i=3;i>=0;i--)
  {
    for(int j=0;j<=4;j++)
    {
      if(i<j)
        cout<<" ";
      else
      	cout<<n+i;
    }
    cout<<"\n";
  }
}