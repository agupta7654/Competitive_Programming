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
        long long k = 0, l1 = 0, r1 = 0, l2 = 0, r2 = 0;
        cin >> k >> l1 >> r1 >> l2 >> r2;
        long long mult = k;
        long long low = l2/r1;
        long long high = r2/l1;
        vector<int> ks;
        if(r1 > l2){
            ks.push_back(1);
        }
        while(k < low){
            k = k*mult;
        }
        while(k <= high){
            ks.push_back(k);
            k = k*mult;
        }
        // for(auto i : ks){
        //     cout << i << endl;
        // }
        long long count = 0;
        for(int i = 0; i < ks.size(); i++){
            long long highest = 0;
            if(r1 < r2/ks[i]){
                highest = r1;
            }
            else{
                highest = r2/ks[i];
            }
            // cout << highest << " " << ks[i] << endl;
            count += highest - l1 + 1;
        }
        cout << count << endl;
    }
   
}