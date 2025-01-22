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
    int a1, a2, a4, a5;
    cin >> a1 >> a2 >> a4 >> a5;
    int t1 = a1+a2;
    int t2 = a5-a4;
    int t3 = a4-a2;
    if(t1 == t2 && t2 == t3){
        cout << 3 << endl;
    }
    else if(t1 == t2 || t2 == t3 || t1 == t3){
        cout << 2 << endl;
    }
    else{
        cout << 1 << endl;
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