class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] s_f=new int[26];
        int[] t_f=new int[26];
        for(int i=0;i<s.length();i++){
            s_f[s.charAt(i)-'a']++;
            t_f[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(s_f[i]!=t_f[i]){
                return false;
            }
        }
        return true;
    }
}
