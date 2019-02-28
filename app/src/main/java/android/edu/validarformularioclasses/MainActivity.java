package android.edu.validarformularioclasses;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText correo;
    //necesario incluir en el manifest:
    //    implementation 'com.android.support:design:28.0.0'
    TextInputEditText contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        correo=findViewById(R.id.cajamaillogin);
        contraseña=findViewById(R.id.cajapwdlogin);
    }

    public void borrarFormulario(View view) {
        correo.setText("");
        contraseña.setText("");
        correo.requestFocus();
    }

    public void aceptarFormulario(View view) {
        String correoTxt;
        String contraseñaTxt;
        ValidarLogin vl=new ValidarLogin(getApplicationContext());
        correoTxt=correo.getText().toString();
        contraseñaTxt=contraseña.getText().toString();

        if (vl.validarCorreo (correo,correoTxt) &&  vl.validarContraseña(contraseñaTxt))
        {
            Toast.makeText(this,"TODO CORRECTO",Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this,"EXISTEN ERRORES",Toast.LENGTH_SHORT).show();
    }
}
