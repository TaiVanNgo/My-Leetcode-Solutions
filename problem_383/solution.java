package problem_383;

public class solution {
    public static boolean canConstruct(String ransomNote, String magazine) {

        for (int i = 0; i < ransomNote.length(); i++) {
            char ransomCharacter = ransomNote.charAt(i);

            int matchedIndex = magazine.indexOf(ransomCharacter);
            //it will return the index of the character "ransomCharacter inside the String magazine"
            //If the character doesn't exist in the magazine, it returns -1

            if(matchedIndex == -1){
                return false;
            } else{
                magazine = magazine.substring(0, matchedIndex) + magazine.substring(matchedIndex + 1);
                //remove the letter out of the String
            }
        }
        return true;
    }

    public static void main(String[] args) {
        canConstruct("aa", "ab");
    }
}
