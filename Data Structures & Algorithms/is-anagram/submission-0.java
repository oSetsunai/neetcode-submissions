class Solution {
    public boolean isAnagram(String s, String t) {

        //Condition vérifie longueur
        if(s.length() != t.length()) return false;

        //Transforme les strings en tableau de caractères
        char[] sChar = s.toCharArray();   
        char[] tChar = t.toCharArray();

        //On réarrange les tableaux
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        //On retourne si les tableaux de caractères sont équivalents
        return Arrays.equals(sChar, tChar);
    }

}
