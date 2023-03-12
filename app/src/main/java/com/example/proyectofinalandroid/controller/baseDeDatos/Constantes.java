package com.example.proyectofinalandroid.controller.baseDeDatos;

/**
 * Esta interfaz contiene contantes con las direcciones a los
 * scripts de php en el servidor
 * @author Fernando
 */
public interface Constantes {
    String SERVER = "http://192.168.1.143/webserviceProyecto/";
    String URL_LOGIN = SERVER + "acceso/login.php";
    String URL_EXISTE_USUARIO =  SERVER + "acceso/existeUsuario.php";
    String URL_REGISTRO = SERVER + "acceso/registro.php";
    String URL_OBTENER_CUESTIONARIOS_COMPLETOS = SERVER + "admin/cuestionarios/obtenerCuestionariosCompletos.php";
}
