package com.zhihuishu.innovationcourse;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost mTabHost = getTabHost();

        mTabHost.addTab(mTabHost.newTabSpec("新闻").setIndicator(
                "新闻",
                getResources().getDrawable(android.R.drawable.arrow_down_float)).setContent(
                new Intent(this, xinwen.class)));
        mTabHost.addTab(mTabHost.newTabSpec("活动").setIndicator(
                "活动",
                getResources().getDrawable(android.R.drawable.arrow_down_float)).setContent(
                new Intent(this, huodong.class)));
        mTabHost.addTab(mTabHost.newTabSpec("简介").setIndicator(
                "简介",
                getResources().getDrawable(android.R.drawable.arrow_down_float)).setContent(
                new Intent(this, jianjie.class)));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
