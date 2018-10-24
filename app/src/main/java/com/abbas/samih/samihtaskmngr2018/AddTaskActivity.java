package com.abbas.samih.samihtaskmngr2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class AddTaskActivity extends AppCompatActivity {
    private EditText etTitle,etText,etDueDate;
    private SeekBar skbrImportant,skbrNecessary;
    private Button btnSave,btnDatePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        etTitle=findViewById(R.id.etTitle);
        etText=findViewById(R.id.etTaskText);
        etDueDate=findViewById(R.id.etDueDate);
        skbrImportant=findViewById(R.id.skbrImportant);
        skbrNecessary=findViewById(R.id.skbrNeccesary);
        btnSave=findViewById(R.id.btnSave);
        btnDatePicker=findViewById(R.id.btnDatePicker);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
