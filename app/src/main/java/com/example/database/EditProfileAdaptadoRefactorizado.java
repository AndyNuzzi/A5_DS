package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.TextView;
import android.widget.Toast;



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
                goMain();
            } else
                showMessage("Las contraseñas no coinciden.");

        } else
            showMessage("Tiene que haber iniciado sesion previamente.");

    }

    private boolean checkPasswordFieldsArentEmpty() {
        return !passwordTxt.getText().toString().isEmpty()&&!confirmPasswordTxt.toString().isEmpty();
    }

    private void goMain(){
        Intent i = new Intent(this, MainMenu.class);
        i.putExtra("userEmail", this.currentUserEmail);
        startActivity(i);
    }

    private void showMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

}
