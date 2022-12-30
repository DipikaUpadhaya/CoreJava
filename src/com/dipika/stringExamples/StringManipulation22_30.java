package com.dipika.stringExamples;



public class StringManipulation22_30 {
    public static void main(String[] args) {
        StringManipulation22_30 sm= new StringManipulation22_30();
        String str="Ram";
        String result=sm.returnStringOfEvenIndex(str);
        System.out.println("Result of string indexes of even positions: "+result);

        //23
        System.out.println(sm.containAnotherString("Ramesh", "mesh"));
        System.out.println(sm.containAnotherString("Ramesh", "dipika"));

        //24
        System.out.println("Does string 1234 contain only digits: "+sm.containsOnlyDigits("1234"));
        System.out.println("Does string 94se contain only digits: "+sm.containsOnlyDigits("94se"));

        //25
       String afterremovingString= sm.removeSpecificCharacter("Dipika",'i');
        System.out.println(afterremovingString);

        //26.
        String concateResult=sm.concatenateString("Dipika", 5);
        System.out.println(concateResult);

        //27.
        int count=sm.countOfCertainCharacter("Deepeeka", 'e');
        System.out.println("The count of e in string deepeeka is: "+count);

        //28.
        System.out.println("The character at index 5 is: "+sm.getCharacter("deepika", 5));
        System.out.println("The character(unicode point) at index 5 is: "+sm.getCharacterUnicode("deepika", 5));

        //29.
        System.out.println("the character (unicode) before specified index is: "+sm.getCharacterUnicodeBefore("dipika",1));

        //30.
        System.out.println("the count of numbers of unicode points in range: "
                +sm.countNumberOfUnicodePoints("dipika", 2, 5));
    }
    //22.Write a Java program to return a new string using
    // every character of even positions from a given string.
    public  String returnStringOfEvenIndex(String str){
        String temp="";
        for(int i=0; i<str.length(); i++){
            if(i%2==0){
                char ch=str.charAt(i);
                temp=temp+ch;
            }
        }
        return temp;
    }
    //23. Write a Java program to check if a given string contains another string. Return true or false
    public boolean containAnotherString(String str, String str1){
        return str.contains(str1);
    }
    //24.Write a Java program to test if a given string contains only digits. Return true or false.
    public  boolean containsOnlyDigits(String str){
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if(!(ch>='0' && ch<='9'))
                return false;
        }
        return true;
    }
    //25.Write a Java program to remove a specified character from a given string.
    public String removeSpecificCharacter(String str, char removeCh){
        String temp="";
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            if((ch!=removeCh)){
                temp=temp+ch;
            }
        }
        return temp;
    }
    //26.Write a Java program to concatenate a given string with itself a given number of times.
    public String concatenateString(String str, int n){
        String result="";
        for(int i=1; i<=n; i++){
            result=result+str;
           // str=str.concat(str);
        }
        return result;
    }
    //27.Write a Java program to count occurrences of a certain character in a given string
    public int countOfCertainCharacter(String str, char ch){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char c=str.charAt(i);
            if(c==ch)
                count++;
        }
        return count;
    }
    //28.Write a Java program to get the character  at the given index within the String.
    public char getCharacter(String str, int index){
        return str.charAt(index);
    }
    //28. using (Unicode code point)
    public int getCharacterUnicode(String str, int index){
        return str.codePointAt(index);
    }
    //29.Write a Java program to get the character (Unicode code point)
    // before the specified index within the String.
    public int getCharacterUnicodeBefore(String str, int index){
        return str.codePointBefore(index);
    }
    //30.Write a Java program to count a number of Unicode code points
    // in the specified text range of a String
    public int countNumberOfUnicodePoints(String str,int startIndex, int endIndex){
        return str.codePointCount(startIndex, endIndex);
    }
}
