#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float t;
  cin>>n>>t;
  float div=0.5;
  //cout<<div;
  float f1=t*div;
  if(n==1)
    cout<<fixed<<setprecision(2)<<t<<"\n";
  else if(n==2)
    cout<<fixed<<setprecision(2)<<f1+t<<"\n";
  else if(n==3)
    cout<<fixed<<setprecision(2)<<2*t<<"\n";
  else
    cout<<"Number of items is more\n";
}