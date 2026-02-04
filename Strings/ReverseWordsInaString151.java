class Solution {
    //   static {
    //     Runtime.getRuntime().addShutdownHook(new Thread(() -> {
    //         try (FileWriter writer = new FileWriter("display_runtime.txt")) {
    //             writer.write("0");
    //         } catch (IOException e) {
    //             e.printStackTrace();
    //         }
    //     }));
    // }
   
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            if(!arr[i].equals("") ){
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString().strip();
    }
}
