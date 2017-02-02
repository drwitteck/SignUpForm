package edu.temple.signupform;

/*
 * --Name:				Derek Witteck
 * --Assignment:		SignUpForm
 * --Version:			1
 * --Date:				February 1st, 2017
 * --Due Date:			February 8th, 2017
 * --Section:			3515-002
 * --Instructor:		Professor Morris
 * --Lab Instructor:	Ed Bersin
 * --Description:		Create an Android application containing an activity that collects a user’s name, email, a password,
 *                      and a password confirmation and a Save button.
 * --File Name:			FormActivity.java
 * --Classes:           FormActivity extends AppCompatActivity()
 * --Methods:           onCreate(), OnClick()
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    TextView textName;
    TextView textEmail;
    TextView textPassword;
    TextView textReenterPassword;
    EditText editTextName;
    EditText editTextEmail;
    EditText editTextPassword;
    EditText editTextReenterPassword;
    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        textName = (TextView) findViewById(R.id.textName);
        textEmail = (TextView) findViewById(R.id.textEmail);
        textPassword = (TextView) findViewById(R.id.textPassword);
        textReenterPassword = (TextView) findViewById(R.id.textReenterPassword);
        saveButton = (Button) findViewById(R.id.saveButton);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextReenterPassword = (EditText) findViewById(R.id.editTextReenterPassword);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextName.getText().toString().equals("")) {
                    Toast.makeText(FormActivity.this, "Please enter your name.", Toast.LENGTH_SHORT).show();
                }
                if (editTextEmail.getText().toString().equals("")) {
                    Toast.makeText(FormActivity.this, "Please enter your email address.", Toast.LENGTH_SHORT).show();
                }
                if (editTextPassword.getText().toString().equals("")) {
                    Toast.makeText(FormActivity.this, "Please enter your password.", Toast.LENGTH_SHORT).show();
                }
                if (editTextReenterPassword.getText().toString().equals("")) {
                    Toast.makeText(FormActivity.this, "Please enter your password again.", Toast.LENGTH_SHORT).show();
                }else if (!editTextReenterPassword.getText().toString().equals(editTextPassword.getText().toString())) {
                    Toast.makeText(FormActivity.this, "Passwords do not match. Please re-enter", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(FormActivity.this, "Success!", Toast.LENGTH_SHORT).show();
                }
            }
        });


}
    }