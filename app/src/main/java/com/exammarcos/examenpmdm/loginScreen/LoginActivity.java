package com.exammarcos.examenpmdm.loginScreen;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.exammarcos.examenpmdm.MainActivity;
import com.exammarcos.examenpmdm.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    TextInputLayout nameTextInputLayout;
    TextInputLayout passwordTextInputLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        findViewById(R.id.loginButton).setOnClickListener(click->{
logUser();
        });
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        nameTextInputLayout = findViewById(R.id.loginScreenNameInput);
        passwordTextInputLayout = findViewById(R.id.loginScreenPasswordInput);
        nameTextInputLayout.setHint("Nombre");
        passwordTextInputLayout.setHint("Contraseña");
    }


    @Override
    public void onClick(View view) {

        if(view.getId()==findViewById(R.id.loginButton).getId()){
        }

    }

    public void logUser(){
        nameTextInputLayout.setErrorEnabled(false);



        try{
            String nameText=nameTextInputLayout.getEditText().getText().toString().trim();
            String passText=passwordTextInputLayout.getEditText().getText().toString().trim();
            if(nameText.isEmpty()){
                setEmptyMessage(nameTextInputLayout,"nombre");
            }
            if(passText.isEmpty()){
                setEmptyMessage(passwordTextInputLayout,"contraseña");


            }

            if(!passText.isEmpty()){
              if(!checkPassword(passText)){

                  Toast.makeText(this, "Contraseña incorreecta", Toast.LENGTH_LONG).show();


                }
              else{
                  Intent intent= new Intent(LoginActivity.this, MainActivity.class);
                  startActivity(intent);

              }

            }

        }catch (Exception e){

        }




    }


    public boolean checkPassword(String text){
     return text.equals(getString(R.string.password))  ;
    }

    public void setEmptyMessage(TextInputLayout textInputLayout,String fieldName){
        nameTextInputLayout.setErrorEnabled(true);

        nameTextInputLayout.setError("Error");
        Toast.makeText(this, "El campo "+fieldName+" no puede estar vacio", Toast.LENGTH_SHORT).show();

        nameTextInputLayout.setError("El campo "+fieldName+" no puede estar vacio");
                }}