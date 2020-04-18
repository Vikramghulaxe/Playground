#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  float num=0.5;
  for(int i=1;i<=n;i++)
  {
    cout<<num<<" ";
    num=num*3;
  }
}