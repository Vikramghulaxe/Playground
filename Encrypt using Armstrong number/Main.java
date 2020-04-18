#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  	int count=0,sum=0;
  	int t=n;
  	while(t>0)
    {
      	//n=n%10;
      	t=t/10;
      	count++;
    }
  	//cout<<count;
  	int k=n;
  	for(int i=0;i<count;i++)
    {
      	sum=sum+power((k%10),count);
      	//cout<<sum<<"\n";
      	k=k/10;
    }
  	//cout<<sum;
  	if(sum==n)
      return 1;
  	else
      return 0;
}
int main()
{
    int n;
    std::cin>>n;
  //cout<<n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}