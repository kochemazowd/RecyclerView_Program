package com.example.recyclerviewprogram;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.Serializable;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle saved) {
        super.onCreate(saved);
        setContentView(R.layout.activity_add_people);
    }

    public void save(View view){


        EditText editname = this.findViewById(R.id.name_input);
        EditText editaddress =this.findViewById(R.id.address_input);
        EditText editage = this.findViewById(R.id.age_input);
        Users.getUsers().add(new Item(editname.getText().toString(),editaddress.getText().toString(),editage.getText().toString()));
        Intent intent = new Intent(this.getApplicationContext(),MainActivity.class);
        startActivity(intent);

    }

}
