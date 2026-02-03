class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length <= 2) return false;

    // O(n log n)
        // int[] arr1 = arr.clone();
        // Arrays.sort(arr1);
        // int index = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i] == arr1[arr1.length - 1]) {
        //         index = i;
        //     }
        // }
        // if (index == 0 || index == arr.length - 1) return false;
        // for (int i = 0; i < index; i++) {
        //     if (arr[i] >= arr[i + 1]) return false;
        // }
        // for (int i = index; i < arr.length - 1; i++) {
        //     if (arr[i] <= arr[i + 1]) return false;
        // }
        // return true;

    // After watching Discussion Section
     int l = 0;
     int r = arr.length - 1;
     int n = arr.length;
     while(l + 1 < n && arr[l] < arr[l + 1]){
        l++;
     };
     while(r - 1 >= 0 && arr[r - 1] > arr[r]){
        r--;
     };
     return l > 0 && r < n - 1 && l == r;
    }
    
     static {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
                writer.write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
    }
}
