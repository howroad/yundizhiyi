package com.howroad.yundizhiyi.option;

import java.util.Set;

/**
 * <p>Title: OrginEnum.java</p>
 *
 * <p>Description: 出身、种族</p>
 *
 * <p>Company: 北京九恒星科技股份有限公司</p>
 *
 * @author luhao
 * 
 * @since：2019年7月12日 下午1:42:37
 * 
 */
public enum Origin {
    AN_YING(0,0,2,0,0,60),
    JI_DI(2,4,6,25,35,45),
    GUI_ZU(0,3,6,0,20,90),
    HAI_DAO(0,0,3,0,0,50),
    DI_GUO(0,2,4,0,30,60),
    LANG_REN(0,0,1,0,0,30),
    E_MO(0,2,4,0,30,50),
    REN_ZHE(0,1,4,0,10,50),
    LONG(0,0,2,0,0,60),
    XU_KONG(0,0,3,0,0,70),
    KUANG_YE(0,2,4,0,20,80),
    YUE_DE_ER_REN(0,3,6,0,20,60),
    JI_QI_REN(0,0,1,0,0,30);
    
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
    
    private Origin(int needNum1, int needNum2, int needNum3, int score1, int score2, int score3) {
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
