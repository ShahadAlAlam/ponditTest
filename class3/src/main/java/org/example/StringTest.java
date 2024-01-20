package org.example;

public class StringTest {
    public static void main(String[] args) {
        //Hello World
        String str = "Hell o";
        //lowercase it
        System.out.println("lowercase it: "+str.toLowerCase());
        //uppercase it
        System.out.println("uppercase it: "+str.toUpperCase());
        //reverse it
        System.out.println("reverse it: "+ new StringBuilder(str).reverse());
        //find the length
        System.out.println("find the length: "+str.length());
        //find the index of 'e'
        System.out.println("find the index of 'e': "+str.indexOf("e"));
        //find the index of 'l'
        System.out.println("find the index of 'l': "+str.indexOf("l"));
        //find substring from index 1 to 3
        System.out.println("find substring from index 1 to 3: "+str.substring(1,3));
        //replace 'l' with 'm'
        System.out.println("replace 'l' with 'm': "+str.replace("l","m"));
        //replace vs replaceAll
        System.out.println("replace vs replaceAll: "+str.replace("l","m")+ " "+str.replaceAll("l","m"));

        //split it by ' '
        System.out.println("split it by ' ':"+ str.split(" "));
        //trim it
        System.out.println("trim it: "+str.trim());
        //concat it with " world" (with method)
        System.out.println("concat it with \" world\" (with method): "+str.concat(" world"));
        //contains
        System.out.println("contains: "+str.contains("ll"));
        //equals
        System.out.println("equals: "+str.equals("H"));
        //equalsIgnoreCase
        System.out.println("equalsIgnoreCase: "+str.equalsIgnoreCase("H"));
        //compareTo
        System.out.println("compareTo: "+str.compareTo("hello"));
        // == vs equals
        System.out.println("== vs equals: "+str=="hello"+ " "+str.equals("hello"));
        //difference between isBlank and isEmpty
        String sB = " ";
        if(sB.isBlank()){
            System.out.println("isBlank");
        }
        if(sB.isEmpty()){
            System.out.println("isEmpty");

        }
        System.out.println("difference between isBlank and isEmpty: "+sB.isBlank()+" "+sB.isEmpty());

        //starts with, ends with
        System.out.println("starts with, ends with: "+str.startsWith("h")+ " "+str.endsWith("o"));
    }
}
