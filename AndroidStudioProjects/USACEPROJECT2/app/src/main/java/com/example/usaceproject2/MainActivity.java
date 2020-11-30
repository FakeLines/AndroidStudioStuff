package com.example.usaceproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimeSheetEntry1();
            }
        });
    }


    public void openTimeSheetEntry1() {
        Intent intent = new Intent(this, TimeSheetEntry1.class);
        startActivity(intent);
    }

    private void startActivity(Intent intent) {
    }

    public void Link_To_TS(View view) {
    }
}