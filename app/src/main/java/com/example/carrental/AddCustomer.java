package com.example.carrental;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddCustomer extends AppCompatActivity {
    EditText etFirstName, etLastName, etUserName, etPassword;
    UserRepository userRepository;
    Button addCustomer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);
        etFirstName = findViewById(R.id.addCustomerFirstName);
        etLastName = findViewById(R.id.addCustomerLastName);
        etUserName = findViewById(R.id.addCustomerUserName);
        etPassword = findViewById(R.id.addCustomerPassword);

        addCustomer = findViewById(R.id.btnAddCustomer);

        addCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fName, lName, uName, password;
                fName = etFirstName.getText().toString();
                lName = etLastName.getText().toString();
                uName = etUserName.getText().toString();
                password = etPassword.getText().toString();

                if(fName.equals("") || lName.equals("") || uName.equals("") || password.equals("")){
                    Toast.makeText(AddCustomer.this, "Fill all the credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
