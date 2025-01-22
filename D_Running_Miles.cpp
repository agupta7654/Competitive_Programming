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
        vll prefix(n);
        vll suffix(n);
        for(int i = 0; i < n; i++){
            prefix[i] = v[i]+i;
            suffix[i] = v[i]-i;
        }
        for(int i = 1; i < n-1; i++){
            prefix[i] = max(prefix[i], prefix[i-1]); 
        }
        for(int i = n-2; i > 0; i--){
            suffix[i] = max(suffix[i], suffix[i+1]);
        }
        ll ans = 0;
        for(int i = 1; i < n-1; i++){
            ans = max(ans, v[i] + prefix[i-1] + suffix[i+1]);
        }
        cout << ans << endl;
    
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