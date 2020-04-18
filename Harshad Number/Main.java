#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int sum=0;
  int t=n;
  while(t>0)
  {
    sum+=t%10;
    t=t/10;
  }
  
  //cout<<sum<<"\n";
 // cout<<n%sum<<"\n";
  if((n%sum)==0)
  {
    cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
}