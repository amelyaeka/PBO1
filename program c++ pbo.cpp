#include <iostream>
using namespace std;

int main() {
    // Variabel dan Tipe Data
    int angka = 5;
    double decimal = 3.14;
    char karakter = 'A';
    
    // For Loop
    cout << "Loop For: ";
    for (int i = 1; i <= 5; ++i) {
        cout << i << " ";
    }
    cout << endl;
    
    // If Statement
    if (angka > 0) {
        cout << "Angka adalah bilangan positif." << endl;
    } else {
        cout << "Angka adalah bilangan negatif atau nol." << endl;
    }
    
    // While Loop
    cout << "Loop While: ";
    int counter = 1;
    while (counter <= 5) {
        cout << counter << " ";
        counter++;
    }
    cout << endl;
    
    // Do-While Loop
    cout << "Loop Do-While: ";
    int i = 1;
    do {
        cout << i << " ";
        i++;
    } while (i <= 5);
    cout << endl;
    
    // Array Satu Dimensi
    int arraySatuDimensi[5] = {1, 2, 3, 4, 5};
    cout << "Array Satu Dimensi: ";
    for (int i = 0; i < 5; ++i) {
        cout << arraySatuDimensi[i] << " ";
    }
    cout << endl;
    
    // Array Multidimensi
    int arrayMultiDimensi[2][3] = {{1, 2, 3}, {4, 5, 6}};
    cout << "Array Multidimensi:" << endl;
    for (int i = 0; i < 2; ++i) {
        for (int j = 0; j < 3; ++j) {
            cout << arrayMultiDimensi[i][j] << " ";
        }
        cout << endl;
}
