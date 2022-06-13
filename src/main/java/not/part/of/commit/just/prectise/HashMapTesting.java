package not.part.of.commit.just.prectise;

import java.util.HashMap;
import java.util.Map;

class User{
    String name;
    int age;
    double salary;
}

public class HashMapTesting {
    public static void main(String[] args) {
        Map<User ,String> map = new HashMap<>();
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        map.put(user1,null);
        map.put(user2,null);
        map.put(user3,null);
        System.out.println(map.size());
         user1 =null;
         user2 = null;
         user3 = null;
        map.put(user1,"null1");
        map.put(user2,"null2");
        map.put(user3,"null3");
        System.out.println(map.size());
    }

}
