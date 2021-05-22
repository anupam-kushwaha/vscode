#include<iostream>
using namespace std;

 int find_total_water(int arr[], int n, int i) {
     int total_water = 0;
     for(int i = 1; i < n-1; i++) {
         int left_max = find_left_max(arr, n, i);
         int right_max = find_right_max(arr, n, i);
         total_water = total_water + min(left_max, right_max) - arr[i];
         
     }
 }
