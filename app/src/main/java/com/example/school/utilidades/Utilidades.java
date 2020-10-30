package com.example.school.utilidades;

public class Utilidades {

    public static int DB_VERSION=1;
    public static String DB_NAME="bd_alumnos";


// constantes campos tabla usuario(alumnos)
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


// constantes campos tabla grado
    public static final String TABLA_GRADO ="grado";
    public static final String CAMPO_IDG="id_grado";
    public static final String CAMPO_GRADO="grado";

    public static final String CREAR_TABLA_GRADO = "CREATE TABLE "+ TABLA_GRADO+
            "(" + CAMPO_IDG + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            CAMPO_GRADO + " TEXT)";

    //constantes campos tabla seccion
    public static final String TABLA_SECCION ="seccion";
    public static final String CAMPO_IDS="id_seccion";
    public static final String CAMPO_SECCION="seccion";

    public static final String CREAR_TABLA_SECCION = "CREATE TABLE "+ TABLA_SECCION+
            "(" + CAMPO_IDS + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
            CAMPO_SECCION + " TEXT)";



}
