import java.util.*;

import java.util.regex.*;

import java.io.*;



public class Frequency {

   public static void main(String[] args) {

      String str;

      Scanner in = new Scanner(System.in);  

      System.out.println("Enter line of String: ");

      str = in.nextLine();

      System.out.println("Using the First Method");

      findOccurrence(str);

      System.out.println("Using the Second Method");

      findOccurrence1(str);

   }


private static void  findOccurrence( String inputStr)

 {

  List wordList = Arrays.asList(inputStr.split("\s+")); 

 HashSet hashSet = new HashSet(wordList);   

  wordList = new ArrayList(hashSet) ;



  for (String word:wordList)

 {

        int count=0;

        Pattern p = Pattern.compile(word );

        Matcher matcher = p.matcher(inputStr);

        boolean found = matcher.find();

        while(found) { 

                found = matcher.find();

         count++;

               }

    System.out.println(word + " " + count);

 }       
   }



public static void findOccurrence1(String inputStr)

{



List wordList = Arrays.asList(inputStr.split("\s+")); 

   Map map = new TreeMap();

      for (String word :wordList) {

          Integer count = map.get(word);

          map.put(word, (count == null ? 1 : count + 1));

      }

      System.out.println(map);



}

}
