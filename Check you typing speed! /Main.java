#include<iostream>
using namespace std;
int main()
{
  int id,marks;
  cin>>id>>marks;
  if(marks<1)
    cout<<" ";
  else
    cout<<id<<" is eligible for reward.\n";
}