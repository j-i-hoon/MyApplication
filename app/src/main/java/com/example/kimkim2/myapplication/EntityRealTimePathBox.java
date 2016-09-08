package com.example.kimkim2.myapplication;

/**
 * Created by kimkim2 on 2016-09-06.
 */
public class EntityRealTimePathBox {

    private long 	ID; //디비 이름과 동일 해야함

    public String 	mStartLocation; // 출발지
    public String   mDestination; // 도착지
    public String   mTotalDistance;
    public String 	mName;
    public String  mCurrentLon;
    public String  mCurrentLat;
    public long    mTime; //이동 경로점 도착시 현재 시간
    public long    mAlarmStartTime;
    public String   mDestinatioLon; //도착지 lon
    public String   mDestinationLat; //도착지 lat
    public String   mStartLon; //출발지 lon
    public String   mStartLat;// 출발지 lat

    public EntityRealTimePathBox() {}

    public long getID() {
        return ID;
    }
}