class Solution {
    public boolean isAnagram(String s, String t) {
            int m = s.length();
            int n = t.length();

            //base case

            if (m != n) return false;

            char[] sSort = s.toCharArray();
            char[] tSort = t.toCharArray();
            
            Arrays.sort(sSort);
            Arrays.sort(tSort);

            return Arrays.equals(sSort,tSort);
    }
}
