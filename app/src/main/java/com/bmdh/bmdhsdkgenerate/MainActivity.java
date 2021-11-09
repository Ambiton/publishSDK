package com.bmdh.bmdhsdkgenerate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.indoor.BmdhIndoorConfig;
import com.indoor.BmdhIndoorSDK;
import com.indoor.IBmdhNaviManager;
import com.indoor.position.IPSMeasurement;

public class MainActivity extends AppCompatActivity implements IPSMeasurement.Callback {
private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BmdhIndoorSDK.getInstance().init(this, new BmdhIndoorConfig.Builder().DEAFULT(this).build());
        BmdhIndoorSDK.getInstance().startIndoorLocation(this);
    }

    @Override
    public void onReceive(IPSMeasurement measurement) {
        Log.d(TAG,"measurement :"+measurement.getClass().getSimpleName());
    }
}