class Solution {
   
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())
            return false;
        for(int i=0;i<ransomNote.length();i++){
            int count1=countInRansomNote(ransomNote,ransomNote.charAt(i));
            int count2=countInMagazine(magazine,ransomNote.charAt(i));
            if(count1>count2){
                return false;
            }
        }
        return true;
        
    }
     public static int countInRansomNote(String input, char key){
         int count=0;
        for(int i=0; i<input.length(); i++){
             if(input.charAt(i) == key)
                 count++;
         }
        return count;
    }
    public static int countInMagazine(String input, char key2){
         int count=0;
    
        for(int i=0; i<input.length(); i++){
           
             if(input.charAt(i) == key2)
                  count++;
         }
        return count;
    }

}