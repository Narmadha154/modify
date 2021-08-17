
import java.util.*;
public class HashMapTaskRunner{
   public static HashMap<String,String> createStringHashMap(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of key value pairs:");
     int num=sc.nextInt();
     System.out.println("Enter the keys:");
     String [] keyArray=new String[num];
     for(int i=0;i<num;i++){
          keyArray[i]=sc.next();
     }
     System.out.println("Enter the values:");
     String [] valueArray=new String[num];
     for(int i=0;i<num;i++){
          valueArray[i]=sc.next();
     }
     HashMap<String,String> stringMap=new HashMap<>(num);
     for(int i=0;i<num;i++){
        stringMap.put(keyArray[i],valueArray[i]);
     }
     return stringMap;
    }
     public static HashMap<Integer,Integer> createIntegerHashMap(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of key value pairs:");
     int num=sc.nextInt();
     System.out.println("Enter the keys:");
     int [] keyArray=new int[num];
     for(int i=0;i<num;i++){
          keyArray[i]=sc.nextInt();
     }
     System.out.println("Enter the values:");
     int [] valueArray=new int[num];
     for(int i=0;i<num;i++){
          valueArray[i]=sc.nextInt();
     }
     HashMap<Integer,Integer> integerMap=new HashMap<>(num);
     for(int i=0;i<num;i++){
        integerMap.put(keyArray[i],valueArray[i]);
     }
     return integerMap;
    }
     public static HashMap<String,Integer> createStringIntegerHashMap(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of key value pairs:");
     int num=sc.nextInt();
     System.out.println("Enter the keys:");
     String [] keyArray=new String[num];
     for(int i=0;i<num;i++){
          keyArray[i]=sc.next();
     }
     System.out.println("Enter the values:");
     int [] valueArray=new int[num];
     for(int i=0;i<num;i++){
          valueArray[i]=sc.nextInt();
     }
     HashMap<String,Integer> stringIntegerMap=new HashMap<>(num);
     for(int i=0;i<num;i++){
        stringIntegerMap.put(keyArray[i],valueArray[i]);
     }
     return stringIntegerMap;
    }
   public static void main(String [] args){
    System.out.println("Enter the program number:");
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    switch(number){
       case 1:
          int size=HashMapTask.findSize();
          System.out.println("Size of the Hashmap:"+size);
          break;
       case 2:
          HashMap<String,String> map1=createStringHashMap();
          int mapSize1=HashMapTask.findStringMapSize(map1);
          System.out.println("Size of the String Hashmap:"+mapSize1);
          break;
      case 3:
          HashMap<Integer,Integer> map2=createIntegerHashMap();
          int mapSize2=HashMapTask.findIntegerMapSize(map2);
          System.out.println("Size of the Integer Hashmap:"+mapSize2);
          break;
      case 4:
          HashMap<String,Integer> strIntMap=createStringIntegerHashMap();
          int mapSize=strIntMap.size();
           System.out.println("Hashmap elements:");
           for(Map.Entry map: strIntMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           }  
          System.out.println("Size of the Integer Hashmap:"+mapSize);
          break;
     case 8:
           HashMap<String,String> strMap=createStringHashMap();
           System.out.println("Enter the key to be checked:");
           String key=sc.next();
           boolean value=HashMapTask.checkKey(strMap,key);
           System.out.println("Given key is present in the hashmap:"+value);
           break;
     case 9:
           HashMap<String,String> stringHashMap=createStringHashMap();
           System.out.println("Enter the value to be checked:");
           String strValue=sc.next();
           boolean booleanValue=HashMapTask.checkValue(stringHashMap,strValue);
           System.out.println("Given value is present in the hashmap:"+booleanValue);
           break;
     case 10:
          HashMap<String,String> stringHash=createStringHashMap();
          HashMap<String,String> changedHash=HashMapTask.changeValues(stringHash);
          System.out.println("Hashmap elements:");
           for(Map.Entry mapChange: changedHash.entrySet()){    
                System.out.println(mapChange.getKey()+" "+mapChange.getValue());    
           } 
           break;
       default:
         System.out.println("No program");
         break;
     }
  }
 }
