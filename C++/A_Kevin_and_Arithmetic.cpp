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
    ll zero = 0;
    ll one = 0;
    for(int i = 0; i < n; i++){
        int in =  0;
        cin >> in;
        in = in % 2;
        if(in % 2 == 0){
            zero++;
        }
        else{
            one++;
        }
        v[i] = in;
    }
    if(zero > 0){
        cout << 1+one << endl;
    }
    else{
        cout << one-1 << endl;
    }
    

    
    
    
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