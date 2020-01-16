package com.example.mysql_connection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    private Button VComputer;
    private Button VFriends;
    private Button Trivia;
    private Button PlyOffline;
    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        view= this.getWindow().getDecorView();
        view.setBackgroundResource(R.color.lightgreen);

        VComputer = (Button) findViewById(R.id.qComputer);
        VFriends = (Button) findViewById(R.id.qFriends);
        Trivia = (Button) findViewById(R.id.qTrivia);
        PlyOffline = (Button) findViewById(R.id.qOffline);

        VComputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectsubject();
            }
        });
        VFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectsubject();
            }
        });
        Trivia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectsubject();
            }
        });
        PlyOffline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectsubject();
            }
        });

    }
    private void selectsubject(){

            Intent intent = new Intent(Menu.this,Selectsubject.class);
            startActivity(intent);

    }
}
