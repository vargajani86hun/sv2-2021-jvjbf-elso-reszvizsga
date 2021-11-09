package stringmanipulation;

public class StringManipulation {
    public String everyEvenCharacter(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i += 2){
            result = result.concat(s.substring(i, i + 1));
        }
        return result;
    }
}
