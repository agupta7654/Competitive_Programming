#include <iostream>
#include <vector>
#include <string>
#include <cmath> 
#include <set>
#include <bits/stdc++.h>


using namespace std;


int main()
{
    // freopen("billboard.in", "r", stdin); 
    // freopen("billboard.out", "w", stdout);
    int t;
    cin >> t;
    while(t--){
        string s;
        cin >> s;
        string end;
        for(int i = 0; i < s.length(); i++){
            if(s[i] == 'p'){
                end =  'q' + end;
            }
            else if(s[i] == 'q'){
                end = 'p' + end;
            }
            else{
                end = 'w' + end;
            }
        }
        cout << end << endl;

    }
   
}