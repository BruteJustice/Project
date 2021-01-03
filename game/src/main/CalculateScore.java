package main;


import java.lang.reflect.Field;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CalculateScore {

    public  static Set<String> largeSet=new HashSet<>();
    public static Set<String> smallSet=new HashSet<>();
    public Map<String,Score> userMap=new ConcurrentHashMap<>();
    public Map<String,int[]> categorysMap=new ConcurrentHashMap<>();
    public static Map<Integer,String> typeMap=new HashMap<>();
    public boolean isYahtzee=false;
    public int yahtzeeValue=0;
    static {

        largeSet.add("12345");
        largeSet.add("23456");

        smallSet.add("1234");
        smallSet.add("2345");
        smallSet.add("3456");
        typeMap.put(0,"aces");
        typeMap.put(1,"twos");
        typeMap.put(2,"threes");
        typeMap.put(3,"fours");
        typeMap.put(4,"fives");
        typeMap.put(5,"sixes");
        typeMap.put(6,"threeOfKind");
        typeMap.put(7,"fourOfKind");
        typeMap.put(8,"fullHouse");
        typeMap.put(9,"smallStraight");
        typeMap.put(10,"largeStraight");
        typeMap.put(11,"yahtzee");
        typeMap.put(12,"chance");

    }
    public static CalculateScore getIntance=CalculateScoreInstance.instance;
    private CalculateScore(){}
    private static class  CalculateScoreInstance{
        public static CalculateScore instance=new CalculateScore();
    }
    /**
     * @param dices 骰子值
     * */
    public Score getSore(List<Integer> dices,String userId ){
        int[] count=new int[6];
        int sum=0;
        String str="";
        Set<Integer> set=new HashSet<>(dices);
        List<Integer> sort=new ArrayList<>(set);
        Collections.sort(sort);
        for(Integer dice:sort){
            str+=dice;
        }
        for(Integer dice:dices){
            count[dice-1]++;
            sum+=dice;
        }
        Score score= userMap.getOrDefault(userId,new Score());
        int[] category=categorysMap.getOrDefault(userId,new int[13]);
        if(category[0]==0){
            score.setAces(count[0]);
        }
        if(category[1]==0){
            score.setTwos(count[1]*2);}
        if(category[2]==0){
            score.setThrees(count[2]*3);
        }
        if(category[3]==0){
            score.setFours(count[3]*4);
        }
        if(category[4]==0){
            score.setFives(count[4]*5);
        }
        if(category[5]==0){
            score.setSixes(count[5]*6);
        }

        for(int i=0;i<count.length;i++){
            if(count[i]==5){
                isYahtzee=true;
                yahtzeeValue=count[i];
                score.setHasYahtzee(score.getHasYahtzee()+1);
                if(category[11]==1&&score.getYahtzee()==0){
                    if(category[8]==0){
                        score.setFullHouse(25);}
                    if(category[9]==0){
                        score.setSmallStraight(30);}
                    if(category[10]==0){
                        score.setLargeStraight(40);}
                }else{
                    if(category[8]==0){
                        score.setFullHouse(0);}
                    if(category[9]==0){
                        score.setSmallStraight(0);}
                    if(category[10]==0){
                        score.setLargeStraight(0);}
                    if(category[11]==0){
                        score.setYahtzee(50);}
                }
                if(category[6]==0){
                score.setThreeOfKind(sum);}
                if(category[7]==0){
                score.setFourOfKind(sum);}
                if(category[12]==0){
                score.setChance(sum);}
                break;
            }else if(count[i]==4){
                isYahtzee=false;
                if(category[6]==0){
                score.setThreeOfKind(sum);}
                if(category[7]==0){
                score.setFourOfKind(sum);}
                if(category[8]==0){
                score.setFullHouse(0);}
                if(category[9]==0){
                score.setSmallStraight(0);}
                if(category[10]==0){
                score.setLargeStraight(0);}
                if(category[11]==0){
                score.setYahtzee(0);}
                if(category[12]==0){
                score.setChance(sum);}
                break;

        }else if(count[i]==3){
                isYahtzee=false;
                if(category[6]==0){
                score.setThreeOfKind(sum);}
                if(category[7]==0){
                score.setFourOfKind(0);}
                if(category[8]==0){
                for(int j=0;j<count.length;j++){
                    if(count[j]==2){
                        score.setFullHouse(25);
                        break;
                    }else{
                        score.setFullHouse(0);
                    }
                }}
                if(category[9]==0){
                score.setSmallStraight(0);}
                if(category[10]==0){
                score.setLargeStraight(0);}
                if(category[11]==0){
                score.setYahtzee(0);}
                if(category[12]==0){
                score.setChance(sum);}
                break;
            }else{
                isYahtzee=false;
                if(largeSet.contains(str)){
                    if(category[6]==0){
                    score.setThreeOfKind(0);}
                    if(category[7]==0){
                    score.setFourOfKind(0);}
                    if(category[8]==0){
                    score.setFullHouse(0);}
                    if(category[9]==0){
                    score.setSmallStraight(30);}
                    if(category[10]==0){
                    score.setLargeStraight(40);}
                    if(category[11]==0){
                    score.setYahtzee(0);}
                    if(category[12]==0){
                        score.setChance(sum);}
                }else if(smallSet.contains(str)||smallSet.contains(str)||
                        ((str.length()==5)&&smallSet.contains(str.substring(0,4)))||(str.length()==5)&&smallSet.contains(str.substring(1,5))){
                    if(category[6]==0){
                    score.setThreeOfKind(0);}
                    if(category[7]==0){
                    score.setFourOfKind(0);}
                    if(category[8]==0){
                    score.setFullHouse(0);}
                    if(category[9]==0){
                    score.setSmallStraight(30);}
                    if(category[10]==0){
                    score.setLargeStraight(0);}
                    if(category[11]==0){
                    score.setYahtzee(0);}
                    if(category[12]==0){
                        score.setChance(sum);}
                }else{
                    if(category[6]==0){
                    score.setThreeOfKind(0);}
                    if(category[7]==0){
                    score.setFourOfKind(0);}
                    if(category[8]==0){
                    score.setFullHouse(0);}
                    if(category[9]==0){
                    score.setSmallStraight(0);}
                    if(category[10]==0){
                    score.setLargeStraight(0);}
                    if(category[11]==0){
                    score.setYahtzee(0);}
                    if(category[12]==0){
                        score.setChance(sum);}
                }
            }
        }
        return score;

    }

    public String selectCategory(int type, int value, String userId){
        int[] category=categorysMap.getOrDefault(userId,new int[13]);
        Score score=userMap.getOrDefault(userId,new Score());
        if(category[type]==1){
            return "this type is selected";
        }else{
            if(category[11]==1&&score.getYahtzee()==0&&isYahtzee){
                if(type>5){
                 if(category[0]==0&&yahtzeeValue==1){
                        return "must select upper！";
                    }else if(category[1]==0&&yahtzeeValue==2){
                        return "must select upper！";
                    }else if(category[2]==0&&yahtzeeValue==3){
                        return "must select upper！";
                    }else if(category[3]==0&&yahtzeeValue==4){
                        return "must select upper！";
                    }else if(category[4]==0&&yahtzeeValue==5){
                        return "must select upper！";
                    }else if(category[5]==0&&yahtzeeValue==6){
                        return "must select upper！";
                    }
                }
            }
            if(category[11]==1&&score.getYahtzee()==50&&isYahtzee){
                score.setLowerBonus(100);
            }
            category[type]=1;
            try {
                Field field=score.getClass().getDeclaredField(typeMap.get(type));
                field.setAccessible(true);
                field.set(score,value);
                System.out.println(score.getThrees());
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        userMap.put(userId,score);
        categorysMap.put(userId,category);
        return "success";
    }
    public Score getTotal(String userId){
        return userMap.get(userId);
    }



    public static void main(String[] args) {
        String str="12345";
        System.out.println(str.substring(0,4));
        System.out.println(str.substring(1,5));
        List<Integer> list=new ArrayList<>();
        list.add(6);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        CalculateScore characte=CalculateScoreInstance.instance;
        Score score= characte.getSore(list,"test");
        System.out.println(score);



    }
}
