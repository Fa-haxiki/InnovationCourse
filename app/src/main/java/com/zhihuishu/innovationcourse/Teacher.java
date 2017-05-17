package com.zhihuishu.innovationcourse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yw on 16/2/17.
 */
public class Teacher {

    private String name;
    private int imageId;
    private String desc;

    public Teacher(String name, int imageId, String desc) {
        this.name = name;
        this.imageId = imageId;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static List<Teacher> getAllTeachers() {
        List<Teacher> teachers = new ArrayList<Teacher>();

        teachers.add(new Teacher("信息工程学院", R.drawable.zhx, "信息工程学院成立于2002年，是我校第一批成立的二级学院。学院下设计算机系、电子工程系、物联网工程系、计算机公共教研部、实验中心、综合办公室、培训中心等机构。学院现有计算机科学与技术、物联网工程、电子信息工程、通信工程4个本科专业。\n" +
                "\n" +
                "学院现有教职工68人，其中教授10人，博士28人（含在读）。其中，浙江省“151人才工程”重点资助培养人选1人，浙江省“千人计划”人选1人，浙江省教学名师1人，浙江省高校中青年学科带头人2人，浙江省优秀青年教师资助计划资助对象2人，湖州市“1112人才工程”入选者8人（含后备人员）。"));
        teachers.add(new Teacher("党委书记 张大立", R.drawable.cj, "张大立：党委书记、副院长（兼）。主持学院党委全面工作，分管党建和思想政治、宣传文化、统战、工会、档案信息、综合治理等工作。联系综合办公室、分工会。"));
        teachers.add(new Teacher("副院长胡文军（主持工作）", R.drawable.yw, "胡文军：副院长（主持工作）。主持学院行政全面工作，分管人事、财务、学科、研究生等工作。联系电子工程系。"));


        return teachers;
    }
}
