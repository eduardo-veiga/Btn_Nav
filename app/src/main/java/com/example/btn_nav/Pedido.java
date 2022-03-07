package com.example.btn_nav;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Pedido extends AppCompatActivity {

    public Button btnnp;
    public Button btnpa;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pedido);

        btnnp = findViewById(R.id.btnP);
        btnpa = findViewById(R.id.btnA);

        btnnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Intent.ACTION_DIAL, Uri.parse("tel:109"));
                startActivity(intent);
            }
        });
    }
}
