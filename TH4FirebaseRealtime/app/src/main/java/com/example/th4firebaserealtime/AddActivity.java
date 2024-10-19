package com.example.th4firebaserealtime;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddActivity extends AppCompatActivity {

    EditText edit_name, edit_id, edit_class, edit_score;
    Button btnSubmit, btnBack;
    TextView tvName, tvId, tvClass, tvScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //su kien bam nut Back
        btnBack =findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //firebase
        edit_name = findViewById(R.id.edit_name);
        edit_id = findViewById(R.id.edit_id);
        edit_class = findViewById(R.id.edit_class);
        edit_score = findViewById(R.id.edit_score);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myRef.setValue(edit_id.getText().toString().trim());
                myRef.setValue(edit_name.getText().toString().trim());
                myRef.setValue(edit_class.getText().toString().trim());
                myRef.setValue(edit_score.getText().toString().trim());
            }
        });
    }
}