#include <iostream>
#include <vector>
#include <string>

using namespace std;


int main()
{
   int t;
   cin  >> t; 
   while(t--){
     int l;
     string s, r;
     cin >> l >> s >> r;
     int ones = 0;
     int zeros = 0;
     for(int i = 0; i < l; i++){
        if(s[i] == '1') ones++;
        if(r[i] == '1') zeros--;
        if(s[i] == '0') zeros++;
        if(r[i] == '0') ones--;


        
     }
     if(!(abs(ones) + abs(zeros) <= 1)){
        cout << "NO" << endl;
     }
     else{
        cout << "YES" << endl;
     }
     
   }
}