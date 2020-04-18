#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  double n;
  cin>>n;
  double s = sqrt(n);
  cout<<floor(n+s)+1;
}