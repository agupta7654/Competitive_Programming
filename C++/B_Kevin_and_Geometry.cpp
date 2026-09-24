#include <iostream>
#include <vector>
#include <string>
#include <bits/stdc++.h>


using namespace std;
using vi = vector<int>;
using vvi = vector<vi>;
using ii = pair<int, int>;
using vii = vector<ii>;
using ll = long long;
using vll = vector<ll>;
using vvll = vector<vll>;
using ld = long double;
using pll = pair<ll, ll>;
using vb = vector<bool>;

void solve(){
    int n;
    cin >> n;
    vll v(n);
    for(int i = 0; i < n; i++){
        cin >> v[i];
    }
    sort(v.begin(), v.end());
    int doub = -1;
    vll doubs;
    for(int i = 0; i < n-1; i++){
        if(v[i] == v[i+1]){
            doub = i;
            doubs.push_back(v[i]);
            break;
        }
    }
    if(doub == -1){
        cout << -1 << endl;
        return;
    }
    for(int i = 0; i < n-1; i++){
        for(int j = 0; j < doubs.size(); j++){
            if(v[i+1]-v[i] < doubs[j] * 2 && i != doub && i != doub+1 && i+1 != doub){
                cout << doubs[j] << " " << doubs[j] << " " << v[i] << " " << v[i+1] << endl;
                return;
            }
        }
    }
    cout << -1 << endl;
    
    

    
    
    
}

int main()
{   
    // freopen("div7.in", "r", stdin); 
    // freopen("div7.out", "w", stdout);
    cin.tie(0);
    cout.tie(0);
    ios_base::sync_with_stdio(0);
    int t;
    cin >> t;
    while (t--) solve();
    return 0;
}