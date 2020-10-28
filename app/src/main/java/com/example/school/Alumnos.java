package com.example.school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.school.utilidades.Utilidades;

public class Alumnos extends AppCompatActivity {

    EditText edtIdAlumno, edtNombre, edtApellido, edtDireccion, edtTelefono, edtEdad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumnos);

        //edtIdAlumno=(EditText) findViewById(R.id.edtIdAlumno);//
        edtNombre=(EditText) findViewById(R.id.edtNombre);
        edtApellido=(EditText) findViewById(R.id.edtApellido);
        edtDireccion=(EditText) findViewById(R.id.edtDireccion);
        edtTelefono=(EditText) findViewById(R.id.edtTelefono);
        edtEdad=(EditText) findViewById(R.id.edtEdad);
    }

    public void onClick(View view){
       registrarAlumnos();

    }

    private void registrarAlumnos(){
        ConexionSQLiteHelper conn= new ConexionSQLiteHelper(this, "bd_alumnos", null, 1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values= new ContentValues();
        //values.put(Utilidades.CAMPO_IDA,edtIdAlumno.getText().toString());//
        values.put(Utilidades.CAMPO_NOMBRE,edtNombre.getText().toString());
        values.put(Utilidades.CAMPO_APELLIDO,edtApellido.getText().toString());
        values.put(Utilidades.CAMPO_DIRECCION,edtDireccion.getText().toString());
        values.put(Utilidades.CAMPO_TELEFONO,edtTelefono.getText().toString());
        values.put(Utilidades.CAMPO_EDAD,edtTelefono.getText().toString());

        Long idResultante=db.insert(Utilidades.TABLA_ALUMNO, Utilidades.CAMPO_IDA,values);

        Toast.makeText(getApplicationContext(), "Id Registro: "+idResultante,Toast.LENGTH_SHORT).show();



    }
}