package com.howroad.yundizhiyi.cal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.howroad.yundizhiyi.option.Career;
import com.howroad.yundizhiyi.option.Hero;
import com.howroad.yundizhiyi.option.Origin;

/**
 * <p>Title: CaiUtil.java</p>
 *
 * <p>Description: </p>
 *
 * <p>Company: 北京九恒星科技股份有限公司</p>
 *
 * @author luhao
 * 
 * @since：2019年7月12日 下午3:29:06
 * 
 */
public class CaiUtil {
    
    public static void main(String[] args) {
        List<Set<Hero>> choose = new ArrayList<Set<Hero>>(1000000);
        List<Hero> pool = Arrays.asList(Hero.values());

        long beforeMemory = Runtime.getRuntime().totalMemory();
        List<Set<Hero>> result = chooseOne(choose, pool, 3);
        long afterMemory = Runtime.getRuntime().totalMemory();
        System.out.println("Memory used:" + (beforeMemory - afterMemory));
        System.out.println(result.size());
        //List<Set<Hero>> result1 = result.subList(0, 10000);
        //getScore(result);
        
    }
    
    public static List<Set<Hero>> chooseOne(List<Set<Hero>> choose,List<Hero> pool,int num){
        int now = choose.size();
        if (now <= 0 || choose.get(0).size() < num) {
            List<Set<Hero>> chooseOne0 = chooseOne0(choose, pool);
            return chooseOne(chooseOne0, pool, num);
        } else {
            return choose;
        }
        
    }
    public static List<Set<Hero>> chooseOne0(List<Set<Hero>> choose,List<Hero> pool){
        List<Set<Hero>> result = new ArrayList<Set<Hero>>();
        if(choose.isEmpty()) {
            for(int j = 0 ; j < pool.size() ; j++) {
                Set<Hero> newSet = new HashSet<Hero>();
                Hero hero = pool.get(j);
                if(newSet.add(hero)) {
                    result.add(newSet);
                }
            }
        }else {
            for(int i = 0 ; i < choose.size() ; i++) {
                Set<Hero> set = choose.get(i);
                for(int j = 0 ; j < pool.size() ; j++) {
                    Set<Hero> newSet = copySet(set);
                    Hero hero = pool.get(j);
                    if(newSet.add(hero)) {
                        result.add(newSet);
                    }
                }
            }
        }
        return result;
        
    }
    
    public static Set<Hero> copySet(Set<Hero> set){
        Set<Hero> result = new HashSet<Hero>();
        for (Hero hero : set) {
            result.add(hero);
        }
        return result;
    }
    
    public static void getScore(List<Set<Hero>> list) {
        List<Set<Hero>> max = new ArrayList<Set<Hero>>();
        int maxScore = 0;
        for (Set<Hero> set : list) {
            int score = 0;
            Origin[] origins = Origin.values();
            Career[] careers = Career.values();
            for (Origin origin : origins) {
                score += origin.getScore(set);
            }
            for (Career career : careers) {
                score += career.getScore(set);
            }
            if(maxScore < score) {
                maxScore = score;
                max.clear();
                max.add(set);
            }else if(maxScore == score) {
                max.add(set);
            }
        }
        System.out.println(maxScore);
        System.out.println(max);
    }
    
    
}
