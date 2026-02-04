class Solution {
    public String capitalizeTitle(String title) {
        String[] w = title.split(" ");
        for (int i = 0; i < w.length; i++) {
            w[i] = w[i].toLowerCase();
            if (w[i].length() > 2) {
                w[i] = w[i].substring(0, 1).toUpperCase() + w[i].substring(1);
            }
        }
        return String.join(" ", w);
    }
}
