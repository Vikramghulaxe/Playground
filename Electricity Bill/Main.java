#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  cin>>a;
  int b=0.5*a;
  int c=(a*0.65)+100;
  int d=(a*0.80)+200;
  int e=(a*1.25)+425;
  if(a<=200)
    cout<<"Rs."<<b<<"\n";
  else if(a>200 && a<=400)
    cout<<"Rs."<<c<<"\n";
  else if(a>400 && a<=600)
    cout<<"Rs."<<d<<"\n";
  else if(a>600)
    cout<<"Rs."<<e<<"\n";
  else
    cout<<" ";
}