package com.example.mvvm_architecture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btn;
    ViewModulePersonne viewModule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView);
        btn = findViewById(R.id.button);

        viewModule = new ViewModelProvider(this).get(ViewModulePersonne.class);
        viewModule.personNameLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String  s) {
                txt.setText(s);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModule.getPersonneInfo();
            }
        });
    }
}