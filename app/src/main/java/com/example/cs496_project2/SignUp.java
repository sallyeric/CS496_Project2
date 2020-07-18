package com.example.cs496_project2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SignUp extends AppCompatActivity {

    String signupID="", signupPW="", signupNUM="";
    EditText idET,pwET,numET;

    ArrayList<String> data;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        data=new ArrayList<String>();
        idET=(EditText) findViewById(R.id.addID);
        pwET=(EditText) findViewById(R.id.addPW);
        numET=(EditText) findViewById(R.id.addNUM);

        ImageButton searchID = (ImageButton) findViewById(R.id.searchID);
        searchID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Firebase button parse
                signupID=idET.getText().toString();
                signupPW=pwET.getText().toString();
                signupNUM=numET.getText().toString();

                // 버튼 클릭시 존재하는 아이디인지 ??
            }
        });

        TextView login = (TextView) findViewById(R.id.signupButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Firebase button parse
                signupID=idET.getText().toString();
                signupPW=pwET.getText().toString();
                signupNUM=numET.getText().toString();

                // 디비에 사용자 정보 올리기
            }
        });

    }
}