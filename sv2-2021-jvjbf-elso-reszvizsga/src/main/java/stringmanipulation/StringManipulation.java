package stringmanipulation;

public class StringManipulation {
    public String everyEvenCharacter(String s) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length(); i += 2){
            result = result.append(s.substring(i, i + 1));
        }
        return result.toString();
    }
}
