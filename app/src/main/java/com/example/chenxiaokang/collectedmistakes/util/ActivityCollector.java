package com.example.chenxiaokang.collectedmistakes.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenxiaokang on 2017/6/9.
 * 活动收集工具，注销或退出程序
 */

public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    /**
     * 销毁全部活动
     */
    public static void finishAll(){
        for(Activity activity : activities){
            activity.finish();
        }
    }
}
