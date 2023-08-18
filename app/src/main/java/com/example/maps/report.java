package com.example.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class report extends AppCompatActivity {
    TextView tvName,tvLocation,tvDate,tvRemarks;
    String nam,loc,dt,rem;
    Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        btnExit=(Button) findViewById(R.id.btnExit);

        nam=getIntent().getStringExtra("Name");
        tvName=(TextView) findViewById(R.id.tvName);
        tvName.setText(nam);

        loc=getIntent().getStringExtra("Location");
        tvLocation=(TextView) findViewById(R.id.tvLocation);
        tvLocation.setText(loc);

        dt=getIntent().getStringExtra("DateTime");
        tvDate=(TextView) findViewById(R.id.tvDate);
        tvDate.setText(dt);

        rem=getIntent().getStringExtra("Remarks");
        tvRemarks=(TextView) findViewById(R.id.tvRemarks);
        tvRemarks.setText(rem);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(report.this,"Attendance Saved",Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}