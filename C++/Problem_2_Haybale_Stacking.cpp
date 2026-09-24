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



int main()
{   
    // freopen("div7.in", "r", stdin); 
    // freopen("div7.out", "w", stdout);
    ll n, k;
    cin >> n >> k;
    vll v(n+1, 0);
    vll v2(n+1, 0);
    for(int i = 0; i < k; i++){
        int a, b;
        cin >> a >> b;
        v[a]++;
        v[b+1]--;
    }
    int add = 0;
    for(int i = 1; i < n+1; i++){
        add += v[i];
        v2[i] = add;
    }
    sort(v2.begin(), v2.end());
    ll ans = v2[(int)(n/2 + 1)];
    cout << ans << endl;
}