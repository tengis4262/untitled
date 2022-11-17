package Assignments.Lesson4;

public class WordCount {
    public int wordCount(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            counter++;
            if(str.charAt(i)=='A' || str.charAt(i)=='a')
                counter--;
            if(counter < 0)
                counter = 0;
        }
        return counter;
    }

    public static void main(String[] args) {
        WordCount ob = new WordCount();
        int count = ob.wordCount("aaaa");
        System.out.println("Words in sentence : " + count);
    }

}
