package practica2.ivandelfatovar.iesseveroochoa.net;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AgendaActivity extends AppCompatActivity {
    //Declaramos los objetos
    Button btReiniciar;
    EditText etNombre;
    EditText etApellidos;
    EditText etEmail;
    EditText etTeléfono;
    TextView tvNuevoContacto;
    Button btSalir;
    Button btAceptar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        //Boton Reiniciar
        btReiniciar = findViewById(R.id.btReiniciar);
        etNombre = findViewById(R.id.etNombre);
        etEmail = findViewById(R.id.etEmail);
        etApellidos = findViewById(R.id.etApellidos);
        etTeléfono = findViewById(R.id.etTelefono);

        btReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Le asignamos al boton un conjunto de métodos para asi borrar la información de ellos
                etNombre.setText("");
                etEmail.setText("");
                etApellidos.setText("");
                etTeléfono.setText("");
            }
        });
        //Boton Salir
        btSalir = findViewById(R.id.btSalir); //Declaramos el botón y le asignamos la función findview
        btSalir.setOnClickListener(new View.OnClickListener() { //Con esta funcion
            @Override
            public void onClick(View y) {
                finish(); //Y finalizamos el proceso
            }
        });

        //Boton Aceptar
        btAceptar = findViewById(R.id.btAceptar);
        btAceptar.setOnClickListener(v->{
            if (etNombre.getText().length()!=0||etApellidos.getText().length()!=0){
                tvNuevoContacto.setText(etNombre.getText().toString()+ "" + etApellidos.getText().toString());
            }
        });





    }


}