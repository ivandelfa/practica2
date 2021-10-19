package practica2.ivandelfatovar.iesseveroochoa.net;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AgendaActivity extends AppCompatActivity {
    //Declaramos los objetos
    Button btnReiniciar;
    EditText txtNombre;
    EditText txtApellidos;
    EditText txtEmail;
    EditText txtTeléfono;
    TextView tvNombre;
    TextView tvApellidos;
    TextView tvNuevoContacto;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);
        //Boton Reiniciar
        btnReiniciar = findViewById(R.id.btnReiniciar);
        txtNombre = findViewById(R.id.txtNombre);
        txtEmail = findViewById(R.id.txtEmail);
        txtApellidos = findViewById(R.id.txtApellidos);
        txtTeléfono = findViewById(R.id.txtTeléfono);

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtNombre.setText("");
                txtEmail.setText("");
                txtApellidos.setText("");
                txtTeléfono.setText("");
            }
        });
        //Boton Aceptar



    }


}