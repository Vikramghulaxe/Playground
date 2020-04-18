#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int j=0,k=0;
  for(int i=1;i<=n;i++)
  {
    for (j=1; j<i; j++) 
         cout << i << "*"; 
    cout << j++ << endl;   
  }
  for(int i=n;i>0;i--)
  {
    for (j=1; j<i; j++) 
         cout << i << "*"; 
    cout <<j++<< endl;   
  }
}