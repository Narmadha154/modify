
import java.util.Scanner;
import java.util.*;
public class HashMapTask{
   public static int findSize(){
       HashMap map=new HashMap();
       int size=map.size();
       System.out.println("Hashmap elements:"+map);
       return size;
   }
   public static int findStringMapSize(HashMap<String,String> map){
       int size=map.size();
       System.out.println("Hashmap elements:");
       for(Map.Entry m : map.entrySet()){    
        System.out.println(m.getKey()+" "+m.getValue());    
      }  
       return size;
   }
    public static int findIntegerMapSize(HashMap<Integer,Integer> map){
       int size=map.size();
       System.out.println("Hashmap elements:");
       for(Map.Entry m : map.entrySet()){    
        System.out.println(m.getKey()+" "+m.getValue());    
      }  
       return size;
   }
   public static boolean checkKey(HashMap<String,String> map,String key){
     boolean value= map.containsKey(key);
     return value;
   }
   public static boolean checkValue(HashMap<String,String> map,String value){
     boolean checkValue= map.containsValue(value);
     return checkValue;
   }
   public static HashMap<String,String> changeValues(HashMap<String,String> map){
      map.replaceAll((key, oldValue)
                            -> oldValue + oldValue);
      return map;                      
   }
   public static int getValue(HashMap<String,Integer> map,String key){
     int value=0;
      if(map.containsKey(key)){
           value=map.get(key);
      }
      else{
          System.out.println("Given key is not existing");
      }
      return value;
   } 
    public static String getValueForKey(HashMap<String,String> map,String key){
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
   public static HashMap<Integer,Integer> removeKey(HashMap<Integer,Integer> map,int key){
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
   public static HashMap<Integer,Integer> removeMatchedValue(HashMap<Integer,Integer> map,int key,int value){
        int size=map.size();
        System.out.println("Size of the HashMap before changes:"+size);
       if(map.containsKey(key)){
            if(value==map.get(key)){
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
   public static HashMap<String,Integer> replaceValue(HashMap<String,Integer> map,String key,int replaceValue){
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
    public static HashMap<String,Integer> replaceMatchedValue(HashMap<String,Integer> map,String key,int replaceValue,int matchValue){
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
  public static HashMap<String,Integer> transferKeysValues(HashMap<String,Integer> firstMap,HashMap<String,Integer> secondMap){
       secondMap.putAll(firstMap);
       System.out.println("Hashmap1 elements after changes:");
          for(Map.Entry hashMap: firstMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }
           int size=firstMap.size();
          System.out.println("Size of the HashMap1 after changes:"+size);
       return secondMap;
  }  
  public static HashMap<String,Integer> removeAllEntries(HashMap<String,Integer> map){
        int size=map.size();
        System.out.println("Size of the HashMap before changes:"+size);
        map.clear(); 
        return map;
   }      
 }
