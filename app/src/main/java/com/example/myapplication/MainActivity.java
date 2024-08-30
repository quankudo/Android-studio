package com.example.myapplication;


import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvStudentInfo = findViewById(R.id.tvStudentInfo);
        String studentName = "Nguyễn Hữu Quân";
        String studentID = "22115053122332";
        tvStudentInfo.setText("Tên: " + studentName + "\nMã SV: " + studentID);
    }
}