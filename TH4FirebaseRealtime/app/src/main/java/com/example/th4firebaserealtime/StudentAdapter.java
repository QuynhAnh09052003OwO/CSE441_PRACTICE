package com.example.th4firebaserealtime;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    private Context mcontext;
    private List<Student> mListStudent;

    public StudentAdapter(Context mcontext) {
        this.mcontext = mcontext;
    }

    public void setData(List<Student> list){
        this.mListStudent = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = mListStudent.get(position);
        if (student == null)
            return;

        holder.txtName.setText("Name: " + student.getName());
        holder.txtID.setText("ID: " + student.getId());
        holder.txtClass.setText("Class: " + student.get_class());
        holder.txtScore.setText("Score: " + String.valueOf(student.getScore()));
    }

    @Override
    public int getItemCount() {
        if (mListStudent != null)
            return mListStudent.size();
        return 0;
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder{

        private TextView txtName, txtID, txtClass, txtScore;
        private Button btnDelete, btnEdit;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.tvName);
            txtID = itemView.findViewById(R.id.tvID);
            txtClass = itemView.findViewById(R.id.tvClass);
            txtScore = itemView.findViewById(R.id.tvScore);
            btnDelete = itemView.findViewById(R.id.btnDelete);
            btnEdit = itemView.findViewById(R.id.btnEdit);
        }
    }
}
