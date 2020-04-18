#include<iostream>
using namespace std;
int main()
{
  int n,a,b;
  //cin>>n;
  cout<<"Enter first number : ";
  cin>>a;
  cout<<"Enter second number : ";
  cin>>b;
  cout<<"Menu\n";
  cout<<"1.Addition\n";
  cout<<"2.Subtraction\n";
  cout<<"3.Multiplication\n";
  cout<<"4.Division\n";
  cout<<"5.Remainder\n";
  cin>>n;
  switch(n)
  {
    case 1 :
      	cout<<a+b<<"\n";
      	break;
    case 2 :
      	cout<<a-b<<"\n";
      	break;
    case 3 :
      	cout<<a*b<<"\n";
      	break;
    case 4: 
      	cout<<a/b<<"\n";
      	break;
    case 5:
      	cout<<a%b<<"\n";
      	break;
    default:
      	cout<<"Invalid operation\n";
  }
}