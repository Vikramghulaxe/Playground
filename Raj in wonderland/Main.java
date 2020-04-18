#include<bits/stdc++.h>
using namespace std;
int main()
{
  string str;
  cin>>str;
  if(str.length()==1)
    cout<<"Not possible\n";
  else if(str[1]==str[0]+1)
  {
      cout<<"Possible\n";
  }
  else
    cout<<"Not possible\n";
  
  
}