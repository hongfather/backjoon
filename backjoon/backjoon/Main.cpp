#include <iostream>
#include <cmath>
using namespace std;

int** arr;
int dx[4] = {0,1,0,1};
int dy[4] = {0,0,1,1};
void sol(int startVal, int n,int y,int x) {
    if (n == 2) {
        
        for (int dir = 0;dir < 4;dir++) {
            int nextY = y + dy[dir], nextX = x + dx[dir];
            arr[nextY][nextX] = startVal++;
        }
        return;
    }
    
    int size = n / 2;
    int c = 0;
    for (int i = y;i < y + n;i += size) {
        for (int j = x;j < x + n;j += size) {
           
            sol((c++ * size*size)+startVal, size, i, j);
        }
    }
}
int main() {
    int n, r, c;
    cin >> n >> r >> c;
    int s = pow(2, n);
    arr = new int* [s];
    for (int i = 0;i < s;i++)
        arr[i] = new int[s];
    
    sol(0,s, 0, 0);     
    
    cout << arr[r][c];
}
