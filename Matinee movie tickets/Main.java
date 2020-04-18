#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float t;
  cin>>age>>t;
  //cout<<age<<t;
  float a=13.3;
  if(t==a )
  {
    //cout<<age;
    if(age>13)
      cout<<"$5.00\n";
    else
      cout<<"$2.00\n";
  }
  else if(age>13)
    cout<<"$8.00\n";
  else
    cout<<"$4.00\n";
}