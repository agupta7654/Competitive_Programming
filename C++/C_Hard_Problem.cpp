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
        int m,a,b,c;
        cin >> m >> a >> b >> c;
        int asat = min(a,m);
        int bsat = min(b,m);
        int csat = min(c,2*m-asat-bsat);
        cout << asat + bsat + csat << endl;

    }
   
}