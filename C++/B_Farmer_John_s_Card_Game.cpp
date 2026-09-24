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
    int n, m;
    cin >> n >> m;
    vvll cards(n, vll(m+1));
    for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            cin >> cards[i][j];
        }
    }
    
    for(int i = 0; i < n; i++){
        sort(cards[i].begin(), cards[i].end());
    }
    for(int i = 0; i < n; i++){
        cards[i][0] = i;
    }
    sort(cards.begin(), cards.end(), [](const vector<ll>& a, const vector<ll>& b) {
        return a[1] < b[1];
    });

    // for(auto i : cards){
    //     for(auto j : i){
    //         cout << j << " ";
    //     }
    //     cout << endl;
    // }
    // cout << endl;

    int curNum = 0;
    for(int j = 1; j < m+1; j++){
        for(int i = 0; i < n; i++){
            // cout << cards[i][j] << " " << curNum << endl;
            if(cards[i][j] == curNum){
                curNum++;
            }
            else{
                cout << -1 << endl;
                return;
            }
        }
    }

    for(int i = 0; i < n; i++){
        cout << cards[i][0]+1 << " ";
    }
    cout << endl;
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