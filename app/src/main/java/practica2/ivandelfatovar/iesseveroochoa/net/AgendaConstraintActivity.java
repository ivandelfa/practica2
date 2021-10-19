package practica2.ivandelfatovar.iesseveroochoa.net;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgendaConstraintActivity extends AppCompatActivity {

    Button btOk;
    EditText etNombreConstraint;
    Button btCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_constraint);

        btOk = findViewById(R.id.btOk); //Relaciono el boton con mi objeto
        btOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                //Agrego el objeto Toast para que me devuelva lo que hay almacenado en el Edit Text de Nombre
                Toast.makeText(AgendaConstraintActivity.this, (CharSequence) etNombreConstraint, Toast.LENGTH_LONG).show();
            }
        });
        //boton Cancel
        btCancel = findViewById(R.id.btCancel); //Realizamos la misma operacion que anteriormente hemos hecho en el activity agenda
        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View g) {
                finish();
            }
        });


    }

}