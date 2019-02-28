package android.edu.validarformularioclasses;

import android.content.Context;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import java.util.regex.Pattern;

public class ValidarLogin {

    //Clase con dos metodos: validacorreo y validaContraseña
    private Context contexto;

    public ValidarLogin(Context contexto) {
        this.contexto = contexto;
    }
    public boolean validarCorreo (View correo, String email){

        boolean correcto;
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        correcto =pattern.matcher(email).matches();

        if (email.length()<6) {
            Toast.makeText(this.contexto,"LONGUITUD MíNIMA DEL E-MAIL ES 6",Toast.LENGTH_SHORT).show();
            correo.requestFocus();
            return false;
        }
        else if (!correcto){
            Toast.makeText(this.contexto,"ERROR FORMATO E-MAIL",Toast.LENGTH_SHORT).show();
            correo.requestFocus();
            return false;
        }
        return true;
    }
    public Boolean validarContraseña(String contraseña){
        if (contraseña.length()<6)
        {   Toast.makeText(this.contexto,"LA LONGUITUD MÍNIMA DE LA CONTRASEÑA ES 6",Toast.LENGTH_SHORT).show();
            return false;
        }
        else
            return true;
    }



}