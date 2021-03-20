package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class EditProfileAdaptadoRefactorizado extends AppCompatActivity {

    private String currentUserEmail;
    private UsersDataBase dataBase;
    private TextView passwordTxt;
    private TextView confirmPasswordTxt;
    private TextView nameTxt;
    private TextView surnameTxt;
    private TextView emailTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //int currentUserScore;
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
            //currentUserScore = dataBase.getUser(currentUserEmail).getScore();
        } else
            showMessage("Tiene que haber iniciado sesion previamente.");
    }

    public void saveChanges() {
        if (currentUserEmail != null) {
            if (checkPasswordFieldsArentEmpty() && passwordTxt.getText().equals(confirmPasswordTxt.getText())) {
                dataBase.updateUser("password", passwordTxt.getText().toString(), currentUserEmail);
                if (!nameTxt.getText().toString().isEmpty())
                    dataBase.updateUser("name", nameTxt.getText().toString(), currentUserEmail);
                if (!surnameTxt.getText().toString().isEmpty())
                    dataBase.updateUser("surname", surnameTxt.getText().toString(), currentUserEmail);
                if (!emailTxt.getText().toString().isEmpty()) {
                    dataBase.updateUser("_email", emailTxt.getText().toString(), currentUserEmail);
                    currentUserEmail = emailTxt.getText().toString();
                }
                showMessage("Cambios realizados correctamente.");
                //goMain(view);
                goMain();
            } else
                showMessage("Las contraseñas no coinciden.");

        } else
            showMessage("Tiene que haber iniciado sesion previamente.");

    }


    public static ArrayList<String> saveChanges2(String currentUserEmail, String passwordTxt,
                                                 String confirmPasswordTxt, String nameTxt, String surnameTxt, String emailTxt) {
        ArrayList<String> alResultado = new ArrayList<>();
        if (!currentUserEmail.equals("")) {
            if ((!passwordTxt.equals("") && !confirmPasswordTxt.equals("")) && passwordTxt.equals(confirmPasswordTxt)) {
                ///  dataBase.updateUser("password", passwordTxt.getText().toString(), currentUserEmail);
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
                alResultado.add("ContraseñaNoCoincide(1)");
        } else
            alResultado.add("DebesIniciarSesionPreviamente");
        return alResultado;
    }

    private boolean checkPasswordFieldsArentEmpty() {
        return !passwordTxt.getText().toString().isEmpty()&&!confirmPasswordTxt.toString().isEmpty();
    }

    //public void goMain(View view){
    private void goMain(){
        Intent i = new Intent(this, MainMenu.class);
        i.putExtra("userEmail", this.currentUserEmail);
        startActivity(i);
    }

    private void showMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }




}