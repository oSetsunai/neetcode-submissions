class Solution {
    public int lengthOfLastWord(String s) {

        //Commences a la fin
        int i = s.length() - 1;

        //Etape 1: on verifie si la fin contient des espaces.
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }

        //Compteur de la longueur du dernier mot.
        int count = 0;

        //Etape 2: on incremente le compteur jusqu'a temps il y a un espace
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
            count++;
        }

        //Retourne la longueur du dernier mot
        return count;
    }
}