package com.example.school.utilidades;

public class Utilidades {
// contastes campos tabla usuario(alumnos)
    public static final String TABLA_ALUMNO="alumno";
    public static final String CAMPO_IDA="id_alumno";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_APELLIDO="apellido";
    public static final String CAMPO_DIRECCION="direccion";
    public static final String CAMPO_TELEFONO="telefono";
    public static final String CAMPO_EDAD="edad";


    public final String TABLA_USUARIO="usuario";


    public static final String CREAR_TABLA_ALUMNO = "CREATE TABLE "+ TABLA_ALUMNO+
            "("+ CAMPO_IDA +" INTEGER PRIMARY KEY AUTOINCREMENT, "+
            CAMPO_NOMBRE +" TEXT, "+
            CAMPO_APELLIDO +" TEXT, "+
            CAMPO_DIRECCION +" TEXT, "+
            CAMPO_TELEFONO +" TEXT, "+
            CAMPO_EDAD +" TEXT)";




}
