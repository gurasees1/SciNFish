package com.gai.guras.scinfish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class UserTypeSelectionActivity extends AppCompatActivity {
    private RadioGroup radiogroup;
    private RadioButton selected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_type_selection);
        radiogroup=(RadioGroup) findViewById(R.id.radioGroupFishSci);
        int selectedId=radiogroup.getCheckedRadioButtonId();
        selected= findViewById(selectedId);
        Toast.makeText(getBaseContext(),"Welcome "+selected.getText(), Toast.LENGTH_SHORT).show();
    }
}
