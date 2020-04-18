#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float p1,p2,p3,d1,d2,d3,s1,s2,s3;
  cin>>p1>>d1>>s1>>p2>>d2>>s2>>p3>>d3>>s3;
  int min=0;
  float fp1=d1/100;
  int ans1=p1-(fp1*p1);
  int fans1=ans1+s1;
  
  float fp2=d2/100;
  int ans2=p2-(fp2*p2);
  int fans2=ans2+s2;
  
  float fp3=d3/100;
  int ans3=p3-(fp3*p3);
  int fans3=ans3+s3;
  
  cout<<"In Flipkart Rs."<<fans1<<"\n";
  cout<<"In Snapdeal Rs."<<fans2<<"\n";
  cout<<"In Amazon Rs."<<fans3<<"\n";
  
  if(fans1<=fans2)
  {
    min=fans1;
    if(min<=fans3)
      cout<<"He will prefer Flipkart\n";
    else
      cout<<"He will prefer Amazon\n";
  }
  else
  {
    min=fans2;
    if(min<=fans3)
      cout<<"He will prefer Snapdeal\n";
    else
      cout<<"He will prefer Amazon\n";
  }
  
}