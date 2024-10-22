package com.example.zarinaproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.zarinaproject.AddNoteActivity;
import com.example.zarinaproject.R;

public class MainActivity extends AppCompatActivity {
    AppCompatImageButton addBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       addBtn = findViewById(R.id.addNote) ;
   addBtn.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent intent = new Intent(MainActivity.this, AddNoteActivity.class);
           startActivity(intent);
       }
   });

    }
}