package com.example.dil.telephonemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Email extends AppCompatActivity {
    String email,sub,body;
    EditText ed,ed2,ed3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
        Intent i = new Intent(this,DeviceDetails.class);
        startActivity(i);
        ed = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText4);
        ed3 = (EditText)findViewById(R.id.editText5);

    }

    public void send(View v)
    {
        email = ed.getText().toString();
        sub = ed2.getText().toString();
        body = ed3.getText().toString();
        Intent i = new Intent(Intent.ACTION_SEND);
        i.putExtra(Intent.EXTRA_EMAIL,new String[]{email});
        i.putExtra(Intent.EXTRA_SUBJECT,sub);
        i.putExtra(Intent.EXTRA_TEXT,body);
      //  i.putExtra(Intent.EXTRA_STREAM,"file ");

        i.setType("text/rfc826");
        startActivity(Intent.createChooser(i,"Dileep"));


    }
}
