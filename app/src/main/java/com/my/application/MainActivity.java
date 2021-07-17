package com.my.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private TextView ans;
    private HashMap<Character, Integer> charCountMap;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        ans = (TextView) findViewById(R.id.ans);
        edit = (EditText) findViewById(R.id.edit);


        charCountMap = new HashMap<>();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!edit.getText().toString().isEmpty()) {
                    StringBuffer sb = new StringBuffer(edit.getText().toString());
                    ans.setText(sb.reverse());
                    Toast.makeText(MainActivity.this, "Text Reversed", Toast.LENGTH_SHORT).show();
                }
                    else
                    {
                        edit.setError("Please enter any text here!");
                        edit.requestFocus();
                    }
            }
        });
    }
}
