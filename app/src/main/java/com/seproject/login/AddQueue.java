package com.seproject.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class AddQueue extends AppCompatActivity {
    TextInputEditText Link;
    Button btnLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_queue);

        Link = findViewById(R.id.Link);
        btnLink = findViewById(R.id.btnlink);

        final TextView currentqueueTextView = (TextView) findViewById(R.id.currentQ);

        btnLink.setOnClickListener(view -> {
            String link = Link.getText().toString();
            String examplelink = "cGSq5lBH4mc";
            //sample link cGSq5lBH4mc

            if (TextUtils.isEmpty(link)) {
                Link.setError("Link cannot be empty");
                Link.requestFocus();
            }
            else {
               if(link.equals(examplelink)) {

                   currentqueueTextView.setText("1");
               };
            };
        });

    }




}