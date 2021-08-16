import java.util.Scanner;

public class StringTask{
public static int findLength(String str){
int length=str.length();
return length;
}

public static char[] convertIntoArray(String str){
char [] charArray=str.toCharArray();
System.out.println("Character array is:");
return charArray;
}
public static char findLastOne(String str){
int length=findLength(str);
char ch=str.charAt(length-2);
return ch;
}
public static int findOccurence(String str,char letter){
int length=findLength(str);
int count=0;
  for(int i=0;i<length;i++){
    if(str.charAt(i)==letter){
         count++;
    }
 }
return count;
}
public static int findGreatestPosition(String str,char letter){
int greatestPosition=str.lastIndexOf(letter);
 return greatestPosition;
}
public static String printLastFive(String str,int index){
int length=findLength(str);
String str1=null;
if(length>=5){
str1=str.substring(length-index,length);
}
else{
System.out.println("Length of the string is not enough");
str1=null;
}
return str1;
}
public static String printFirstThree(String str,int index1,int index2){
int length=findLength(str);
String str1=null;
if(length>=3){
str1=str.substring(index1,index2);
}
else{
System.out.println("Length of the string is not enough");
str1=null;
}
return str1;
}
public static String replaceThree(String str,int index1,int index2,String replaceStr){
int length=findLength(str);
String str1=null;
if(length>=3){
str1=str.replace(str.substring(index1,index2),replaceStr);
}
else{
System.out.println("Length of the string is not enough");
str1=null;
}
return str1;
}
public static boolean checkEnd(String str,String endString){
boolean value=str.endsWith(endString);
return value;
}
public static boolean checkStart(String str,String startString){
boolean value=str.startsWith(startString);
return value;
}
public static String convertLowerCase(String str){
String str1=str.toLowerCase();
return str1;
}
public static String convertUpperCase(String str){
String str1=str.toUpperCase();
return str1;
}
public static String reverseString(String str){
int length=findLength(str);
char [] ch=new char[length];
for(int i=length-1,j=0;i>=0&j<length;i--,j++){
ch[j]=str.charAt(i);
}
String str1 = String.valueOf(ch);
return str1;
}
public static String concatenateStrings(String str){
String [] array=str.split(" ");
int length=array.length;
 String newString=array[0];
    for(int i=1;i<length;i++){
     newString=newString.concat(array[i]);
     }
  return newString;
  }
public static String [] convertIntoStringArray(String str){
String [] array=str.split(" ");
 return array;
}
public static String mergeString(String str,String joinString){
 String [] array=str.split(" ");
 String newString=String.join(joinString,array);
return newString;
 }
public static boolean checkEquality(String str1,String str2){
 boolean value=str1.equals(str2);
 return value;
 }
 public static boolean checkStringEquality(String str1,String str2){
 boolean value=str1.equalsIgnoreCase(str2);
 return value;
 }
 public static String noSpace(String str){
  String newString=str.trim();
  return newString;
  }
}