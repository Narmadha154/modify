
import java.util.Scanner;
import java.util.*;
public class HashMapTask{
   public static HashMap<String,String> createStringHashMap(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of key value pairs:");
     int num=sc.nextInt();
     HashMap<String,String> stringMap=new HashMap<>();
     for(int i=0;i<num;i++){
        System.out.println("Enter the key:");
        String key=sc.next();
        System.out.println("Enter the value:");
        String value=sc.next();
        stringMap.put(key,value);
     }
     return stringMap;
    }
     public static HashMap<Integer,Integer> createIntegerHashMap(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no.of key value pairs:");
      int num=sc.nextInt();
      HashMap<Integer,Integer> integerMap=new HashMap<>();
      for(int i=0;i<num;i++){
        System.out.println("Enter the key:");
        int intKey=sc.nextInt();
        System.out.println("Enter the value:");
        int intValue=sc.nextInt();
        integerMap.put(intKey,intValue);
     }
     return integerMap;
    }
     public static HashMap<String,Integer> createStringIntegerHashMap(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the no.of key value pairs:");
      int num=sc.nextInt();
      HashMap<String,Integer> stringIntegerMap=new HashMap<>();
      for(int i=0;i<num;i++){
        System.out.println("Enter the key:");
        String strKey=sc.next();
        System.out.println("Enter the value:");
        int integerValue=sc.nextInt();
        stringIntegerMap.put(strKey,integerValue);
     }
     return stringIntegerMap;
    }
   public static int findSize(){
       HashMap map=new HashMap();
       int size=map.size();
       System.out.println("Hashmap elements:"+map);
       return size;
   }
   public static HashMap<String,String> findStringMapSize(){
       HashMap<String,String> map=createStringHashMap();
       return map;
   }
    public static HashMap<Integer,Integer> findIntegerMapSize(){
       HashMap<Integer,Integer> map=createIntegerHashMap();
       return map;
   }
   public static HashMap<String,String> addNullValue(){
       HashMap<String,String> map=createStringHashMap();
       return map;
    }
   public static HashMap<Integer,Integer> addNull(){
     /*HashMap<Integer,Integer> map=new HashMap<>();
       map.put(key,value);*/
       HashMap<Integer,Integer> map=createIntegerHashMap();
       return map;
   }
   public static boolean checkKey(String key){
     HashMap<String,String> map=createStringHashMap();
     boolean value= map.containsKey(key);
     return value;
   }
   public static boolean checkValue(String value){
     HashMap<String,String> map=createStringHashMap();
     boolean checkValue= map.containsValue(value);
     return checkValue;
   }
   public static HashMap<String,String> changeValues(){
      HashMap<String,String> map=createStringHashMap();
      map.replaceAll((key, oldValue)
                            -> oldValue + oldValue);
      return map;                      
   }
   public static int getValue(String key){
     HashMap<String,Integer> map=createStringIntegerHashMap();
     int value=0;
      if(map.containsKey(key)){
           value=map.get(key);
      }
      else{
          System.out.println("Given key is not existing");
      }
      return value;
   } 
    public static String getValueForKey(String key){
     HashMap<String,String> map=createStringHashMap();
     int size=map.size();
     System.out.println("Size of the HashMap before changes:"+size);
     String value=null;
      if(map.containsKey(key)){
           value=map.get(key);
      }
      else{
          System.out.println("Given key is not existing");
          value="zoho";
      }
      return value;
   } 
   public static HashMap<Integer,Integer> removeKey(int key){
     HashMap<Integer,Integer> map=createIntegerHashMap();
      System.out.println("Hashmap elements before changes:");
           for(Map.Entry map1: map.entrySet()){    
                System.out.println(map1.getKey()+" "+map1.getValue());    
           } 
     int size=map.size();
     System.out.println("Size of the HashMap before changes:"+size);
     if(map.containsKey(key)){
        map.remove(key);
     }
     else{
       System.out.println("Given key is not existing");
     }
     return map;
   }
   public static HashMap<String,String> removeMatchedValue(String key,String value){
        HashMap<String,String> map=createStringHashMap();
         System.out.println("Hashmap elements before changes:");
           for(Map.Entry map2: map.entrySet()){    
                System.out.println(map2.getKey()+" "+map2.getValue());    
           } 
        int size=map.size();
        System.out.println("Size of the HashMap before changes:"+size);
       if(map.containsKey(key)){
            if(value.equals(map.get(key))){
                map.remove(key);
            }
            else{
               System.out.println("Given value not matched with key value");
            }
       }
       else{
        System.out.println("Given key is not existing");   
       }
    return map;
   }
   public static HashMap<String,Integer> replaceValue(String key,int replaceValue){
         HashMap<String,Integer> map=createStringIntegerHashMap();
         System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
         int size=map.size();
         System.out.println("Size of the HashMap before changes:"+size);
         if(map.containsKey(key)){
              map.replace(key,replaceValue);
          }
         else{
        System.out.println("Given key is not existing");   
       }
    return map;
   } 
    public static HashMap<String,Integer> replaceMatchedValue(String key,int replaceValue,int matchValue){
          HashMap<String,Integer> map=createStringIntegerHashMap();
          System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
         int size=map.size();
         System.out.println("Size of the HashMap before changes:"+size);
         if(map.containsKey(key)){
             if(matchValue==map.get(key)){
                 map.replace(key,replaceValue);
             }
             else{
                 System.out.println("Given value not matched with key value");
             }
          }
         else{
           System.out.println("Given key is not existing");   
       }
    return map;
   } 
  public static HashMap<String,Integer> transferKeysValues(){
        HashMap<String,Integer> firstMap=createStringIntegerHashMap();
         HashMap<String,Integer> secondMap=createStringIntegerHashMap();
          System.out.println("Hashmap1 elements before changes:");
          for(Map.Entry hashMap1: firstMap.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
           int size1=firstMap.size();
          System.out.println("Size of the HashMap1 before changes:"+size1);
           System.out.println("Hashmap2 elements before changes:");
          for(Map.Entry hashMap1: secondMap.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
           int size2=secondMap.size();
          System.out.println("Size of the HashMap2 before changes:"+size2);
       secondMap.putAll(firstMap);
       System.out.println("Hashmap1 elements after changes:");
          for(Map.Entry hashMap: firstMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }
           int size=firstMap.size();
          System.out.println("Size of the HashMap1 after changes:"+size);
       return secondMap;
  }  
  public static HashMap<String,Integer> iterateHashMap(){
         HashMap<String,Integer> map=createStringIntegerHashMap();
         return map;
  }
  public static HashMap<String,Integer> removeAllEntries(){
         HashMap<String,Integer> map=createStringIntegerHashMap();
         System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
        int size=map.size();
        System.out.println("Size of the HashMap before changes:"+size);
        map.clear(); 
        return map;
   }        
 }
