#include<iostream>
using namespace std;
int main()
{
  	int a,b;
  	cin>>a>>b;
  	if(a==b)
      cout<<"Yes, you can enter. Kindly use a rope.\n";
  	else if(b>a)
      cout<<"Sorry, you can't enter\n";
  	else
      cout<<"Yes, you can enter.";
}