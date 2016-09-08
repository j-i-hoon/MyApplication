package com.example.kimkim2.myapplication;

/**
 * Created by kimkim2 on 2016-09-06.
 */

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;


/**
 * @설명 : 도착지 주변 접근시 알림
 * @클래스명 : ApproximaAlert
 *
 */
public class ApproximaAlert {

    private static ApproximaAlert mTheInstance;
    private LocationManager locMgr = null;
    PendingIntent pIntent = null;

    public static synchronized ApproximaAlert getInstance() {
        if (mTheInstance == null) {
            mTheInstance = new ApproximaAlert();
        }
        return mTheInstance;
    }



    /**
     * 도착시 알람 해제 Method
     */
    public synchronized void removeLocation() {
        if (pIntent != null) {
            //locMgr.removeProximityAlert(pIntent);
        }
    }

    public synchronized void release(){
        if(mTheInstance != null)
            mTheInstance = null;

    }

}