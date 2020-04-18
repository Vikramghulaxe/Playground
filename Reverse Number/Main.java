#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n;
  cin>>n;
  while(n>0)
  {
    cout<<n%10;
    n=n/10;
  }
	return 0;
}