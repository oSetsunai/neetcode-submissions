class Solution {
    public String longestCommonPrefix(String[] strs) {

        //Commencons avec le premier mot
        String commonPrefix = strs[0];

        //Premiere boucle pour iterer tous les mots du tableau
        for(int i = 0; i < strs.length; i++){

            //Si le mot n'a pas le meme prefix que le prefix commun (Premier mot)
            while(!strs[i].startsWith(commonPrefix)){
                
                //On retire une lettre du prefix commun. 
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);

            }
        }
        
        //If there's no prefix
        return commonPrefix;
    }
} 