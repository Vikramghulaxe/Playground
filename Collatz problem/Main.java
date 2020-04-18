#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int count=0;
  cout<<n<<"\n";
  while(n!=1)
  {
    if(n%2==0)
    {
      count++;
      n=n/2;
      cout<<n<<"\n";
      
    }
    else
    {
      count++;
      n=(3*n)+1;
      cout<<n<<"\n";
    }
  }  
  cout<<count;
}