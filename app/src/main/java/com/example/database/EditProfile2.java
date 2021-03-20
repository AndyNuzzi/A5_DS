package com.example.database;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class EditProfile2 extends AppCompatActivity {

    private String currentUserEmail;
    private UsersDataBase dataBase;
    private TextView passwordTxt, confirmPasswordTxt, nameTxt, surnameTxt, emailTxt;
    private int currentUserScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        currentUserEmail = getIntent().getStringExtra("userEmail");
        passwordTxt = (TextView) findViewById(R.id.txtPassword2);
        confirmPasswordTxt = (TextView) findViewById(R.id.txtConfirmPassword2);
        nameTxt = (TextView) findViewById(R.id.txtName2);
        surnameTxt = (TextView) findViewById(R.id.txtSurname2);
        emailTxt = (TextView) findViewById(R.id.txtEmail2);
        dataBase = new UsersDataBase(this);

        if (currentUserEmail != null) {
            User currentUser = dataBase.getUser(currentUserEmail);
            passwordTxt.setHint(currentUser.getPassword());
            confirmPasswordTxt.setHint(currentUser.getPassword());
            nameTxt.setHint(currentUser.getName());
            surnameTxt.setHint(currentUser.getSurname());
            emailTxt.setHint(currentUser.getEmail());
            currentUserScore = dataBase.getUser(currentUserEmail).getScore();
        } else
            Toast.makeText(this, "Tiene que haber iniciado sesion previamente.", Toast.LENGTH_SHORT).show();
    }


    public static ArrayList<String> saveChanges(String currentUserEmail, String passwordTxt,
                                                String confirmPasswordTxt, String nameTxt, String surnameTxt, String emailTxt) {
        ArrayList<String> alResultado = new ArrayList<>();


        if (!currentUserEmail.equals("")) {
            if (!passwordTxt.equals("") && !confirmPasswordTxt.equals("")) {
                if (passwordTxt.equals(confirmPasswordTxt)) {
                    alResultado.add(passwordTxt);
                    if (!nameTxt.equals(""))
                        alResultado.add(nameTxt);
                    if (!surnameTxt.equals(""))
                        alResultado.add(surnameTxt);
                    if (!emailTxt.equals("")) {
                        alResultado.add(emailTxt);
                        currentUserEmail = emailTxt;
                    }
                    alResultado.add("CambiosReliados(1)");
                    alResultado.add("goMain(1)");
                } else
                    //Toast.makeText(this,"Las contraseñas no coinciden.",Toast.LENGTH_SHORT).show();
                    alResultado.add("ContraseñaNoCoincide(1)");
            } else {
                if ((passwordTxt.equals("") && !confirmPasswordTxt.equals("")) || (!passwordTxt.equals("") && confirmPasswordTxt.equals(""))) {
                    alResultado.add("ContraseñaNoCoincide(2)");
                } else {
                    if (!nameTxt.equals(""))
                        alResultado.add(nameTxt);
                    if (!surnameTxt.equals(""))
                        alResultado.add(surnameTxt);
                    if (!emailTxt.equals("")) {
                        alResultado.add(emailTxt);
                        currentUserEmail = emailTxt;
                    }
                    alResultado.add("CambiosReliados(2)");
                    alResultado.add("goMain(2)");
                }
            }
        } else
            alResultado.add("DebesIniciarSesionPreviamente");

        return alResultado;
    }



public void setCurrentUserEmail (String Email){
        this.currentUserEmail = Email;
    }

    private boolean checkOnePasswordFieldIsEmptyAndOtherNot() {
        if(passwordTxt.getText().toString().isEmpty()&&!confirmPasswordTxt.getText().toString().isEmpty())
            return true;
        if(!passwordTxt.getText().toString().isEmpty()&&confirmPasswordTxt.getText().toString().isEmpty())
            return true;
        return false;
    }

    private boolean checkPasswordFieldsArentEmpty() {
        return !passwordTxt.getText().toString().isEmpty()&&!confirmPasswordTxt.toString().isEmpty();
    }

    public void goMain(View view){
        Intent i = new Intent(this, MainMenu.class);
        i.putExtra("userEmail", this.currentUserEmail);
        startActivity(i);
    }
}