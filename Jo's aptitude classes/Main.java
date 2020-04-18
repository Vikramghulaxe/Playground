#include<iostream>
using namespace std;

int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
  
// Function to find gcd of array of 
// numbers 
int findGCD(int arr[], int n) 
{ 
    int result = arr[0]; 
    for (int i = 1; i < n; i++) 
        result = gcd(arr[i], result); 
  
    return result; 
} 

int main()
{
  int a,b,c,gcd;
  int arr[3];
  cin>>arr[0]>>arr[1]>>arr[2]>>gcd;
  if(findGCD(arr,3) == gcd)
    	cout<<"Answer is correct.\n";
  else
    	cout<<"Answer is wrong.";
}