
import java.util.*;
public class HashMapTaskRunner{
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
          HashMap<String,String> stringMap=HashMapTask.findStringMapSize();
          System.out.println("Hashmap elements:");
          for(Map.Entry str : stringMap.entrySet()){    
            System.out.println(str.getKey()+" "+str.getValue());    
          }    
          int mapSize1=stringMap.size();
          System.out.println("Size of the String Hashmap:"+mapSize1);
          break;
      case 3:
          HashMap<Integer,Integer> integerMap=HashMapTask.findIntegerMapSize();
         System.out.println("Hashmap elements:");
          for(Map.Entry intMap : integerMap.entrySet()){    
           System.out.println(intMap.getKey()+" "+intMap.getValue());    
          }   
          int mapSize2=integerMap.size();
          System.out.println("Size of the Integer Hashmap:"+mapSize2);
          break;
      case 4:
          HashMap<String,Integer> strIntMap=HashMapTask.createStringIntegerHashMap();
          int mapSize=strIntMap.size();
           System.out.println("Hashmap elements:");
           for(Map.Entry map: strIntMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           }  
          System.out.println("Size of the String Integer Hashmap:"+mapSize);
          break;
     case 6:
          HashMap<String,String> strMap=HashMapTask.findStringMapSize();
          System.out.println("Hashmap elements:");
         for(Map.Entry str : strMap.entrySet()){    
            System.out.println(str.getKey()+" "+str.getValue());    
          }    
          int strMapSize=strMap.size();
          System.out.println("Size of the String Hashmap:"+strMapSize);
          break;
     case 7:
         /*System.out.println("Enter the non null value:");
           int nonNullValue=sc.nextInt();*/
           HashMap<Integer,Integer> nullMap=HashMapTask.addNull();
           System.out.println("HashMap elements:"+nullMap);
           int nullMapSize=nullMap.size();
           System.out.println("HashMap size:"+nullMapSize);
           break;
     case 8:
           //HashMap<String,String> strMap=createStringHashMap();
           System.out.println("Enter the key to be checked:");
           String key=sc.next();
           boolean value=HashMapTask.checkKey(key);
           System.out.println("Given key is present in the hashmap:"+value);
           break;
     case 9:
           //HashMap<String,String> stringHashMap=createStringHashMap();
           System.out.println("Enter the value to be checked:");
           String strValue=sc.next();
           boolean booleanValue=HashMapTask.checkValue(strValue);
           System.out.println("Given value is present in the hashmap:"+booleanValue);
           break;
     case 10:
         // HashMap<String,String> stringHash=createStringHashMap();
          HashMap<String,String> changedHash=HashMapTask.changeValues();
          System.out.println("Hashmap elements:");
           for(Map.Entry mapChange: changedHash.entrySet()){    
                System.out.println(mapChange.getKey()+" "+mapChange.getValue());    
           } 
           break;
     case 11:
         //HashMap<String,Integer> strIntegerHash=createStringIntegerHashMap();
         System.out.println("Enter the key for which you want the value:");
         String existingKey=sc.next();
         int valueForKey=HashMapTask.getValue(existingKey);
         System.out.println("Value for the given key is:"+valueForKey);
         break;
    case 12:
        // HashMap<String,Integer> strIntegerHashMap=createStringIntegerHashMap();
         System.out.println("Enter the non existing key for which you want the value:");
         String nonExistingKey=sc.next();
         int valueKey=HashMapTask.getValue(nonExistingKey);
         System.out.println("Value for the given key is:"+valueKey);
         break;
     case 13:
        // HashMap<String,String> strHashMap=createStringHashMap();
         System.out.println("Enter the non existing key for which you want the value:");
         String nonExistKey=sc.next();
         String valueOfKey=HashMapTask.getValueForKey(nonExistKey);
         System.out.println("Value for the given key is:"+valueOfKey);
         break;
     case 14:
        // HashMap<Integer,Integer> intHashMap=createIntegerHashMap();
         System.out.println("Enter the key which you want to remove:");
         int removeKey=sc.nextInt();
        /* System.out.println("Hashmap elements before changes:");
           for(Map.Entry map: intHashMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           } */
         HashMap<Integer,Integer> changedMap=HashMapTask.removeKey(removeKey);
         System.out.println("Hashmap elements after changes:");
           for(Map.Entry map: changedMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           } 
         int changedSize=changedMap.size();
         System.out.println("Size of the HashMap after change:"+changedSize);
         break;
     case 15:
       //  HashMap<String,String> integerHashMap=createStringHashMap();
         System.out.println("Enter the key which you want to remove:");
         String removedKey=sc.next();
         System.out.println("Enter the value for which you want to check matching:");
         String matchValue=sc.next();
        /*  System.out.println("Hashmap elements before changes:");
           for(Map.Entry map: integerHashMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           } */
         HashMap<String,String> changedHashMap=HashMapTask.removeMatchedValue(removedKey,matchValue);
         System.out.println("Hashmap elements after changes:");
           for(Map.Entry map: changedHashMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           }  
         int changedHashSize=changedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+changedHashSize);
         break;
     case 16:
       // HashMap<String,Integer> strIntHash=createStringIntegerHashMap();
        System.out.println("Enter the key which you want to replace:");
         String replaceKey=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue=sc.nextInt();
        /* System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: strIntHash.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }*/
         HashMap<String,Integer> replacedHashMap=HashMapTask.replaceValue(replaceKey,replaceValue);
         System.out.println("Hashmap elements after changes:");
          for(Map.Entry hashMap: replacedHashMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }  
         int replacedHashSize=replacedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize);
         break;
      case 17:
      //  HashMap<String,Integer> strIntHash1=createStringIntegerHashMap();
        System.out.println("Enter the key which you want to replace:");
         String replaceKey1=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue1=sc.nextInt();
         System.out.println("Enter the value for which you want to check matching:");
         int matchValue1=sc.nextInt();
       /*  System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: strIntHash1.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }*/
         HashMap<String,Integer> replacedHashMap1=HashMapTask.replaceMatchedValue(replaceKey1,replaceValue1,matchValue1);
         System.out.println("Hashmap elements after changes:");
          for(Map.Entry hashMap: replacedHashMap1.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }  
         int replacedHashSize1=replacedHashMap1.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize1);
         break;
     case 18:
          //HashMap<String,Integer> strIntHashMap1=createStringIntegerHashMap();
         // HashMap<String,Integer> strIntHashMap2=createStringIntegerHashMap();
          System.out.println("Hashmap1 elements before changes:");
          HashMap<String,Integer> transferedHashMap=HashMapTask.transferKeysValues();
          System.out.println("Hashmap2 elements after transfers:");
          for(Map.Entry hashMap: transferedHashMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }
           int transferedHashSize=transferedHashMap.size();
          System.out.println("Size of the HashMap2 after changes:"+transferedHashSize);
           break;
      case 19:
          HashMap<String,Integer> map=HashMapTask.iterateHashMap();
          System.out.println("Hashmap elements:");
          for(Map.Entry hashMap1: map.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
          }
         break;
      case 20:
        //  HashMap<String,Integer> strIntHashMap=createStringIntegerHashMap();
         /* System.out.println("Hashmap elements before changes:");
          for(Map.Entry hashMap1: strIntHashMap.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }
          int beforeSize=strIntHashMap.size();
          System.out.println("Size of the HashMap1 before changes:"+beforeSize);*/
          HashMap<String,Integer> clearedHashMap=HashMapTask.removeAllEntries();
          System.out.println("Hashmap elements after changes:"+clearedHashMap);
         /* for(Map.Entry hashMap1: clearedHashMap.entrySet()){    
                System.out.println(hashMap1.getKey()+" "+hashMap1.getValue());    
           }*/
           int afterSize=clearedHashMap.size();
          System.out.println("Size of the HashMap after changes:"+afterSize);
          break;
     default:
         System.out.println("No program");
         break;
     }
  }
 }
