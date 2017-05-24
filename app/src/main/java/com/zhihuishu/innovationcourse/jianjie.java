package com.zhihuishu.innovationcourse;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

/**
 * Created by Liu Lunsheng on 2017/5/24.
 */
public class jianjie extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jianjie);
        TeacherAdapter teacherAdapter = new TeacherAdapter(this, R.layout.teacher_item, Teacher.getAllTeachers());

        ListView listView = (ListView) findViewById(R.id.jianjie_listView);

        listView.setAdapter(teacherAdapter);
    }
}