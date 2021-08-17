

import java.util.*;
public class ArrayListTask{
    public static int findLength(){
      ArrayList<String> list=new ArrayList<>();
      int length=list.size();
      return length;
    }
    public static ArrayList<Object> createList(ArrayList<Integer> list,ArrayList<String> stringList,ArrayList<Student> customArrList){
       ArrayList<Object> arrList=new ArrayList<>();
       arrList.addAll(list);
       arrList.addAll(stringList);
       arrList.addAll(customArrList);
      return arrList;
    }
     public static ArrayList<String> findIndex(ArrayList<String> list,String str){
      int length=list.size();
      int index=list.indexOf(str);
      System.out.println("Index of the element is:"+index);
      System.out.println("Length of the ArrayList :"+length);
      return list;
    }
   public static ArrayList<String> findStringAtIndex(ArrayList<String> list,int index){
      String str=list.get(index);
      System.out.println("String at the given index is:"+str);
      return list;
    }
   public static int findIndexOfDuplicate(ArrayList<String> list){
      String str=null;
      for(int i=0;i<list.size();i++){
         for(int j=i+1;j<list.size();j++){
            if(list.get(i).equals(list.get(j))){
               str=list.get(j);
            }
         }
      }
      int firstIndex=list.indexOf(str);
      System.out.println("First index of the duplicate element is:"+firstIndex);
      int lastIndex=list.lastIndexOf(str);
      return lastIndex;
    }
   public static ArrayList<String> addString(ArrayList<String> list,String str,int position){
      list.add(position,str);
      return list;
    }
     public static ArrayList<String> createArrayList(ArrayList<String> list,int startIndex,int endIndex){
      ArrayList<String> secondList=new ArrayList<>();
      for(int i=startIndex;i<endIndex;i++){
           secondList.add(list.get(i));
      }
      return secondList;
    }
   public static ArrayList<String> createThreeArrayList(ArrayList<String> firstList){
      ArrayList<String> secondList=ArrayListTaskRunner.createStringArrayList();
      ArrayList<String> thirdList=new ArrayList<String>();
      thirdList.addAll(firstList);
      thirdList.addAll(secondList);
      return thirdList;
    }
   public static ArrayList<String> createThirdArrayList(ArrayList<String> firstList){
     ArrayList<String> secondList=ArrayListTaskRunner.createStringArrayList();
      ArrayList<String> thirdList=new ArrayList<String>();
      thirdList.addAll(secondList);
      thirdList.addAll(firstList);
      return thirdList;
    }
   public static ArrayList<Double> removeDecimalValue(ArrayList<Double> decimalList,double decimalValue){
      decimalList.remove(decimalValue);
      return decimalList;
    }   
   public static ArrayList<Double> removeDecimalValueAtIndex(ArrayList<Double> decimalList,int position){
      decimalList.remove(position);
      return decimalList;
    } 
   public static ArrayList<String> removeElements(ArrayList<String> firstList){
      ArrayList<String> secondList=ArrayListTaskRunner.createStringArrayList();
      firstList.removeAll(secondList);
      return firstList;
    }
   public static ArrayList<String> removeNonDuplicateElements(ArrayList<String> firstList){
      ArrayList<String> secondList=ArrayListTaskRunner.createStringArrayList();
      firstList.retainAll(secondList);
      return firstList;
    }
  public static ArrayList<Long> removeAllLongValue(ArrayList<Long> longList){
      longList.removeAll(longList);
      return longList;
    }
  public static ArrayList<String> checkString(ArrayList<String> list,String str){
       if(list.contains(str)){
            System.out.println("Given string is present in the ArrayList");
       }
      return list;
    } 
}
  class Remove extends ArrayList<Long>{
      public static  ArrayList<Long> removeLongValue(){
         Remove longList=new Remove();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the no.of long values:");
         int size1=sc.nextInt();
         System.out.println("Enter the long values:");
         Long [] longArray=new Long[size1];
         for(int i=0;i<size1;i++){
            longArray[i]=sc.nextLong();
         }
        for(int i=0;i<longArray.length;i++){
          longList.add(longArray[i]);
        } 
        System.out.println("Enter the start index:");
        int startIndex=sc.nextInt();
        System.out.println("Enter the end index:");
        int endIndex=sc.nextInt();
        longList.removeRange(startIndex,endIndex);
      return longList;
    } 
  }
    class Student{
       int rollNo;
       String name;
       int marks;
       Student(int rollNo,String name,int marks){
          this.rollNo=rollNo;
          this.name=name;
          this.marks=marks;
      }
      public String toString(){
           return "RollNo: "+rollNo+" "+"Name: "+name+" "+"Marks: "+marks;
      }
   }
