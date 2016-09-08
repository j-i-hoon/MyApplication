package com.example.kimkim2.myapplication;

/**
 * Created by kimkim2 on 2016-09-06.
 */
public class EntityRealTimeMovePathDetail  {

    public String 	mName;
    public long   	mTime;
    public String  	mCurrentLat;
    public String  	mCurrentLon;

    private boolean	mCheckedState;// 체크 박스 체크 상태

    public EntityRealTimeMovePathDetail() {}

    public boolean ismCheckedState() {
        return mCheckedState;
    }

    public void setmCheckedState(boolean mCheckedState) {
        this.mCheckedState = mCheckedState;
    }

    public boolean getChecked() {
        return mCheckedState;
    }

    public void setChecked(boolean checked){
        mCheckedState = checked;
    }

}