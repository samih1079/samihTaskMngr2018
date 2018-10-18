package com.abbas.samih.samihtaskmngr2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.abbas.samih.samihtaskmngr2018.taskfragments.SignUpActivity;

public class SignInActivity extends AppCompatActivity {

    private EditText edEmail,edPassWord;
    private Button btnLogIN,btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        edEmail=(EditText)findViewById(R.id .edEmail) ;
        edPassWord=(EditText)findViewById(R.id .edPassWord) ;
        btnLogIN=(Button)findViewById(R.id .btnLogIn) ;
        btnSignUp=(Button) findViewById(R.id .btnSignUp) ;

        btnLogIN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // كود الانتقال إلى الشاشة الأخرى
                Intent i=new Intent(getApplicationContext(), SpalshActivity.class);
                startActivity(i);
            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // كود الانتقال إلى الشاشة الأخرى
                Intent i=new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(i);
            }
        });



    }
}
