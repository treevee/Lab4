import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {

        System.out.println("ab".matches("a.b"));
        System.out.println("acb".matches("ab+a"));
        System.out.println("acb".matches("ab?a"));
        System.out.println("acb".matches("a.+a"));
        System.out.println("#ff0e1A".matches("#[0-9[a-fA-F]]{6}"));
        System.out.println("255.255.255.0".matches("[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}"));
        System.out.println("Main.java".matches("\\w*\\.java"));
        System.out.println("dadadad2".matches("\\D.*"));
        System.out.println("Poliunko O. H.".matches("[a-zA-Zа-яА-Я].*\\s{1,2}[a-zA-Zа-яА-Я]\\.\\s{1,2}[a-zA-Zа-яА-Я]\\."));

        System.out.println(LatinToCyrilic("game fsdfa fdsfas fdsfa"));
        PrintNLetteredWord("game fsdfa fdsfas fdsfa dfdf dsdada ffff");
        //System.out.println(FindOnlyLatin(5));
        System.out.println(FindDigitPolyndrome(5));
    }

    public static void PrintNLetteredWord(String str){
        String words[]=str.split(" ");
        for(String word : words){
            if(word.matches(".{4}")){
                System.out.println(word);
            }
        }
    }

    public static String LatinToCyrilic(String str){
        str =str.replace('a','а');
        str =str.replace('b','б');
        str =str.replace('c','к');
        str =str.replace('d','д');
        str =str.replace('e','е');
        str =str.replace('f','ф');
        str =str.replace('g','г');
        str =str.replace('h','х');
        str =str.replace('i','и');
        str =str.replace('j','ж');
        str =str.replace('k','к');
        str =str.replace('l','л');
        str =str.replace('m','м');
        str =str.replace('n','н');
        str =str.replace('o','о');
        str =str.replace('p','п');
        str =str.replace("q","кв");
        str =str.replace('r','р');
        str =str.replace('s','с');
        str =str.replace('t','т');
        str =str.replace('u','у');
        str =str.replace('v','в');
        str =str.replace('w','в');
        str =str.replace("x","кс");
        str =str.replace('y','й');
        str =str.replace('z','з');
        return str;
    }

    public static int FindOnlyLatin(int wordsAmount){
        int count=0;
        System.out.println("Enter your words:");
        Scanner in = new Scanner(System.in);
        for (int i=0;i<wordsAmount;i++){
            String word = in.nextLine();
            if(word.matches("[a-zA-Z]*")){
                count++;
            }
        }
        return count;
    }

    public static int FindOnlyDigits(int wordsAmount){
        int count=0;
        System.out.println("Enter your words:");
        Scanner in = new Scanner(System.in);
        for (int i=0;i<wordsAmount;i++){
            String word = in.nextLine();
            if(word.matches("[0-9]*")){
                count++;
            }
        }
        return count;
    }

    public static String FindDigitPolyndrome(int wordsAmount){
        System.out.println("Enter your words:");
        Scanner in = new Scanner(System.in);
        for (int i=0;i<wordsAmount;i++){
            String word = in.nextLine();
            if(word.matches("[0-9]*")){
                if(word.equals(new StringBuilder(word).reverse().toString())){
                    return word;
                }
            }
        }
        return "There is no digit polyndrome in your sequence";
    }
}