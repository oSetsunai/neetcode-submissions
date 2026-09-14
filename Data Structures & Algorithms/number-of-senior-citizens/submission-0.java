class Solution {
    public int countSeniors(String[] details) {
        
        int seniors = 0;

        for(int i = 0; i < details.length; i++){

            String currentCitizenDetail = details[i];
            String ageString = details[i].substring(11,13);
            int age = Integer.parseInt(ageString);

            if(age > 60){
                System.out.println(age);
                seniors++;
            }

        }

        return seniors;
    }
}