package forloop;

public class FindAinGivenString {

    public static void main(String[] args) {
        System.out.println("hello");

        // Find the count opf character a in a given string
        String s="Hanamya";
        System.out.println("Given string is Hanamya");
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch='a';
            if(s.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("The number of times 'a' appears is "+count);


    }

}
