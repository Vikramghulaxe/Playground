#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i=0;
  cin>>n;
  int count=0,score,sum=0;
  for(i=0;sum<n;i++)
  {
    count++;
    cin>>score;
    sum=sum+score;
  }
  cout<<"The number of turns is "<<count;
  
}