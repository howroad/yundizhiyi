package com.howroad.yundizhiyi.option;

import static com.howroad.yundizhiyi.option.Career.*;
import static com.howroad.yundizhiyi.option.Origin.*;

/**
 * <p>Title: Hero.java</p>
 *
 * <p>Description: 英雄</p>
 *
 * <p>Company: 北京九恒星科技股份有限公司</p>
 *
 * @author luhao
 * 
 * @since：2019年7月12日 下午1:31:14
 * 
 */
public enum Hero{
    BING_NIAO(JI_DI,null,YUAN_SU_SHI,null,5),
    SI_GE(AN_YING,null,FA_SHI,null,5),
    TIAN_SHI(GUI_ZU,null,QI_SHI,null,5),
    NV_QIANG(HAI_DAO,null,QIANG_SHOU,null,5),
    WU_YA(DI_GUO,E_MO,null,HUAN_XING_SHI,5),
    YA_SUO(Origin.LANG_REN,null,JIAN_SHI,null,5),
    
    A_KA_LI(REN_ZHE,null,CI_KE,null,4),
    LONG_WANG(LONG,null,FA_SHI,null,4),
    HUO_NAN(E_MO,null,YUAN_SU_SHI,null,4),
    DA_CHONG_ZI(XU_KONG,null,DOU_SHI,null,4),
    DE_LAI_WEN(DI_GUO,null,JIAN_SHI,null,4),
    NA_ER(KUANG_YE,YUE_DE_ER_REN,HUAN_XING_SHI,null,4),
    QIAN_JUE(AN_YING,null,YOU_XIA,null,4),
    RI_NV(GUI_ZU,null,WEI_SHI,null,4),
    ZHU_MEI(JI_DI,null,QI_SHI,null,4),
    
    JIAN_MO(E_MO,null,JIAN_SHI,null,3),
    HAN_BING(JI_DI,null,YOU_XIA,null,3),
    GUA_FU(E_MO,null,CI_KE,null,3),
    CHUAN_ZHANG(HAI_DAO,null,QIANG_SHOU,JIAN_SHI,3),
    KA_KE(DI_GUO,null,CI_KE,null,3),
    KAI_NAN(REN_ZHE,YUE_DE_ER_REN,YUAN_SU_SHI,null,3),
    MO_GAN_NA(E_MO,null,FA_SHI,null,3),
    BO_BI(YUE_DE_ER_REN,null,QI_SHI,null,3),
    SHI_ZI_GOU(KUANG_YE,null,CI_KE,null,3),
    LONG_NV(LONG,null,HUAN_XING_SHI,null,3),
    XIAO_FA(YUE_DE_ER_REN,null,FA_SHI,null,3),
    GOU_XIONG(JI_DI,null,DOU_SHI,null,3),
    
    
    HU_LI(KUANG_YE,null,FA_SHI,null,2),
    JI_QI_REN(Origin.JI_QI_REN,null,DOU_SHI,null,2),
    BU_LONG(JI_DI,null,WEI_SHI,null,2),
    ZHI_ZHU(E_MO,null,HUAN_XING_SHI,null,2),
    BING_NV(JI_DI,null,YUAN_SU_SHI,null,2),
    AO_BA_MA(GUI_ZU,null,QIANG_SHOU,null,2),
    LU_LU(YUE_DE_ER_REN,null,FA_SHI,null,2),
    SHUI_GUI(HAI_DAO,null,CI_KE,null,2),
    LEI_KE_SAI(XU_KONG,null,DOU_SHI,null,2),
    SHEN(REN_ZHE,null,JIAN_SHI,null,2),
    WEI_LU_SI(E_MO,null,YOU_XIA,null,2),
    JIE(REN_ZHE,null,CI_KE,null,2),
    /*KA_PAI(),*/
    
    NUO_SHOU(DI_GUO,null,QI_SHI,null,1),
    JIAN_JI(GUI_ZU,null,JIAN_SHI,null,1),
    DE_MA(GUI_ZU,null,QI_SHI,null,1),
    NAN_QIANG(HAI_DAO,null,QIANG_SHOU,null,1),
    KA_SA_DING(XU_KONG,null,FA_SHI,null,1),
    TANG_LANG(XU_KONG,null,CI_KE,null,1),
    TIE_NAN(AN_YING,null,QI_SHI,null,1),
    BAO_NV(KUANG_YE,null,HUAN_XING_SHI,null,1),
    XIAO_PAO(YUE_DE_ER_REN,null,QIANG_SHOU,null,1),
    V_N(GUI_ZU,null,YOU_XIA,null,1),
    LANG_REN(KUANG_YE,null,DOU_SHI,null,1);
    
    public boolean has(Origin origin) {
        return this.origin == origin || this.origin2 == origin;
    }
    public boolean has(Career career) {
        return this.career == career || this.career2 == career;
    }
    
    private Hero() {
    }
    
    private Hero(Origin origin, Origin origin2, Career career, Career career2, int glod) {
        this.origin = origin;
        this.origin2 = origin2;
        this.career = career;
        this.career2 = career2;
        this.glod = glod;
    }

    private String name;
    private String desc;
    private Origin origin;
    private Origin origin2;
    private Career career;
    private Career career2;
    private int glod;
    public Career getCareer() {
        return career;
    }
    public void setCareer(Career career) {
        this.career = career;
    }
    public Origin getOrigin() {
        return origin;
    }
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }
    public int getGlod() {
        return glod;
    }
    public void setGlod(int glod) {
        this.glod = glod;
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
    public Career getCareer2() {
        return career2;
    }
    public void setCareer2(Career career2) {
        this.career2 = career2;
    }

    public Origin getOrigin2() {
        return origin2;
    }

    public void setOrigin2(Origin origin2) {
        this.origin2 = origin2;
    }
    
}
