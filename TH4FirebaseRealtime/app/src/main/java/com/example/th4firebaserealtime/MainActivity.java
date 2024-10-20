package com.example.th4firebaserealtime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvStudent;
    private StudentAdapter studentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //su kien bam nut "Them"
        Button btnAdd =findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddActivity.class);
                startActivity(intent);
            }
        });


        //recyclerView
        rcvStudent = findViewById(R.id.rcvStudent);
        studentAdapter = new StudentAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvStudent.setLayoutManager(linearLayoutManager);
        studentAdapter.setData(getListStudent());
        rcvStudent.setAdapter(studentAdapter);



    }

    private List<Student> getListStudent(){
        List<Student> list = new ArrayList<>();
        list.add(new Student("11111","hahaha","63cntt",8));
        list.add(new Student("11111","hahaha","63cntt",8));
        list.add(new Student("11111","hahaha","63cntt",8));
        list.add(new Student("11111","hahaha","63cntt",8));
        list.add(new Student("11111","hahaha","63cntt",8));
        list.add(new Student("11111","hahaha","63cntt",8));

        return list;
    }


}