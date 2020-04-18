#include<bits/stdc++.h>
using namespace std;
int proceed(int m,int n,int req)
{
  int power=1;
  for(int i=1;i<=n;i++)
  {
    power=power*m;
    
  }
  //cout<<m;
  if(power>=req)
    return 1;
  else
    return 0;
}
int main()
{
  int m,n,req;
  cin>>m>>n>>req;
  int ans=proceed(m,n,req);
  if(ans==1)
    cout<<"Doctor, you can proceed with your experiment.";
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}