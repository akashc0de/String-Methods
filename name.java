package com.String;

public class name {
    public static void main(String[]args){

    // 1. String is a class non primitive data type;
    //*java.lang package
    //*collection of character

    // 2. String is a special class - specialities?
    //Classname reference
    //String s1= new String("Akash");
    //String s2='Akash //this is String Literal

    // String is Immutable
    //once we create a String, it cannot be edited. if we edit the String literal / object ,
    // a new string object / literal willl be creted.

    //Important Method in String

    String s1= new String("Akash");
    //System.out.println(s1.length());  // out put 5
    //System.out.println(s1.isBlank()); // output false // no word are white space in the String this method will return false

    //System.out.println(s1.isEmpty()) ; // output false // length is means the out will be false


        String ss1= new String("Java");
        String ss2= new String ("JAVA");

        //System.out.println(ss1.compareToIgnoreCase(ss2));

        boolean result=ss1.startsWith("J");
        //System.out.println(result);

        boolean result2 =ss2.endsWith("A");
        //System.out.println(result2);
         String a= new String("developer");
         StringBuffer aa= new StringBuffer("developer");
        //System.out.println(a.contentEquals(aa));



        // String Searching method
        String a1="chennai chennai chennai";
       // System.out.println(a1.indexOf("nn",7));
        //System.out.println(a1.lastIndexOf("e",14));

       // System.out.println("substring of "+a1.substring(0,8));


     String a2=" java developer ";
       // System.out.println(a2);
        //System.out.println(a2.strip());
        //System.out.println(a2.trim());
      //  System.out.println(a2.replaceAll(" ","-"));

        String [] a3=a2.split(" ");
        for(String aaa:a3) {
            System.out.println(aaa);
        }
        System.out.println(String.join("-","21","03","2000")); //output 21-03-200
        int n01=5;
        String j= String.valueOf(n01); //it will save value as string
        System.out.println(j);
        System.out.println(n01+j); //output 55

        System.out.println(a2.contains("java")); //true



}
}