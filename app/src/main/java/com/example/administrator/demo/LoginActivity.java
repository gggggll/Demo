package com.example.administrator.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by lenovo on 2017/10/16.
 */

public class LoginActivity extends AppCompatActivity {
    private Button btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        btn=(Button)findViewById(R.id.btn_dl);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
            Intent intent=new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
            }
        });
    }

}
