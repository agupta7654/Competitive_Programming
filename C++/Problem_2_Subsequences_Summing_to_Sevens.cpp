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
    ll n;
    vll ID;
    cin >> n;
    for(int i = 0; i < n; i++){
        ll a;
        cin >> a;
        ID.push_back(a);
    }

    vll s;
    s.push_back(ID[0]);
    for(int i = 1; i < n; i++){
        s.push_back( s[i-1] + ID[i]);
    }

    vll mod;
    for(int i = 0; i < n; i++){
        mod.push_back(s[i] % 7);
    }
    int maxLen = 0;
    for(int i = n-1; i >= 0; i--){
        for(int j = 0; j < i; j++){
            if(maxLen > i - j){
                break;
            }
            else if(mod[j] == mod[i]){
                maxLen = i - j;
            }
        }
    }
    cout << maxLen << endl;
}