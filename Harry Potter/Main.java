#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int n1=n%10;
  int x=3;
  while(x--)
  {
    n=n/10;
  }
  //cout<<n<<"\t";
  cout<<n+n1<<"\n";
}