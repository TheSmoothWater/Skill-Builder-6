
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {

    // replace this line with your constants

    public static String findTYPattern(String s) {
        String temp = s.toLowerCase();
        String subString;

        int firstT = temp.indexOf('t');
        int firstY = temp.indexOf('y', firstT);

        if(firstY != -1){
            subString = s.substring(firstT, firstY + 1);
            return subString;
        }
        else{
            return "";
        }

    }
}

