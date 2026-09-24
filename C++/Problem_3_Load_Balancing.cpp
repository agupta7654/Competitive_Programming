#include <iostream>
#include <vector>
#include <string>
#include <bits/stdc++.h>


using namespace std;


int main()
{   
    // freopen("cownomics.in", "r", stdin); 
    // freopen("cownomics.out", "w", stdout);
    int n, b;
    cin >> n >> b;

    vector<int> x;
    vector<int> y;

    for(int i = 0; i < n; i++){
        int a,b;
        cin >> a >> b;
        x.push_back(a);
        y.push_back(b);
    }

    sort(x.begin(), x.end());
    sort(y.begin(), y.end());

    int mid = n/2;

    int xlow = x[mid]-1;
    int ylow = y[mid]-1;
    int xhigh = x[mid]+1;
    int yhigh = y[mid]+1;

    // cout << xlow << " " << ylow << " " << xhigh << " " << yhigh << endl;

    int m1 = 0;
    int m2 = 0;
    int m3 = 0;
    int m4 = 0;

    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    int c4 = 0;

    for(int i = 0; i < n; i++){
        if(x[i] < xlow && y[i] < ylow){
            c1++;
        }  
        if(x[i] < xlow && y[i] > ylow){
            c2++;
        } 
        if(x[i] > xlow && y[i] < ylow){
            c3++;
        }
        if(x[i] > xlow && y[i] > ylow){
            c4++;
        }
        
    }
    
    m1 = max(max(c1, c2), max(c3, c4));
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;

    for(int i = 0; i < n; i++){
        if(x[i] < xhigh && y[i] < ylow){
            c1++;
        }  
        if(x[i] < xhigh && y[i] > ylow){
            c2++;
        } 
        if(x[i] > xhigh && y[i] < ylow){
            c3++;
        }
        if(x[i] > xhigh && y[i] > ylow){
            c4++;
        }
       
    }

     m2 = max(max(c1, c2), max(c3, c4));
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;

    for(int i = 0; i < n; i++){
        if(x[i] < xlow && y[i] < yhigh){
            c1++;
        }  
        if(x[i] < xlow && y[i] > yhigh){
            c2++;
        } 
        if(x[i] > xlow && y[i] < yhigh){
            c3++;
        }
        if(x[i] > xlow && y[i] > yhigh){
            c4++;
        }
       
    }
     m3 = max(max(c1, c2), max(c3, c4));
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;

    for(int i = 0; i < n; i++){
        if(x[i] < xhigh && y[i] < yhigh){
            c1++;
        }  
        if(x[i] < xhigh && y[i] > yhigh){
            c2++;
        } 
        if(x[i] > xhigh && y[i] < yhigh){
            c3++;
        }
        if(x[i] > xhigh && y[i] > yhigh){
            c4++;
        }
       
    }
            cout << c1 << " " << c2 << " " << c3 << " " << c4 << endl;

     m4 = max(max(c1, c2), max(c3, c4));
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;

    int m = min(min(m1, m2), min(m3, m4));
    cout << m1 << " " << m2 << " " << m3 << " " << m4 << endl;
    
    
}