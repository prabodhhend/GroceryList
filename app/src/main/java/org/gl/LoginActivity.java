package org.gl;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

/**
 * Created by ADMIN on 5/21/2017.
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editUsername, editPassword;
    Button buttonLogin;
    ImageView imgFacebook, imgGoogle;
    ProgressBar progressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUsername = (EditText) findViewById(R.id.editUsername);
        editPassword = (EditText) findViewById(R.id.editPassword);
        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        imgFacebook = (ImageView) findViewById(R.id.img_fblogin);
        imgGoogle = (ImageView) findViewById(R.id.img_gmail_login);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        buttonLogin.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent =new Intent(LoginActivity.this,MainActivity.class);
        switch (v.getId()) {
            case R.id.buttonLogin:
                progressBar.setVisibility(View.VISIBLE);
                startActivity(intent);
                break;
            case R.id.img_fblogin:
                progressBar.setVisibility(View.VISIBLE);
                startActivity(intent);
                break;
            case R.id.img_gmail_login:
                progressBar.setVisibility(View.VISIBLE);
                startActivity(intent);
                break;


        }

    }
}
