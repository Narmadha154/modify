

import java.util.Scanner;
public class StringBuilderTask{
     public static int findLength(){
           StringBuilder sb=new StringBuilder();
           int length=sb.length();
           return length;
     }
    public static int finalLength(StringBuilder string){
           int length=string.length();
           return length; 
     }
     public static StringBuilder finalString(StringBuilder string,String [] array){
            int initialLength=finalLength(string);
            System.out.println("Initial length of the string is:"+initialLength);
              for(int i=0;i<array.length;i++){
                      string.appendCodePoint(35);
                      string.append(array[i]);
             }
             int finalStringLength=finalLength(string);
             System.out.println("Final string length is:"+finalStringLength);
             return string;
      }
             public static StringBuilder finalMultipleString(StringBuilder string,String stringThree){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              int index=string.indexOf(" ");
              string.insert(index,stringThree);
              string.insert(index," ");
              int finalLength=finalLength(string);
              System.out.println("Final string length is:"+finalLength);
              return string;
      }  
      public static StringBuilder deleteFirstString(StringBuilder string){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              int index=string.indexOf(" ");
              string.delete(0,index);
              int finalLength=finalLength(string);
              System.out.println("Final string length is:"+finalLength);
              return string;
     }
          public static StringBuilder replaceString(StringBuilder string,String replaceString){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              for(int i=0;i<string.length();i++){
                  if(string.charAt(i)==' '){
                      string.replace(i,i+1,replaceString);
                   }
              }
              int finalLength=finalLength(string);
              System.out.println("Final string length is:"+finalLength);
              return string;
    } 
    public static StringBuilder reverseString(StringBuilder string){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              string.reverse();
              int finalLength=finalLength(string);
              System.out.println("Final string length is:"+finalLength);
              return string;
    } 
    public static StringBuilder deleteCharacters(StringBuilder string,int startIndex,int endIndex){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              StringBuilder finalString=new StringBuilder();
              if(initialLength>=endIndex){
               finalString=string.delete(startIndex,endIndex);
               int finalLength=finalLength(finalString);
               System.out.println("Final string length is:"+finalLength);
              }
              else{
               System.out.println("Length is not enough");
               finalString=null;
              }
              return finalString;
   }
   public static StringBuilder replaceCharacters(StringBuilder string,int startIndex,int endIndex,String replaceString){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              StringBuilder finalString=new StringBuilder();
              int replaceLength=replaceString.length();
              if(initialLength>=endIndex){
                 if((startIndex<endIndex)&&((endIndex-startIndex)==replaceLength)){
                    finalString=string.replace(startIndex,endIndex,replaceString);
                    int finalLength=finalLength(finalString);
                    System.out.println("Final string length is:"+finalLength);
              }
                 else{
                   System.out.println("Length of the replace String is not enough");
                   finalString=null;
               }
              }
              else{
                System.out.println("Length of the string is not enough");
                finalString=null;
              }
              return finalString;
   }
      public static StringBuilder findIndex(StringBuilder string,String replaceString){
              for(int i=0;i<string.length();i++){
                  if(string.charAt(i)==' '){
                      string.replace(i,i+1,replaceString);
                   }
              }
              int length=finalLength(string);
              System.out.println("length of the string is:"+length);
              int firstIndex=string.indexOf(replaceString);
              System.out.println("First index of # is:"+firstIndex);
              return string;
  }
  public static StringBuilder findLastIndex(StringBuilder string,String replaceString){
              for(int i=0;i<string.length();i++){
                  if(string.charAt(i)==' '){
                      string.replace(i,i+1,replaceString);
                   }
              }
              int length=finalLength(string);
              System.out.println("length of the string is:"+length);
              int lastIndex=string.lastIndexOf(replaceString);
              System.out.println("Last index of # is:"+lastIndex);
              return string;
  }
}         

