package com.example.yourrem;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.muddzdev.styleabletoast.StyleableToast;

public class Logion extends AppCompatActivity {

    EditText usuario, contraseña;
    TextView crear;
    private Button ingresar;
    final Context context = this;

    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //inicializar objeto firebaseAuth
        firebaseAuth=FirebaseAuth.getInstance();

        usuario=(EditText)findViewById(R.id.usuario);
        contraseña=(EditText)findViewById(R.id.contraseña);
        crear=(TextView)findViewById(R.id.Crear);
        ingresar=(Button)findViewById(R.id.ingresar);
        progressDialog=new ProgressDialog(this);

        ingresar.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            login();
                                        }
                                    });


                crear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Logion.this, RegistroUsuarios.class);
                        startActivity(intent);
                    }
                });



    }
    private void login(){
         final String email=usuario.getText().toString().trim();
         String password=contraseña.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            StyleableToast.makeText(getApplicationContext(),"Necesitas ingresar tu email", Toast.LENGTH_LONG, R.style.error).show();
            return;
        }
        if(TextUtils.isEmpty(password)){
            StyleableToast.makeText(getApplicationContext(),"Necesitas ingresar tu contraseña", Toast.LENGTH_LONG, R.style.error).show();
            return;
        }

        progressDialog.setMessage("Estamos conectando tu cuenta...");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(Logion.this, "Bienvenido de nuevo", Toast.LENGTH_LONG).show();
                            contraseña.setText("");
                            Intent intent = new Intent(Logion.this, RegistroUsuarios.class);
                            intent.putExtra("email", email);
                            startActivity(intent);
                        }else {
                            if(task.getException()instanceof FirebaseAuthUserCollisionException){
                                StyleableToast.makeText(getApplicationContext(),"¿Está seguro que tiene permiso?", Toast.LENGTH_LONG, R.style.error).show();
                            }else {
                                StyleableToast.makeText(getApplicationContext(),"¿Está seguro que tiene permiso?", Toast.LENGTH_LONG, R.style.error).show();
                            }
                        }
                        progressDialog.dismiss();
                    }
                });
    }




}
