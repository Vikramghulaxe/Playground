#include<iostream>
using  namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
  int ans=1;
  for(int i=n;i>0;i--)
  {
    ans=ans*i;
  }
  cout<<ans;
}