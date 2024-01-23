package string;

public class StringRotation {

    /***
     * Checks the String is rotation of another string.
     * example: JavaJ2eeStrutsHibernate, StrutsHibernateJavaJ2ee
     * Concatenation of one word among the both "JavaJ2eeStrutsHibernateJavaJ2eeStrutsHibernate"
     * We check whether second string "StrutsHibernateJavaJ2ee" is present or not.
     * @param inputOne
     * @param inputTwo
     * @return
     */

    public boolean checkStringRotation(String inputOne, String inputTwo) {
        if(inputOne.length() != inputTwo.length() || inputOne.equals(inputTwo)){
            return false;
        }
        else {
            String outputString = inputOne + inputOne;
            if(outputString.contains(inputTwo))
                return true;
        }
        return false;
    }
}
