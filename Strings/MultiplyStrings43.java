class Solution {
  // In Java we can use BigInt but in question it is restricted 
    public String multiply(String num1, String num2) {
        int[] ans =  new int[num1.length() + num2.length()];
        Arrays.fill(ans,0);
        for (int i = num2.length() -1; i >= 0;i--) {
            for (int j = num1.length() -1; j>= 0; j--) {
                int mul = (num2.charAt(i) - '0') * (num1.charAt(j) - '0');
                int sum = mul + ans[i+j+1];
                ans[i +j +1] = sum % 10;
                ans[i +j] += sum / 10;
            }
        }
        StringBuilder str1 = new StringBuilder();
        for(int num : ans){
            if(!(str1.length() == 0 && num ==0)){
                    str1.append(num);
            }
        }
        return str1.length() == 0 ? "0" : str1.toString();
    }
}
