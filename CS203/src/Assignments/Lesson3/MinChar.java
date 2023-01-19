package Assignments.Lesson3;

public class MinChar {
    public static char minChar(String str, int idx){
        if(str.length()-1==idx)
            return str.charAt(idx);
        char nextMin = minChar(str,idx+1);
        if(str.charAt(idx)<nextMin)
            return str.charAt(idx);
        return nextMin;
    }

    public static void main(String[] args) {

        System.out.println(minChar("jkhwegk",0));
    }

}

