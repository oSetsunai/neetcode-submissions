class Solution {
    public String longestCommonPrefix(String[] strs) {

        //Commencons avec le premier mot
        String commonPrefix = strs[0];

        for(int i = 0; i < strs.length; i++){

            while(!strs[i].startsWith(commonPrefix)){

                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);

            }
        }
        


        //If there's no prefix
        return commonPrefix;
    }
} 