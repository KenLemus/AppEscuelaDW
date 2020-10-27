package com.example.school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void onClick(View view){

            Intent miIntent= null;

            switch (view.getId()){
                case R.id.img_alumno:
                    miIntent= new Intent(MainActivity.this, Alumnos.class);
                    break;
                case R.id.img_grado:
                    miIntent= new Intent(MainActivity.this, Grado.class);
                    break;
                case R.id.img_inscripcion:
                    miIntent= new Intent(MainActivity.this, Inscripcion.class);
                    break;
                case R.id.img_mostrar:
                    miIntent= new Intent(MainActivity.this, Mostrar.class);

            }startActivity(miIntent);
        }
}
