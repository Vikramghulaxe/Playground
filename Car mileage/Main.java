#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float m;
  int l,d;
  cin>>m>>l>>d;
  float d1=m*l;
  if(d1<d)
    cout<<"Cannot reach\n";
  else
    cout<<"Can reach\n";
}