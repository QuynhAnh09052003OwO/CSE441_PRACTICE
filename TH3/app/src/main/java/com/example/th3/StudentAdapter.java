package com.example.th3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudenViewHolder> {

    public Context myContext;
    public List<Student> myListStudent;

    public StudentAdapter(Context myContext) {
        this.myContext = myContext;
    }

    public void setData(List<Student> list){
        this.myListStudent = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public StudenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student,parent,false);
        return new StudenViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudenViewHolder holder, int position) {
        Student student = myListStudent.get(position);
        if (student == null){
            return;
        }
        holder.id.setText(student.getId());
        holder.name.setText(student.getName());
        holder.gpa.setText(student.getGpa()+"");
    }

    @Override
    public int getItemCount() {
        if (myListStudent != null)
            return myListStudent.size();
        return 0;
    }

    public class StudenViewHolder extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView id, name, gpa;

        public StudenViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgStudent);
            id = itemView.findViewById(R.id.txt_id);
            name = itemView.findViewById(R.id.txt_name);
            gpa = itemView.findViewById(R.id.txt_gpa);
        }
    }
}
