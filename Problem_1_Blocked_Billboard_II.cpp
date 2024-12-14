#include <iostream>
#include <vector>
#include <string>

using namespace std;


int main()
{
    freopen("billboard.in", "r", stdin); // Redirect std::cin to read from the file
    freopen("billboard.out", "w", stdin); // Redirect std::cin to read from the file


    int x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0, x4 = 0, y4 = 0;  
    cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3 >> x4 >> y4;
    // cerr << x1 << " " << y1 << " " << x2 << " " << y2 << " " << x3 << " " << y3 << " " << x4 << " " << y4 << endl;

    int finx1 = x1;
    int finx2 = x2;
    int finy1 = y1;
    int finy2 = y2;
    bool done = false;

    // top
    if (x3 < x1 && x4 > x2){
       if(y4 > y1 && y3 < y1){
         finy1 = y4;
       }
       else if(y4 > y2 && y3 < y1){
         cout << 0 << endl;
         done = true;
       }
       else if(y4 > y2 && y3 < y2){
         finy2 = y3;
       }
    }

    // side
    if (y3 < y1 && y4 > y2){
        if(x4 > x1 && x3 < x1){
            finx1 = x4;
        }
        else if(x4 > x2 && x3 < x1){
            cout << 0 << endl;
            done = true;
        }
        else if(x4 > x2 && x3 < x2){
            finx2 = x3;
        }
    }

    int fin = (finx2 - finx1) * (finy2 - finy1);

    if(!done){
        cout << fin << endl;
    }
   
}