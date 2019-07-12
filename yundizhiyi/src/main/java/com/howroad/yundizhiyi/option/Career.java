package com.howroad.yundizhiyi.option;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>Title: CareerEnum.java</p>
 *
 * <p>Description: 职业</p>
 *
 * <p>Company: 北京九恒星科技股份有限公司</p>
 *
 * @author luhao
 * 
 * @since：2019年7月12日 下午1:47:00
 * 
 */
public enum Career {
    YUAN_SU_SHI(0,0,3,0,0,75),
    FA_SHI(0,3,6,0,35,100),
    QI_SHI(2,4,6,20,40,80),
    QIANG_SHOU(0,2,4,0,30,80),
    HUAN_XING_SHI(0,0,3,0,0,80),
    JIAN_SHI(0,3,6,0,30,80),
    CI_KE(0,3,6,0,40,90),
    DOU_SHI(0,2,4,0,30,70),
    YOU_XIA(0,2,4,0,25,65),
    WEI_SHI(0,0,2,0,0,40);
    
    public static void main(String[] args) {
        Set<Hero> set = new HashSet<Hero>();
        set.add(Hero.BO_BI);
        set.add(Hero.DE_MA);
        set.add(Hero.TIAN_SHI);
        System.out.println(QI_SHI.getScore(set));
    }
    
    public int getScore(Set<Hero> set) {
        int num = 0;
        for (Hero hero : set) {
            if(hero.has(this)) {
                num++;
            }
        }
        if(num < this.needNum1) {
            return 0;
        }
        if(num < this.needNum2) {
            return needNum1 * score1;
        }
        if(num < this.needNum3) {
            return needNum2 * score2;
        }
        return needNum3 * score3;
    }
    
    private Career(int needNum1, int needNum2, int needNum3, int score1, int score2, int score3) {
        this.needNum1 = needNum1;
        this.needNum2 = needNum2;
        this.needNum3 = needNum3;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    private String name;
    private String desc;
    private int needNum1;
    private int needNum2;
    private int needNum3;
    private int score1;
    private int score2;
    private int score3;
    public int getScore1() {
        return score1;
    }
    public void setScore1(int score1) {
        this.score1 = score1;
    }
    public int getScore2() {
        return score2;
    }
    public void setScore2(int score2) {
        this.score2 = score2;
    }
    public int getScore3() {
        return score3;
    }
    public void setScore3(int score3) {
        this.score3 = score3;
    }
    public int getNeedNum1() {
        return needNum1;
    }
    public void setNeedNum1(int needNum1) {
        this.needNum1 = needNum1;
    }
    public int getNeedNum2() {
        return needNum2;
    }
    public void setNeedNum2(int needNum2) {
        this.needNum2 = needNum2;
    }
    public int getNeedNum3() {
        return needNum3;
    }
    public void setNeedNum3(int needNum3) {
        this.needNum3 = needNum3;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
}
