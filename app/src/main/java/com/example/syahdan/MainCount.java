package com.example.syahdan;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.helloappssyahdan.R;

public class MainCount extends AppCompatActivity{
    private TextView mShowCount;
    private int currentCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        // Inisialisasi TextView
        mShowCount = findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        // Menambahkan nilai perhitungan dan menampilkan di TextView
        currentCount++;
        mShowCount.setText(String.valueOf(currentCount));
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_pesan, Toast.LENGTH_SHORT);
        toast.show();
    }
}

