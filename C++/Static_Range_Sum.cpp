#include <iostream>
#include <vector>
#include <string>
#include <bits/stdc++.h>


using namespace std;


int main()
{   
    // freopen("cownomics.in", "r", stdin); 
    // freopen("cownomics.out", "w", stdout);
    long long n, q;
    cin >> n >> q;
    vector<int> v;
    for(int i = 0; i < n; i++){
        int a;
        cin >> a;
        v.push_back(a);
    }

    vector<long long> s;
    long long curSum = 0;
    for(int i = 0; i < n; i++){
        curSum += v[i];
        s.push_back(curSum);
    }
   
    for(int i = 0; i < q; i++){
        long long l, r;
        cin >> l >> r;
        if(l == 0){
            cout << s[r-1] << endl;
        }
        else{
            cout << s[r-1]-s[l-1] << endl;
        }
    }
    
}