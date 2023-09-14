public class RenameThisClass
{
    public static void main(String[] args) {
        int I = 10;
        double f = 2.5;
        f += I;
        boolean flag = true; 
        flag = !flag;
        I += 1;
        System.out.println(I);
        System.out.println(f);
        System.out.println(flag);
        String string1 = "I am a string";
        String string2 = "string2";
        string1.equals (string2);
        String string3 = "I am also a string";
        string1.compareTo(string3);
        boolean stringsEqual = (string1 == string3);
        System.out.println(stringsEqual);
        String[ ] strArray = {"Alpha", "Bravo", "Charlie", "Delta","Echo"};
    for (int i = 0; i < strArray.length; i++) {
        System.out.println(strArray[i]);
    }
    for (String value : strArray) {
        System.out.print(value);
    }
    for (int i = 4; i < strArray.length; i++) {
        System.out.println("  ");
    }
    for (int i = 0; i < 5; i++) {
        if (i == 4) {
            System.out.print(strArray[i]);
            break;
        }
        else 
         System.out.print(strArray[i] + "-");
    }
    }
}
