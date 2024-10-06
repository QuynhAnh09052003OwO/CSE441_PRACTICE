package com.example.th3;

import android.os.Bundle;

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
        rcvStudent = findViewById(R.id.rcv_student);
        studentAdapter = new StudentAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvStudent.setLayoutManager(linearLayoutManager);

        studentAdapter.setData(getListStudent());
        rcvStudent.setAdapter(studentAdapter);
    }

    private List<Student> getListStudent(){
        List<Student> list = new ArrayList<>();

        list.add(new Student("CSE441","Chau ngoan" ,(float)4.0) );
        list.add(new Student("CSE441","Chau ngoan" ,(float)4.0) );
        list.add(new Student("CSE441","Chau ngoan" ,(float)4.0) );
        list.add(new Student("CSE441","Chau ngoan" ,(float)4.0) );
        list.add(new Student("CSE441","Chau ngoan" ,(float)4.0) );
        list.add(new Student("CSE441","Chau ngoan" ,(float)4.0) );
        list.add(new Student("CSE441","Chau ngoan" ,(float)4.0) );

        return list;
    }
}