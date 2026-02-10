class Solution {
    public int[] occurrencesOfElement(int[] arr, int[] queries, int x){
        List<Integer> ls1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ls1.add(i);
            }
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int k = queries[i];
            if (k <= ls1.size()) {
                ans[i] = ls1.get(k - 1);
            } else {
                ans[i] = -1;
            }
        }
        return ans;
    }
}
