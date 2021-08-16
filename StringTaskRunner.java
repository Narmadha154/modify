import java.util.Scanner;
public class StringTaskRunner{
public static String getString(){
System.out.println("Enter the string:");
Scanner sc1=new Scanner(System.in);
String str=sc1.next();
System.out.println("the string is:"+ str);
return str;
}
public static String getMultipleString(){
System.out.println("Enter the string:");
Scanner sc1=new Scanner(System.in);
String str=sc1.nextLine();
System.out.println("the string is:"+ str);
return str;
}
public static void main(String [] args){
System.out.println("Enter the program number:");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
 switch(number){
     case 1:
        String str=getString();
        int length=StringTask.findLength(str);
        System.out.println("length of the string:"+length);
        break;
     case 2:
        String str1=getString();
        char[] charArray=StringTask.convertIntoArray(str1);
        for(char character:charArray){
          System.out.println(character);
        }
        break;
    case 3:
        String str2=getString();
        char character=StringTask.findLastOne(str2);
        System.out.println("Last character in the string is:"+character);
        break;
    case 4:
        String str3=getString();
        System.out.println("Enter the letter:");
        char letter=sc.next().charAt(0);
        int count=StringTask.findOccurence(str3,letter);
        System.out.println("no.of ocurrence of the letter:"+count);
        break;
    case 5:
        String str4=getString();
        System.out.println("Enter the letter:");
        char letter1=sc.next().charAt(0);
        int position=StringTask.findGreatestPosition(str4,letter1);
        System.out.println("Greatest position of the letter is:"+position);
        break;
    case 6:
       String str5=getString();
       System.out.println("Enter the index:");
       int index=sc.nextInt();
       String string=StringTask.printLastFive(str5,index);
       System.out.println("Required String is:"+string);
       break;
    case 7:
       String str6=getString();
       System.out.println("Enter the starting index:");
       int index1=sc.nextInt();
       System.out.println("Enter the ending index:");
       int index2=sc.nextInt();
       String string1=StringTask.printFirstThree(str6,index1,index2);
       System.out.println("Required String is:"+string1);
       break;
    case 8:
       String str7=getString();
       System.out.println("Enter the starting index:");
       int firstIndex=sc.nextInt();
       System.out.println("Enter the ending index:");
       int secondIndex=sc.nextInt();
       System.out.println("Enter the string to be replaced:");
       String replaceString=sc.next();
       String replacedString=StringTask.replaceThree(str7,firstIndex,secondIndex,replaceString);
       System.out.println("Replaced String is:"+replacedString);
       break;
   case 9:
       String str8=getString();
       System.out.println("Enter the end string:");
       String endString=getString();
       boolean value=StringTask.checkEnd(str8,endString);
       System.out.println("String ends with le:"+value);
       break;
   case 10:
       String str9=getString();
       System.out.println("Enter the start string:");
       String startString=getString();
       boolean value2=StringTask.checkStart(str9,startString);
       System.out.println("String starts with ent:"+ value2);
       break;    
   case 11:
       String str10=getString();
       String lowercase=StringTask.convertLowerCase(str10);
       System.out.println("Required String is:"+lowercase);
       break;
   case 12:
       String str11=getString();
       String uppercase=StringTask.convertUpperCase(str11);
       System.out.println("Required String is:"+uppercase);
       break;              
   case 13:
       String str12=getString();
       String reversedString=StringTask.reverseString(str12);
       System.out.println("Reversed String is :" +reversedString);
       break;
   case 14:
       String str13=getMultipleString();
       System.out.println("Multiple Strings:"+str13);
       break;
   case 15:
       String str14=getMultipleString();
       String concatenatedString=StringTask.concatenateStrings(str14);
       System.out.println("String without space is:"+concatenatedString);
       break;
   case 16:
       String str15=getMultipleString();
       String [] array= StringTask.convertIntoStringArray(str15);
        System.out.println("String array is:");
        for(String arr:array){
           System.out.println(arr);
        } 
       break;
   case 17:
       String multipleStr=getMultipleString();
      /* System.out.println("enter the string to be joined:");*/
       String joinString=getString();
       String mergedString=StringTask.mergeString(multipleStr,joinString);
       System.out.println("merged string is:"+mergedString); 
       break;
  case 18:
     System.out.println(" first string:");
     String firstStr=getString();
     System.out.println("second string:");
      String secondStr=getString();
      boolean check=StringTask.checkEquality(firstStr,secondStr);
      System.out.println("Two strings are equal:"+check);
      break;
  case 19:
      System.out.println("first string:");
      String thirdStr=getString();
      System.out.println("second string:");
      String fourthStr=getString();
      boolean checkString=StringTask.checkStringEquality(thirdStr,fourthStr);
      System.out.println("Two strings are equal:"+checkString);
      break;   
  case 20:
     String str16=getMultipleString();
      String noSpaceString=StringTask.noSpace(str16);
      break;     
  default:
      System.out.println("No program");
  }                    
}
}  