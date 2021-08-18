
import java.util.Scanner;
public class StringBuilderRunner{
  public static StringBuilder getString(){
    StringBuilder sb=new StringBuilder();
    System.out.println("Enter the string:");
    Scanner sc=new Scanner(System.in);
    sb.append(sc.next());
    System.out.println("The string is:"+sb);
    return sb;
  }
  public static String[] getMultipleString(){
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the no.of strings:");
              int size=sc.nextInt();
              System.out.println("Enter the strings:");
              String [] stringArray=new String[size];
              for(int i=0;i<size;i++){
                   stringArray[i]=sc.next();
              }
              return stringArray;
  }
    public static StringBuilder createStringBuilder(String [] array){
             StringBuilder initialString=new StringBuilder();
             for(int i=0;i<array.length;i++){
                      if(i!=array.length-1){
                      initialString.append(array[i]);
                      initialString.append(" "); 
                      }
                      else{
                      initialString.append(array[i]);
                      }
             }
             System.out.println("Initial string is:"+initialString);
             return initialString;
}
 public static void main(String [] args){
    System.out.println("Enter the program number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
  switch(number){
    case 1:
        int length=StringBuilderTask.findLength();
        System.out.println("Length of the string builder with no string is:"+length);
        StringBuilder sb=getString();
        int stringBuilderLength=StringBuilderTask.finalLength(sb);
        System.out.println("Length of the string builder with string is:"+stringBuilderLength);
        break;
    case 2:
        StringBuilder string=getString();
        String [] array=getMultipleString();
        StringBuilder stringFinal=StringBuilderTask.finalString(string,array);
        System.out.println("Final string after separated by # is:"+stringFinal);
        break;
    case 3:
         String [] stringArr=getMultipleString();
         StringBuilder stringbuild1=createStringBuilder(stringArr);
         System.out.println("Enter the third string:");
         String str3=sc.next();
         StringBuilder finalString=StringBuilderTask.finalMultipleString(stringbuild1,str3);
         System.out.println("Final string after inserting a string with space is:"+finalString);
         break;
    case 4:
         String [] stringArr1=getMultipleString();
         StringBuilder stringbuild2=createStringBuilder(stringArr1);
         StringBuilder finalString1=StringBuilderTask.deleteFirstString(stringbuild2);
         System.out.println("Final string after deleting first string is:"+finalString1);
         break;
    
    case 5:
         String [] arr=getMultipleString();
         StringBuilder string1=createStringBuilder(arr);
         System.out.println("Enter the string to be replaced:");
         String replaceString=sc.next();
         StringBuilder finalString2=StringBuilderTask.replaceString(string1,replaceString);
         System.out.println("Final string after replacing space with - is:"+finalString2);
         break;
    case 6:
         String [] arr1=getMultipleString();
         StringBuilder string2=createStringBuilder(arr1);
         StringBuilder finalString3=StringBuilderTask.reverseString(string2);
         System.out.println("Final string after reversing is:"+finalString3);
         break;
     case 7:
          StringBuilder stringbuilder=getString();
          System.out.println("Enter the starting index:");
          int startIndex=sc.nextInt();
          System.out.println("Enter the ending index:");
          int endIndex=sc.nextInt();
          StringBuilder deletedString=StringBuilderTask.deleteCharacters(stringbuilder,startIndex,endIndex);
          System.out.println("Final string after deleting 6 to 8 index is:"+deletedString);
          break;
      case 8:
          StringBuilder stringbuilder1=getString();
          System.out.println("Enter the starting index:");
          int startIndex1=sc.nextInt();
          System.out.println("Enter the ending index:");
          int endIndex1=sc.nextInt();
          System.out.println("Enter the string to be replaced:");
          String replaceStr=sc.next();
          StringBuilder finalString5=StringBuilderTask.replaceCharacters(stringbuilder1,startIndex1,endIndex1,replaceStr);
          System.out.println("Final string after replacing 6 to 8 index is:"+finalString5);
          break;
     case 9:
         String [] arr2=getMultipleString();
         StringBuilder string3=createStringBuilder(arr2);
         System.out.println("Enter the string to be replaced:");
         String replaceString1=sc.next();
         StringBuilder stringBuild=StringBuilderTask.findIndex(string3,replaceString1);
         System.out.println("Final string is:"+stringBuild);
         break;
    case 10:
         String [] arr3=getMultipleString();
         StringBuilder string4=createStringBuilder(arr3);
         System.out.println("Enter the string to be replaced:");
         String replaceString2=sc.next();
         StringBuilder stringBuild1=StringBuilderTask.findLastIndex(string4,replaceString2);
         System.out.println("Final string is:"+stringBuild1);
         break;
    default:
        System.out.println("No program");
        break;
  }
}
}

   
   

