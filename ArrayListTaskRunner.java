
import java.util.*;
public class ArrayListTaskRunner{
   public static ArrayList<String> createStringArrayList(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of Strings:");
    int num=sc.nextInt();
    ArrayList<String> stringList=new ArrayList<String>(num);
    System.out.println("Enter the strings:");
    for(int i=0;i<num;i++)
    {
    stringList.add(sc.next());

   }
    return stringList;
  }
   public static ArrayList<Integer> createIntegerArrayList(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of Integers:");
    int num=sc.nextInt();
    ArrayList<Integer> integerList=new ArrayList<Integer>(num);
    System.out.println("Enter the integers:");
    for(int i=0;i<num;i++)
    {
    integerList.add(sc.nextInt());

   }
    return integerList;
  }
  public static ArrayList<Double> createDecimalArrayList(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of decimals:");
    int num=sc.nextInt();
    ArrayList<Double> doubleList=new ArrayList<Double>(num);
    System.out.println("Enter the decimals:");
    for(int i=0;i<num;i++)
    {
    doubleList.add(sc.nextDouble());

   }
    return doubleList;
  }
  public static ArrayList<Long> createLongArrayList(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of long values:");
    int num=sc.nextInt();
    ArrayList<Long> longList=new ArrayList<Long>(num);
    System.out.println("Enter the long values:");
    for(int i=0;i<num;i++)
    {
    longList.add(sc.nextLong());

   }
    return longList;
  }
  public static ArrayList<Student> createCustomList(){
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no.of data:");
      int size=sc.nextInt();
      System.out.println("Enter the rollNo:");
      int [] rollNo=new int[size];
       for(int i=0;i<size;i++){
          rollNo[i]=sc.nextInt();
       }
      System.out.println("Enter the name:");
      String [] name=new String[size];
      for(int i=0;i<size;i++){
          name[i]=sc.next();
      }
      System.out.println("Enter the marks:");
      int [] marks=new int[size];
      for(int i=0;i<size;i++){
          marks[i]=sc.nextInt();
      }
      ArrayList<Student> customList=new ArrayList<>();
      for(int i=0;i<size;i++){
         customList.add(new Student(rollNo[i],name[i],marks[i]));
      }
      return customList;
    }
   public static void main(String [] args){
    System.out.println("Enter the program number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    switch(number){
    case 1:
       int length=ArrayListTask.findLength();
       System.out.println("Length of the ArrayList is:"+length);
       break;
   case 2:
       ArrayList<String> list=createStringArrayList();
       System.out.println("ArrayList elements are:");
       for(int i=0;i<list.size();i++){
         System.out.println(list.get(i));
       }
       int arrayLength=list.size();
       System.out.println("Length of the ArrayList with elements:"+arrayLength);
       break;
  case 3:
       ArrayList<Integer> intList=createIntegerArrayList();
        System.out.println("ArrayList elements are:");
        for(int i=0;i<intList.size();i++){
          System.out.println(intList.get(i));
       }
       int intListLength=intList.size();
       System.out.println("Length of the Integer ArrayList:"+intListLength);
       break;
  case 4:
       ArrayList<Student> customArrayList=createCustomList();
       System.out.println("Custom ArrayList elements:");
       for(int i=0;i<customArrayList.size();i++){
           System.out.println(customArrayList.get(i)+" ");
      }
       int customListLength=customArrayList.size();
       System.out.println("Custom ArrayList size:"+customListLength);
       break;
  case 5:
        ArrayList<String> listArray=createStringArrayList();
        ArrayList<Integer> listInteger=createIntegerArrayList();
         ArrayList<Student> customArrList=createCustomList();
       ArrayList<Object> objList=ArrayListTask.createList(listInteger,listArray,customArrList);
       System.out.println("ArrayList elements are:");
       for(int i=0;i<objList.size();i++){
         System.out.println(objList.get(i)+" ");
      }
      int objLength=objList.size();
       System.out.println("ArrayList size:"+objLength);
       break;
  case 6:
       ArrayList<String> list3=createStringArrayList();
       System.out.println("Enter the string for which you want to find index:");
       String str=sc.next();
       ArrayList<String> strList=ArrayListTask.findIndex(list3,str);
       System.out.println("ArrayList elements are:");
       for(int i=0;i<strList.size();i++){
         System.out.println(strList.get(i));
       }
       break;
  case 7:
       ArrayList<String> stringArrList=createStringArrayList();
      // ArrayListTask.iterator(list4);
       Iterator<String> iter=stringArrList.iterator();
       System.out.println("ArrayList elements using iterator:");
       while(iter.hasNext()){
          System.out.println(iter.next()+" ");
       }
       System.out.println("ArrayList elements using for loop:");
       for(int i=0;i<stringArrList.size();i++){
         System.out.println(stringArrList.get(i)+" ");
       }
       break;
  case 8:
       ArrayList<String> list5=createStringArrayList();
       System.out.println("Enter the index:");
       int index=sc.nextInt();
       ArrayList<String> newList=ArrayListTask.findStringAtIndex(list5,index);
       int newLength=newList.size();
       System.out.println("Length of the string :"+newLength);
       break;
  case 9:
       ArrayList<String> list6=createStringArrayList();
       int lastIndex=ArrayListTask.findIndexOfDuplicate(list6);
       System.out.println("Last index of the duplicate element is:"+lastIndex);
       break;
  case 10:
       ArrayList<String> list7=createStringArrayList();
       System.out.println("Enter the string to be entered:");
       String strSecond=sc.next();
       System.out.println("Enter the position where string to be entered:");
       int position=sc.nextInt();
       ArrayList<String> addedList=ArrayListTask.addString(list7,strSecond,position);
       System.out.println("ArrayList elements after adding a string:");
       for(String arr:addedList){
         System.out.println(arr);
       }
      int addedListLength=addedList.size();
      System.out.println("Size of the ArrayList after adding a string:"+addedListLength);
       break;
  case 11:
       ArrayList<String> list8=createStringArrayList();
       System.out.println("Enter the index where second arraylist starts:");
       int startIndex=sc.nextInt();
       System.out.println("Enter the index where second arraylist ends:");
       int endIndex=sc.nextInt();
       ArrayList<String> secondList=ArrayListTask.createArrayList(list8,startIndex,endIndex);
       System.out.println("Second ArrayList elements:");
       for(String secondArray:secondList){
         System.out.println(secondArray);
       }
       int secondLength=secondList.size();
       System.out.println("Second ArrayList size:"+secondLength);
       break;
 case 12:
       ArrayList<String> list9=createStringArrayList();
       ArrayList<String> thirdList=ArrayListTask.createThreeArrayList(list9);
       System.out.println("Third ArrayList elements:");
      for(int i=0;i<thirdList.size();i++){
         System.out.println(thirdList.get(i)+" ");
      }
      int thirdArrLength=thirdList.size();
       System.out.println("third ArrayList size:"+thirdArrLength);
       break;
  case 13:
       ArrayList<String> list10=createStringArrayList();
       ArrayList<String> thirdArrList=ArrayListTask.createThirdArrayList(list10);
       System.out.println("Third ArrayList elements:");
       for(int i=0;i<thirdArrList.size();i++){
         System.out.println(thirdArrList.get(i)+" ");
      }
       int thirdLength=thirdArrList.size();
       System.out.println("third ArrayList size:"+thirdLength);
       break;
 case 14:
       ArrayList<Double> doubleList=createDecimalArrayList();
       System.out.println("enter the value to be removed:");
       double decimalValue=sc.nextDouble();
       ArrayList<Double> decimalList=ArrayListTask.removeDecimalValue(doubleList,decimalValue);
       int decimalListLength=decimalList.size();
       System.out.println("Arraylist after removing an element:");
       for(Double arr:decimalList){
         System.out.println(arr);
       }
       System.out.println("ArrayList size after removing an element:"+decimalListLength);
       break;
 case 15:
       ArrayList<Double> doubleList1=createDecimalArrayList();
       System.out.println("Enter the index where the value to be removed:");
       int removePosition=sc.nextInt();
       ArrayList<Double> deciList=ArrayListTask.removeDecimalValueAtIndex(doubleList1,removePosition);
       int deciLength=deciList.size();
       System.out.println("Arraylist after removing an element at given position:");
       for(Double deciArray:deciList){
         System.out.println(deciArray);
       }
       System.out.println("ArrayList size after removing an element:"+deciLength);
       break;
 case 16:
       ArrayList<Long> longArrayList=Remove.removeLongValue();
       int removedListLength=longArrayList.size();
        System.out.println("Arraylist after removing the elements:");
        for(Long arrayLong:longArrayList){
           System.out.println(arrayLong);
        }
        System.out.println("ArrayList size:"+removedListLength);
       break;
 case 17:
       ArrayList<String> list11=createStringArrayList();
       ArrayList<String> firstList=ArrayListTask.removeElements(list11);
       System.out.println("First ArrayList elements after removing elements which are present in 2nd arraylist:");
       for(int i=0;i<firstList.size();i++){
         System.out.println(firstList.get(i)+" ");
       }
       int firstLength=firstList.size();
       System.out.println("First ArrayList size after removing elements which are present in 2nd arraylist:"+firstLength);
       break;
 case 18:
       ArrayList<String> list12=createStringArrayList();
       ArrayList<String> firstArrList=ArrayListTask.removeNonDuplicateElements(list12);
       System.out.println("First ArrayList elements after removing elements which are not present in 2nd arraylist:");
       for(int i=0;i<firstArrList.size();i++){
         System.out.println(firstArrList.get(i)+" ");
       }
       int firstListLength=firstArrList.size();
       System.out.println("ArrayList size after removing elements which are not present in 2nd arraylist:"+firstListLength);
       break;
  case 19:
       ArrayList<Long> longList=createLongArrayList();
       ArrayList<Long> longArrList=ArrayListTask.removeAllLongValue(longList);
       int longListSize=longArrList.size();
       System.out.println("Arraylist after removing the elements:");
       for(Long longArr:longList){
          System.out.println(longArr);
       }
       System.out.println("ArrayList size:"+longListSize);
       break;
  case 20:
       ArrayList<String> list13=createStringArrayList();
       System.out.println("Enter the string to be checked:");
       String checkStr=sc.next();
       ArrayList<String> checkList=ArrayListTask.checkString(list13,checkStr);
       int checkListLength=checkList.size();
       System.out.println("ArrayList elements are:");
       for(String checkArr:checkList){
          System.out.println(checkArr);
       }
       System.out.println("ArrayList size:"+checkListLength);
       break;
   default:
       System.out.println("No program");
       break;
   }
 }
}
 
