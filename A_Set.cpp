#include <iostream>
#include <vector>
#include <string>

using namespace std;


int main()
{
   int k;
   cin >> k;
   while(k--) {
    int l, r, k;
    cin >> l >> r >> k;
    int mid = r/k;
    if(mid-l+1 < 0){
        cout << 0 << endl;
    }
    else{ 
        cout << mid-l+1 << endl;
    }
   }
}