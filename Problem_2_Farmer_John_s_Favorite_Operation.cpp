#include <iostream>
#include <vector>
#include <string>
#include <bits/stdc++.h>
#include <algorithm>


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
    int n, m;
    cin >> n >> m;
    vll b(m);
    for(int i = 0; i < n; i++){
        ll val;
        cin >> val;
        b[val % m]++;

    }
    int max = b[0];
    int maxIndex = 0;
    for(int i = 1; i < m; i++){
        if(b[i] > max){
            max = b[i];
            maxIndex = i;
        }
    }
    cout << maxIndex << endl;
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