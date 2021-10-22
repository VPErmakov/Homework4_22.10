import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static Map<String,String> createMap(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("Ivanov1","Ivan");
        map.put("Ivanov2","Dmitrii");
        map.put("Ivanov3","Nikolay");
        map.put("Ivanov4","Ivan");
        map.put("Ivanov5","Dmitrii");
        map.put("Ivanov","Victor");
        map.put("Romanov","Ivan");
        map.put("Krylov","Artem");
        map.put("Sidorov","Konstantin");
        map.put("Smirnov","Ivan");
        return map;
    }
    public static void removeTheFirstNameDuplicates(Map<String,String> map){//Удаление всех людей с один именами
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        for(Map.Entry<String,String> pair: map2.entrySet()){
            int c = 0;
            for(Map.Entry<String,String> difpair: map2.entrySet()){
                if(pair.getValue().equals(difpair.getValue())){
                    c++;
                }
            }
            if(c>1){
                removeTheItemFromMapByValue(map,pair.getValue());
            }
        }
    }

    public static void removeTheItemFromMapByValue(Map<String,String> map,String value){
        HashMap<String, String> map1 = new HashMap<String, String>(map);
        for(Map.Entry<String,String> pair: map1.entrySet()){
            if(pair.getValue().equals(value)){
                map.remove(pair.getKey());
            }
        }
    }
    public static void printMap(Map<String,String> map){
        System.out.println(map);
    }


    public static void main(String[] args){
        Map<String,String> map = createMap();
        removeTheFirstNameDuplicates(map);
        printMap(map);

    }

}


/*   public static Map<Integer,String> createUsers(){
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(12,"Vitalii");
        map.put(13,"Semen");
        map.put(37,"Victor");
        map.put(22,"Vladimir");
        map.put(22,"Anatoliy");
        map.put(12,"Ivan");
        map.put(22,"Andrey");
        map.put(56,"Anhton");
        map.put(35,"Artem");
        map.put(21,"Konstantin");
        return map;
    }

    public static ArrayList<Integer> processUsers(Map<Integer,String> map){
        ArrayList<Integer> ages = new ArrayList<>();
        Map<Integer,String> map1 = new HashMap<Integer,String>(map);
        for(Map.Entry<Integer,String> pair : map1.entrySet()){
            int i = 0;
            for(Map.Entry<Integer,String> difpair : map1.entrySet()){
                if(difpair.getKey().equals(pair.getKey())){
                    i++;
                }
            }
            if(i>1&&!(ages.contains(pair.getKey()))){
                ages.add(pair.getKey());
            }
        }
        return ages;
    }

    public static void printUsers(Map<Integer,String> map,ArrayList<Integer> ages){
        Map<Integer,String> map2 = new HashMap<>();
        for(int n:ages){
            System.out.println(n);
            for(Map.Entry<Integer,String> pair:map2.entrySet()){
                if(pair.getKey().equals(n)){
                    System.out.println(pair.getValue());
                }
            }
        }
    }*/