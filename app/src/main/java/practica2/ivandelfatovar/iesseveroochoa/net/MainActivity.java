package practica2.ivandelfatovar.iesseveroochoa.net;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAgenda;
    Button btnAgendaConstraint;
    Button btnReceta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAgenda = (Button)findViewById(R.id.btnAgenda);

        btnAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View f) {
                Intent intent = new Intent(MainActivity.this, AgendaActivity.class);
                startActivity(intent);
            }
        });

        btnAgendaConstraint = (Button)findViewById(R.id.btnAgendaConstraint);

        btnAgendaConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AgendaConstraintActivity.class);
                startActivity(intent);
            }
    });
        btnReceta = (Button)findViewById(R.id.btnReceta);

        btnReceta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                Intent intent = new Intent(MainActivity.this, RecetaActivity.class);
                startActivity(intent);
            }
        });



}
}