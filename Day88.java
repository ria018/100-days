package day88;
public class Day88 {
    public static void main(String[] args) {
        String pesan = "Ria Ramadani";
        int length = getStringLength(pesan);
        System.out.println("Panjang string : " + length);
        
        String uppercase = convertToUppercase (pesan);
        System.out.println("Uppercase : " + uppercase);
        
        String reversed = reverseString(pesan);
        System.out.println("Reversed : " + reversed);
    }
    public static int getStringLength(String str){
        int lenght = str.length();
        return lenght;
    }
    public static String convertToUppercase(String str){
        String uppercase = str.toUpperCase();
        return uppercase;
    }
    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        return reversed;
    }
}
