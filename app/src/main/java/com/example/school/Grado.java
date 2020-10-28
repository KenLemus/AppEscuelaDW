package com.example.school;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.school.utilidades.Utilidades;
import com.example.school.utilidades.UtilidadesGrado;

public class Grado extends AppCompatActivity {

    EditText  edtGrado;

    ConexionSQLiteHelper conn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grado);
        edtGrado = (EditText) findViewById(R.id.edtGrado);
    }

    public void onClick(View view){
        registrarGrados();
    }

    // Método para registrar
    public void registrarGrados(){
        ConexionSQLiteHelper conn= new ConexionSQLiteHelper(this, "bd_grados", null, 1);
        SQLiteDatabase db=conn.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(UtilidadesGrado.CAMPO_GRADO, edtGrado.getText().toString());
        Long idResultante=db.insert(UtilidadesGrado.TABLA_GRADO,UtilidadesGrado.CAMPO_ID_GRADO,values);
        Toast.makeText(getApplicationContext(),"Id Registro: "+idResultante,Toast.LENGTH_SHORT).show();


    }

}