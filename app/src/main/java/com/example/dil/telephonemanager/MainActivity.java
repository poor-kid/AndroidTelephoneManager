package com.example.dil.telephonemanager;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TelephonyManager telephonyManager;
    String num,message;
    EditText ed,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this,Email.class);
        startActivity(intent);
        ed = (EditText)findViewById(R.id.editText2);
        ed2 = (EditText)findViewById(R.id.editText3);


    }

    public void message(View v)
    {
        num = ed.getText().toString();
        message = ed2.getText().toString();
        SmsManager  manager = SmsManager.getDefault();

        //parameter for below
        /*Intent  intent=new Intent();
        PendingIntent pendingIntent=PendingIntent.getActivity(this,22,intent,PendingIntent.FLAG_UPDATE_CURRENT);
        */
        manager.sendTextMessage(num,null,message,null,null);
        Toast.makeText(this,"Message sent",Toast.LENGTH_LONG).show();


    }

    public void intentmessage(View v)
    {
        num = ed.getText().toString();
        message = ed2.getText().toString();
        Uri uri = Uri.parse("smsto: "+num);
        Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
        intent.putExtra(Intent.EXTRA_TEXT,message);
        startActivity(intent);

    }
}
