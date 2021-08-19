import java.util.*;
public class HashMapTaskRunner{
   public static String[] getString(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of Strings:");
     int size=sc.nextInt();
     String [] stringArray=new String[size];
      for(int i=0;i<size;i++){
            stringArray[i]=sc.next();
      }
    return stringArray;
   }
   
   public static int[] getInteger(){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no.of Strings:");
     int size=sc.nextInt();
     int [] integerArray=new int[size];
      for(int i=0;i<size;i++){
            integerArray[i]=sc.nextInt();
      }
    return integerArray;
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
          String [] keyArray=getString();
          String [] valueArray=getString();
          HashMap<String,String> stringMap=HashMapTask.findStringMapSize(keyArray,valueArray);
          System.out.println("Hashmap elements:");
          for(Map.Entry str : stringMap.entrySet()){    
            System.out.println(str.getKey()+" "+str.getValue());    
          }    
          int mapSize1=stringMap.size();
          System.out.println("Size of the String Hashmap:"+mapSize1);
          break;
      case 3:
          int [] keyIntArray=getInteger();
          int [] valueIntArray=getInteger();
          HashMap<Integer,Integer> integerMap=HashMapTask.findIntegerMapSize(keyIntArray,valueIntArray);
          System.out.println("Hashmap elements:");
          for(Map.Entry intMap : integerMap.entrySet()){    
           System.out.println(intMap.getKey()+" "+intMap.getValue());    
          }   
          int mapSize2=integerMap.size();
          System.out.println("Size of the Integer Hashmap:"+mapSize2);
          break;
      case 4:
          String [] keyStrIntArray=getString();
          int [] valueStrIntArray=getInteger();
          HashMap<String,Integer> strIntMap=HashMapTask.findStringIntegerMapSize(keyStrIntArray,valueStrIntArray);
          int mapSize=strIntMap.size();
           System.out.println("Hashmap elements:");
           for(Map.Entry map: strIntMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           }  
          System.out.println("Size of the String Integer Hashmap:"+mapSize);
          break;
     case 6:
          String [] keyStrArray=getString();
          String [] valueStrArray=getString();
          HashMap<String,String> strMap=HashMapTask.findStringMapSize(keyStrArray,valueStrArray);
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
           int [] keyIntArr=getInteger();
           int [] valueIntArr=getInteger();
           HashMap<Integer,Integer> nullMap=HashMapTask.addNull(keyIntArr,valueIntArr);
           System.out.println("HashMap elements:"+nullMap);
           int nullMapSize=nullMap.size();
           System.out.println("HashMap size:"+nullMapSize);
           break;
     case 8:
           String [] keyStrArr=getString();
           String [] valueStrArr=getString();
           System.out.println("Enter the key to be checked:");
           String key=sc.next();
           boolean value=HashMapTask.checkKey(keyStrArr,valueStrArr,key);
           System.out.println("Given key is present in the hashmap:"+value);
           break;
     case 9:
           //HashMap<String,String> stringHashMap=createStringHashMap();
            String [] keyStArray=getString();
            String [] valueStArray=getString();
           System.out.println("Enter the value to be checked:");
           String strValue=sc.next();
           boolean booleanValue=HashMapTask.checkValue(keyStArray,valueStArray,strValue);
           System.out.println("Given value is present in the hashmap:"+booleanValue);
           break;
     case 10:
          String [] keyStArr=getString();
          String [] valueStArr=getString();
          HashMap<String,String> changedHash=HashMapTask.changeValues(keyStArr,valueStArr);
          System.out.println("Hashmap elements:");
           for(Map.Entry mapChange: changedHash.entrySet()){    
                System.out.println(mapChange.getKey()+" "+mapChange.getValue());    
           } 
           break;
     case 11:
          String [] keyStrIntArr=getString();
          int [] valueStrIntArr=getInteger();
         System.out.println("Enter the key for which you want the value:");
         String existingKey=sc.next();
         int valueForKey=HashMapTask.getValue(keyStrIntArr,valueStrIntArr,existingKey);
         System.out.println("Value for the given key is:"+valueForKey);
         break;
    case 12:
           String [] keyStIntArray=getString();
          int [] valueStIntArray=getInteger();
         System.out.println("Enter the non existing key for which you want the value:");
         String nonExistingKey=sc.next();
         int valueKey=HashMapTask.getValue(keyStIntArray,valueStIntArray,nonExistingKey);
         System.out.println("Value for the given key is:"+valueKey);
         break;
     case 13:
          String [] keyArr=getString();
          String [] valueArr=getString();
         System.out.println("Enter the non existing key for which you want the value:");
         String nonExistKey=sc.next();
         String valueOfKey=HashMapTask.getValueForKey(keyArr,valueArr,nonExistKey);
         System.out.println("Value for the given key is:"+valueOfKey);
         break;
     case 14:
          int [] keyIntArr1=getInteger();
          int [] valueIntArr1=getInteger();
         System.out.println("Enter the key which you want to remove:");
         int removeKey=sc.nextInt();
         HashMap<Integer,Integer> changedMap=HashMapTask.removeKey(keyIntArr1,valueIntArr1,removeKey);
         System.out.println("Hashmap elements after changes:");
           for(Map.Entry map: changedMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           } 
         int changedSize=changedMap.size();
         System.out.println("Size of the HashMap after change:"+changedSize);
         break;
     case 15:
          String [] keyArr1=getString();
          String [] valueArr1=getString();
         System.out.println("Enter the key which you want to remove:");
         String removedKey=sc.next();
         System.out.println("Enter the value for which you want to check matching:");
         String matchValue=sc.next();
         HashMap<String,String> changedHashMap=HashMapTask.removeMatchedValue(keyArr1,valueArr1,removedKey,matchValue);
         System.out.println("Hashmap elements after changes:");
           for(Map.Entry map: changedHashMap.entrySet()){    
                System.out.println(map.getKey()+" "+map.getValue());    
           }  
         int changedHashSize=changedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+changedHashSize);
         break;
     case 16:
           String [] keySIArray=getString();
          int [] valueSIArray=getInteger();
        System.out.println("Enter the key which you want to replace:");
         String replaceKey=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue=sc.nextInt();
         HashMap<String,Integer> replacedHashMap=HashMapTask.replaceValue(keySIArray,valueSIArray,replaceKey,replaceValue);
         System.out.println("Hashmap elements after changes:");
          for(Map.Entry hashMap: replacedHashMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }  
         int replacedHashSize=replacedHashMap.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize);
         break;
      case 17:
           String [] keySIArr=getString();
          int [] valueSIArr=getInteger();
        System.out.println("Enter the key which you want to replace:");
         String replaceKey1=sc.next();
         System.out.println("Enter the value to be replaced:");
         int replaceValue1=sc.nextInt();
         System.out.println("Enter the value for which you want to check matching:");
         int matchValue1=sc.nextInt();
         HashMap<String,Integer> replacedHashMap1=HashMapTask.replaceMatchedValue(keySIArr,valueSIArr,replaceKey1,replaceValue1,matchValue1);
         System.out.println("Hashmap elements after changes:");
          for(Map.Entry hashMap: replacedHashMap1.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }  
         int replacedHashSize1=replacedHashMap1.size();
         System.out.println("Size of the HashMap after changes:"+replacedHashSize1);
         break;
     case 18:
          String [] keySIArr1=getString();
          int [] valueSIArr1=getInteger();
          String [] keySIArr2=getString();
          int [] valueSIArr2=getInteger();
          System.out.println("Hashmap1 elements before changes:");
          HashMap<String,Integer> transferedHashMap=HashMapTask.transferKeysValues(keySIArr1,valueSIArr1,keySIArr2,valueSIArr2);
          System.out.println("Hashmap2 elements after transfers:");
          for(Map.Entry hashMap: transferedHashMap.entrySet()){    
                System.out.println(hashMap.getKey()+" "+hashMap.getValue());    
           }
           int transferedHashSize=transferedHashMap.size();
          System.out.println("Size of the HashMap2 after changes:"+transferedHashSize);
           break;
      case 19:
          String [] keySIntArr=getString();
          int [] valueSIntArr=getInteger();
          HashMap<String,Integer> map=HashMapTask.iterateHashMap(keySIntArr,valueSIntArr);
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
           String [] keySIntArr1=getString();
          int [] valueSIntArr1=getInteger();
          HashMap<String,Integer> clearedHashMap=HashMapTask.removeAllEntries(keySIntArr1,valueSIntArr1);
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












