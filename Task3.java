import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>(createUsers());
        Map<Integer,ArrayList<User>> map = processUsers(list);
        printMap(map);
    }


    public static ArrayList<User> createUsers(){
        ArrayList<User> list  = new ArrayList<>();
        String[] names = {"Sarah","John","Eva","Andrey","Anhton","Alexander","Dmitrii","Konstantin"};
        String[] surnames = {"Braun","Black","Green","Sidorov","Ivanov","Smirnov","Krylov","Kim"};
        int[] ages = {24,13,24,25,37,58,59,37};
        for(int i = 0;i< ages.length;i++){
            list.add(new User(surnames[i],names[i],ages[i]));
        }
        return list;
    }
    public static Map<Integer, ArrayList<User>> processUsers(ArrayList<User> list){
        Map<Integer,ArrayList<User>> map = new HashMap<>();
        for (User n:list){
            ArrayList<User> listUsers = new ArrayList<>();
            int c = 0;
            int q = 0;
            for(User t:list){
                if(n.getAge()==t.getAge()){
                    c=t.getAge();
                    q++;
                    listUsers.add(t);
                }
            }
            if(!map.containsKey(c)&&q>1){
                map.put(c,listUsers);
            }
        }
        return map;
    }

    public static void printMap(Map<Integer,ArrayList<User>> map){
        for(Map.Entry<Integer,ArrayList<User>> pair:map.entrySet()){
            System.out.println("Age:"+pair.getKey());
            System.out.print("People:"+pair.getValue());
            System.out.println("");
        }
    }
}


class User{
        private String name;
        private String surname;
        private int age;

        public User(String name,String surname,int age){
            this.setName(name);
            this.setSurname(surname);
            this.setAge(age);
        }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    @Override
    public String toString(){
        return (getSurname().toString()+" "+getName().toString());
    }
    }

