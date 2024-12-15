#include <iostream>
#include <vector>
#include <string>
#include <cmath> 

using namespace std;


int main()
{
    // freopen("billboard.in", "r", stdin); 
    // freopen("billboard.out", "w", stdout);

    int n, q;
    cin >> n >> q;
    int xy[n][n] = {};
    int yz[n][n] = {};
    int xz[n][n] = {};
    int count = 0;
    for(int i = 0; i < q; i++){
        int xin, yin, zin;
        cin >> xin >> yin >> zin;
        xy[xin][yin] += 1;
        yz[yin][zin] += 1;
        xz[xin][zin] += 1;

        if(xy[xin][yin] == n){
            count++;
        }
        if(yz[yin][zin] == n){
            count++;
        }
        if(xz[xin][zin] == n){
            count++;
        }
        cout << count << endl;
    }
   
}