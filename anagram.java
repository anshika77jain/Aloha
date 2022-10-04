import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        String s1=in.next();
        s=s.toLowerCase();
        s1=s1.toLowerCase();
        ArrayList<Character> li=new ArrayList<>();
        ArrayList<Character> li1=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            li.add(s.charAt(i));
            li1.add(s1.charAt(i));
        }
        Collections.sort(li);
        Collections.sort(li1);
        System.out.println(li);
        System.out.println(li1);
        if(li.equals(li1))
          System.out.println("anagram");
        else
          System.out.println("not anagram");
    }
}
