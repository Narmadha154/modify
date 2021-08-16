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
             public static StringBuilder finalMultipleString(StringBuilder string,String str3){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              int index=string.indexOf(" ");
              string.insert(index,str3);
              StringBuilder finalString=string.insert(index," ");
              int finalLength=finalLength(finalString);
              System.out.println("Final string length is:"+finalLength);
              return finalString;
      }  
      public static StringBuilder deleteFirstString(StringBuilder string){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              int index=string.indexOf(" ");
              StringBuilder finalString=string.delete(0,index);
              int finalLength=finalLength(finalString);
              System.out.println("Final string length is:"+finalLength);
              return finalString;
     }
          public static StringBuilder replaceString(StringBuilder string,String [] array,String replaceString){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              /*int index=string.indexOf(" ");*/
              StringBuilder string1=string.replace(array[0].length(),array[0].length()+1,replaceString);
              StringBuilder finalString=string1.replace(array[0].length()+array[1].length()+1,array[0].length()+array[1].length()+2,replaceString);
              int finalLength=finalLength(finalString);
              System.out.println("Final string length is:"+finalLength);
              return finalString;
    } 
    public static StringBuilder reverseString(StringBuilder string){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              StringBuilder finalString=string.reverse();
              int finalLength=finalLength(finalString);
              System.out.println("Final string length is:"+finalLength);
              return finalString;
    } 
    public static StringBuilder deleteCharacters(StringBuilder string,int index1,int index2,int minLength){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              StringBuilder finalString=new StringBuilder();
              if(initialLength>=minLength){
               finalString=string.delete(index1,index2);
              int finalLength=finalLength(finalString);
              System.out.println("Final string length is:"+finalLength);
              }
              else{
               finalString=null;
              }
              return finalString;
   }
   public static StringBuilder replaceCharacters(StringBuilder string,int index1,int index2,int minLength,String replaceString){
              int initialLength=finalLength(string);
              System.out.println("Initial length of the string is:"+initialLength);
              StringBuilder finalString=new StringBuilder();
              if(initialLength>=minLength){
              finalString=string.replace(index1,index2,replaceString);
              int finalLength=finalLength(finalString);
              System.out.println("Final string length is:"+finalLength);
              }
              else{
               finalString=null;
              }
              return finalString;
   }
      public static int findIndex(StringBuilder string,String [] array,String replaceString){
              StringBuilder string1=string.replace(array[0].length(),array[0].length()+1,replaceString);
              StringBuilder finalString=string1.replace(array[0].length()+array[1].length()+1,array[0].length()+array[1].length()+2,replaceString);
              System.out.println("Final string is:"+finalString);
              int length=finalLength(finalString);
              System.out.println("length of the string is:"+length);
              int firstIndex=finalString.indexOf(replaceString);
              return firstIndex;
  }
  public static int findLastIndex(StringBuilder string,String [] array,String replaceString){
              StringBuilder string1=string.replace(array[0].length(),array[0].length()+1,replaceString);
              StringBuilder finalString=string1.replace(array[0].length()+array[1].length()+1,array[0].length()+array[1].length()+2,replaceString);
              System.out.println("Final string is:"+finalString);
              int length=finalLength(finalString);
              System.out.println("length of the string is:"+length);
              int lastIndex=finalString.lastIndexOf(replaceString);
              return lastIndex;
  }
}         










