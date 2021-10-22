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


