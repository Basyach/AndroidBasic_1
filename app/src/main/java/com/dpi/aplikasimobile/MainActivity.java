package com.dpi.aplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Tempatinput;
    TextView textTampil;
    Button  btn_submit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tempatinput=(EditText)findViewById(R.id.tempatinput);
        textTampil=(TextView)findViewById(R.id.textTampil);
        btn_submit=(Button) findViewById(R.id.btn_submit);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = Tempatinput.getText().toString();
                String Hasil = nama;
                textTampil.setText("nama anda :" + Hasil);
            }
        });

    }

}