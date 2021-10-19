package practica2.ivandelfatovar.iesseveroochoa.net;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgendaConstraintActivity extends AppCompatActivity {

    Button btnOk;
    EditText txtTelefonoConstraint;
    Button btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_constraint);

        btnOk = findViewById(R.id.btnOk); //Relaciono el boton con mi objeto
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Agrego el objeto Toast para que me devuelva lo que hay almacenado en el Edit Text de Nombre
                Toast.makeText(AgendaConstraintActivity.this, (CharSequence) txtTelefonoConstraint, Toast.LENGTH_SHORT).show();
            }
        });
        btnCancel = findViewById(R.id.btnCancel); //Realizamos la misma operacion que anteriormente hemos hecho en el activity agenda
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View g) {
                finish();
            }
        });


    }

}