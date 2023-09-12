public class RenameThisClass
{
    public static void main(String[] args) {
        int i = 10;
        double f = 2.5;
        f += i;
        boolean flag = true; 
        flag = !flag;
        i += 1;
        System.out.println(i);
        System.out.println(f);
        System.out.println(flag);
        String string1 = "I am a string";
        String string2 = "string2";
        string1.equals (string2);
        String string3 = "I am also a string";
        string1.compareTo(string3);
        boolean stringsEqual = (string1) == string3;
        System.out.println(stringsEqual);
        String[ ] strArray = {"Alpha", "Bravo", "Charlie", "Delta","Echo"};
    }
}