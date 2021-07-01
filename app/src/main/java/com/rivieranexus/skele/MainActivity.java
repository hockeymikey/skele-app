package com.rivieranexus.skele;

import androidx.appcompat.app.AppCompatActivity;
import com.cogi.skele.Skele;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testLock();
            }
        });
    }

    private void testLock() {
        Skele.testlocks();
    }
}