package com.example.administrator.android442;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText et_username;
    public EditText et_password;

    public Button bt_login;
    public Button bt_jump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);

        bt_login = (Button) findViewById(R.id.bt_login);
        bt_jump = (Button) findViewById(R.id.btn_jump);


        //button jump
        bt_jump.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Dialog dlg=new AlertDialog.Builder(v.getContext()).setTitle("提醒").setMessage("消息提示！")
                        .setPositiveButton("朕知道了",null).create();
                dlg.show();

            }
        });


        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                if (isCorrectInfo(username, password)) {
                    // 帐号密码校验成功，弹出当前密码
                    Toast.makeText(MainActivity.this, "password:" + et_password.getText().toString(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "登录失败！", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isCorrectInfo(String username, String password) {
        if (username.equals("123") && password.equals("123"))
            return true;
        return false;
    }


}