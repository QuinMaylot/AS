package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView myTextVar; // Объявили переменную из семейства TextView
    private CheckBox chkBox;
    private Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        myTextVar = findViewById(R.id.textView); // Познакомили переменную с компонентом
        chkBox = findViewById(R.id.checkBox);
        btn = findViewById(R.id.button);

        myTextVar.setText("New text in TextView"); // Программно присвоили текст
        chkBox.setChecked(true);
        btn.setEnabled(false);
    }
}