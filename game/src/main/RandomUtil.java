package main;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class RandomUtil{
    public  static Map<String,RollTime> times=new ConcurrentHashMap<>();
    public static List<Integer> getRandom(int n,String userId){
        List<Integer> res=new ArrayList<>();
        RollTime rollTime=times.getOrDefault(userId,new RollTime());
        if(rollTime.getRoll()>=13){
            return res;
        }else{
            rollTime.setTurn(rollTime.getTurn()+1);
            times.put(userId,rollTime);
        }

        while (n>0){
            Random random=new Random();
            res.add(random.nextInt(6)+1);
            n--;
        }
        return res;
    }

}
