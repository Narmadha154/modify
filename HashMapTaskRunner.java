
import java.util.*;
public class HashMapTaskRunner{
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
/*   public static HashMap<String,Object> createStringObjectHashMap(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of key value pairs:");
     int num=sc.nextInt();
     HashMap<String,Object> stringObjectMap=new HashMap<>();
     for(int i=0;i<num;i++){
        System.out.println("Enter the key:");
        String strKey=sc.next();
        System.out.println("Enter the value:");
        int integerValue=sc.nextInt();
        stringIntegerMap.put(strKey,integerValue);
     }
     return stringIntegerMap;
    }*/
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
          System.out.println("Size of the String Integer Hashmap:"+mapSize);
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
     case 11:
         HashMap<String,Integer> strIntegerHash=createStringIntegerHashMap();
         System.out.println("Enter the key for which you want the value:");
         String existingKey=sc.next();
         int valueForKey=HashMapTask.getValue(strIntegerHash,existingKey);
         System.out.println("Value for the given key is:"+valueForKey);
         break;
    case 12:
         HashMap<String,Integer> strIntegerHashMap=createStringIntegerHashMap();
         System.out.println("Enter the non existing key for which you want the value:");
         String nonExistingKey=sc.next();
         int valueKey=HashMapTask.getValue(strIntegerHashMap,nonExistingKey);
         System.out.println("Value for the given key is:"+valueKey);
         break;
     case 13:
         HashMap<String,String> strHashMap=createStringHashMap();
         System.out.println("Enter the non existing key for which you want the value:");
         String nonExistKey=sc.next();
         String valueOfKey=HashMapTask.getValueForKey(strHashMap,nonExistKey);
         System.out.println("Value for the given key is:"+valueOfKey);
         break;
     case 14:
         HashMap<Integer,Integer> intHashMap=createIntegerHashMap();
         System.out.println("Enter the key which you want to remove:");
         int removeKey=sc.nextInt();
         System.out.println("Hashmap elements before changes:");
           for(Map.Entry map: intHashMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           } 
         HashMap<Integer,Integer> changedMap=HashMapTask.removeKey(intHashMap,removeKey);
         System.out.println("Hashmap elements after changes:");
           for(Map.Entry map: changedMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           } 
         int changedSize=changedMap.size();
         System.out.println("Size of the HashMap after change:"+changedSize);
         break;
     case 15:
         HashMap<Integer,Integer> integerHashMap=createIntegerHashMap();
         System.out.println("Enter the key which you want to remove:");
         int removedKey=sc.nextInt();
         System.out.println("Enter the value for which you want to check matching:");
         int matchValue=sc.nextInt();
          System.out.println("Hashmap elements before changes:");
           for(Map.Entry map: integerHashMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           } 
         HashMap<Integer,Integer> changedHashMap=HashMapTask.removeMatchedValue(integerHashMap,removedKey,matchValue);
         System.out.println("Hashmap elements after changes:");
           for(Map.Entry map: changedHashMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           }  
         int changedHashSize=changedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+changedHashSize);
         break;
     case 16:
        HashMap<String,Integer> strIntHash=createStringIntegerHashMap();
        System.out.println("Enter the key which you want to replace:");
         String replaceKey=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue=sc.nextInt();
         System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: strIntHash.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
         HashMap<String,Integer> replacedHashMap=HashMapTask.replaceValue(strIntHash,replaceKey,replaceValue);
         System.out.println("Hashmap elements after changes:");
          for(Map.Entry hashMap: replacedHashMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }  
         int replacedHashSize=replacedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize);
         break;
      case 17:
        HashMap<String,Integer> strIntHash1=createStringIntegerHashMap();
        System.out.println("Enter the key which you want to replace:");
         String replaceKey1=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue1=sc.nextInt();
         System.out.println("Enter the value for which you want to check matching:");
         int matchValue1=sc.nextInt();
         System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: strIntHash1.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
         HashMap<String,Integer> replacedHashMap1=HashMapTask.replaceMatchedValue(strIntHash1,replaceKey1,replaceValue1,matchValue1);
         System.out.println("Hashmap elements after changes:");
          for(Map.Entry hashMap: replacedHashMap1.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }  
         int replacedHashSize1=replacedHashMap1.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize1);
         break;
     case 18:
          HashMap<String,Integer> strIntHashMap1=createStringIntegerHashMap();
          HashMap<String,Integer> strIntHashMap2=createStringIntegerHashMap();
          System.out.println("Hashmap1 elements before changes:");
          for(Map.Entry hashMap1: strIntHashMap1.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
           int size1=strIntHashMap1.size();
          System.out.println("Size of the HashMap1 before changes:"+size1);
           System.out.println("Hashmap2 elements before changes:");
          for(Map.Entry hashMap1: strIntHashMap2.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
           int size2=strIntHashMap2.size();
          System.out.println("Size of the HashMap2 before changes:"+size2);
          HashMap<String,Integer> transferedHashMap=HashMapTask.transferKeysValues(strIntHashMap1,strIntHashMap2);
          System.out.println("Hashmap2 elements after transfers:");
          for(Map.Entry hashMap: transferedHashMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }
           int transferedHashSize=transferedHashMap.size();
          System.out.println("Size of the HashMap2 after changes:"+transferedHashSize);
           break;
      case 19:
           break;
      case 20:
          HashMap<String,Integer> strIntHashMap=createStringIntegerHashMap();
          System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: strIntHashMap.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
         /*  int beforeSize=strIntHashMap.size();
          System.out.println("Size of the HashMap1 before changes:"+beforeSize);*/
          HashMap<String,Integer> clearedHashMap=HashMapTask.removeAllEntries(strIntHashMap);
          System.out.println("Hashmap elements after changes:");
          for(Map.Entry hashMap1: clearedHashMap.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
           int afterSize=clearedHashMap.size();
          System.out.println("Size of the HashMap after changes:"+afterSize);
          break;
     default:
         System.out.println("No program");
         break;
     }
  }
 }
