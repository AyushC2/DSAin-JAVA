class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
          String str1 = s.concat(s);
          int index = str1.indexOf(goal);
          if(index >= 0){
            return true;
          }
          return false;
    }
}
