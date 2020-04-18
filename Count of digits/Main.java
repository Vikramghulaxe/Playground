#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n;
  cin>>n;
 
  int count=0;
 do
    {
        /* Increment digit count */
        count++;

        /* Remove last digit of 'num' */
        n /= 10;
    } while(n!= 0);

  
  
  cout<<count;
}