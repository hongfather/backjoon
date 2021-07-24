#include <iostream>
using namespace std;
int t;
int* arr;
void sol(int startIdx, int count, int list[]) {
    if (count == 6) {
        for (int i = 0;i < 6;i++)
            cout << list[i] << " ";
        cout << endl;
        return;
    }
    for (int i = startIdx;i < t;i++) {
        list[count] = arr[i];
        sol(i + 1, count + 1, list);
    }
}
int main() {



    while (1) {
        cin >> t;
        if (t == 0)
            break;
        arr = new int[t];
        for (int i = 0;i < t;i++)
            cin >> arr[i];
        int list[6] = { 0 };
        sol(0, 0, list);
        cout << endl;

    }

}
