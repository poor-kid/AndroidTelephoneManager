package com.example.dil.telephonemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class DeviceDetails extends AppCompatActivity {

    String id;
    TelephonyManager manager;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_details);
        txt = (TextView)findViewById(R.id.textView);
        manager = (TelephonyManager)getSystemService(TELEPHONY_SERVICE);

        id =manager.getDeviceId().toString();
        txt.setText(id);
    }
}
