package com.seproject.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;

public class MainMenu extends AppCompatActivity {

    Button btnLogOut;
    Button btnProFile;
    Button btnAdd;
    Button btnQR;
    FirebaseAuth kAuth;
    TextInputEditText Link;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        final TextView currentqueueTextView = (TextView) findViewById(R.id.currentQ);
        final TextView myqueueTextView = (TextView) findViewById(R.id.myQ);
        final TextView totalqueueTextView = (TextView) findViewById(R.id.totalQ);
        final TextView queuetitleTextView = (TextView) findViewById(R.id.queuetitle);

        Link = findViewById(R.id.Link);
        kAuth = FirebaseAuth.getInstance();

        btnLogOut = findViewById(R.id.btnLogout);
        btnLogOut.setOnClickListener(view ->{
            startActivity(new Intent(MainMenu.this, LoginActivity.class));
        });

        btnQR = findViewById(R.id.btnQR);
        btnQR.setOnClickListener(view ->{
            startActivity(new Intent(MainMenu.this, AddQueue.class));
        });

        btnAdd = findViewById(R.id.addqueue);
        btnAdd.setOnClickListener(view ->{
            String link = Link.getText().toString();
            String examplelink = "cGSq5lBH4mc";
            //sample link cGSq5lBH4mc

            if (TextUtils.isEmpty(link)) {
                Link.setError("Link cannot be empty");
                Link.requestFocus();
            }
            else {
                if(link.equals(examplelink)) {

                    currentqueueTextView.setText("3");
                    myqueueTextView.setText("6");
                    totalqueueTextView.setText("12");
                    queuetitleTextView.setText("Rumah sakit gigi dan mulut RSKGM");

                };
            };
        });

        btnProFile = findViewById(R.id.btnProfile);
        btnProFile.setOnClickListener(view ->{
            startActivity(new Intent(MainMenu.this, ProfileActivity.class));
        });

    }
}