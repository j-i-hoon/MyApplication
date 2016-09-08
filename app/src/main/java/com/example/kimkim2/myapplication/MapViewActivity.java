package com.example.kimkim2.myapplication;

/**
 * Created by kimkim2 on 2016-09-06.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


/**
 * @설명 : 지도 보기 Activity
 * @클래스명 : MapViewActivity
 *
 */
public class MapViewActivity extends Activity {


    private Button mLocationConfirmButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activitiy_mapview);

        mLocationConfirmButton = (Button) findViewById(R.id.location_confirm);
        mLocationConfirmButton.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {// 위치 확인
                // TODO Auto-generated method stub

            }
        });

    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();

        Toast.makeText(this, R.string.choose_location_on_the_map, Toast.LENGTH_LONG).show();
    }
}

