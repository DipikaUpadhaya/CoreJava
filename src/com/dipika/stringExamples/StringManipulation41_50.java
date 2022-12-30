package com.dipika.stringExamples;

public class StringManipulation41_50 {
    public static void main(String[] args) {
        StringManipulation41_50 sm=new StringManipulation41_50();
        sm.createUniqueIdentifier("rameshdipika");

        //42.
        sm.getIndexOfCharacter("dipika");
        //43
        sm.getCanonicalRepresentation();
        //46
        sm.matchesRegionOfTwoString();
        //47
        String str="I love you dipika";
        System.out.println("original string: "+str);
        System.out.println("After replacing specified character with another character:");
        System.out.println(sm.replaceCharacter(str,'d', 'r'));

        //48.
        sm.replaceSubString();
        //50
        String str1="I am Dipika";
        System.out.println("The original string is: "+str1);
        System.out.println("The substring is: "+sm.getSubstring(str1,2,9));


    }
    //41.Write a Java program to create a unique identifier of a given string.
    public void createUniqueIdentifier(String str){
        int uniqueID= str.hashCode();
        System.out.println("The unique identifier for given string "+str+" is: "+uniqueID);
    }
    //42.Write a Java program to get the index of all the characters of the alphabet.
    public void getIndexOfCharacter(String str){
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            System.out.println("At index: "+i+" character is: " +ch);
        }
        int a= str.indexOf("a", 0);
        int b= str.indexOf("b", 0);
        int c= str.indexOf("c", 0);
        int d= str.indexOf("d", 0);
        int e= str.indexOf("e", 0);
        int f= str.indexOf("f", 0);
        int g= str.indexOf("g", 0);
        int h= str.indexOf("h", 0);
        int i= str.indexOf("i", 0);
        int j= str.indexOf("j", 0);
        int k= str.indexOf("k", 0);
        int l= str.indexOf("l", 0);
        int m= str.indexOf("m", 0);
        int n= str.indexOf("n", 0);
        int o= str.indexOf("o", 0);
        int p= str.indexOf("p", 0);
        int q= str.indexOf("q", 0);
        int r= str.indexOf("r", 0);
        int s= str.indexOf("s", 0);
        int t= str.indexOf("t", 0);
        int u= str.indexOf("u", 0);
        int v= str.indexOf("v", 0);
        int w= str.indexOf("w", 0);
        int x= str.indexOf("x", 0);
        int y= str.indexOf("y", 0);
        int z= str.indexOf("z", 0);
        System.out.println("a  b  c  d  e  f  g  h  i  j  k  l  m  n  o  p  q  r  s  t  u  v  w  x  y  z");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = ");
        System.out.println(a+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+j+" "+k+" "+
                l+" "+m+" "+n+" "+o+" "+p+" "+q+" "+r+" "+s+" "+t+" "+u+" "+v+" "+w+" "+x+" "+y+" "+z+" ");
    }
    //43.Write a Java program to get the canonical representation of the string object
    public void getCanonicalRepresentation(){
        String s1="hello";
        String s2= new String("hello");
        String s3=s1.intern();
        System.out.println("Does s1 and s2 equal? ");
        System.out.println(s1==s2);//FALSE becoz reference variables point to different instance
        System.out.println("Does s1 and s3 equal? ");
        System.out.println(s1==s3); //TRUE bcoz reference variables are pointing to same instance
    }
    //46.Write a Java program to find whether a region in the current string
    // matches a region in another string.
    public void matchesRegionOfTwoString(){
        String str1="Red Apple YelLow banana";
        String str2="YelloW Banana Red Apple";
        boolean match= str1.regionMatches(0, str2, 14, 7);
        boolean match1= str1.regionMatches(true, 10, str2, 0,12);
        System.out.println("Does a region matches between two string? "+match);
        System.out.println("Does a region matches between two string regardless of case? "+match1);
    }
    //47.Write a Java program to replace a specified character with another character.
    public String replaceCharacter(String str, char removedCharacter, char replacingCharacter){
       String newStr= str.replace(removedCharacter, replacingCharacter);
       return newStr;
    }
    //48.Write a Java program to replace each substring of a given string that matches the given
    // regular expression with the given replacement.
    //Sample string : "The quick brown fox jumps over the lazy dog."
    //In the above string replace all the fox with cat.
    public void replaceSubString(){
        String str="The quick brown fox jumps over the lazy dog, clever fox";
        String toRemoved="fox";
        String replaceBy="cat";
        String result=str.replace("fox","cat");
        System.out.println("The original string before replacement is: "+str);
        System.out.println("After replacing all fox with cat, the new string is: "+result);
    }
    //50.Write a Java program to get a substring of a given string between two specified positions.
    public String getSubstring(String str, int startindex, int endIndex){
       return str.substring(startindex, endIndex);
    }


}
