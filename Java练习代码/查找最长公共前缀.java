class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans=strs[0];
        if(strs.length==0){
            return "";
        }
            for(int i=1;i<strs.length;i++){
                int k=0;
                for(;k<strs[i].length()&&k<ans.length();k++){
                    if(strs[i].charAt(k)!=ans.charAt(k)){
                        break;
                    }
                }
                ans=ans.substring(0,k);
            }
        
        return ans;

    }
}