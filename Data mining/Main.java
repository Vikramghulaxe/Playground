#include<iostream>
using namespace std;
int iseveodd(int n)
{
  if(n%2==0)
    return 1;
  else
    return 0;
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int sum_even=0,sum_odd=0;
  while(n>0)
  {
    
    if(iseveodd(n%10))
    {
      sum_even+=n%10;
    }
    else
    {
      sum_odd+=n%10;
    }
    n=n/10;
  }
  if(sum_even==sum_odd)
    cout<<"Yes";
  else
    cout<<"No";
}