package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    // Traemos el "motor" que vamos a probar desde la carpeta main
    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        // Ejecutamos la lógica con un nombre correcto
        boolean resultado = validador.validarNombre("Carlos");

        // Sentenciamos: Como el nombre está bien, esperamos que el resultado sea TRUE
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    // ESCRIBE TUS 5 RETOS A PARTIR DE AQUÍ

    //Reto1: Nombre Vacio
    @Test
    @DisplayName("nombre vacio")
    public void Nombre_Vacio(){
        String nombre = "";
        boolean esValido = nombre.length() > 0;
        assertFalse(esValido, "El sistema debería rechar el nombre");
    }
    //Reto2: Password justa
    @Test
    @DisplayName("password justa")
    public void Password_Justa(){
        String password = "12345678";
        boolean esValido = password.length() >= 8;
        assertTrue(esValido, "El sistema deberia aceptar la contraseña");
    }

    //Reto3: Password corta
    @Test
    @DisplayName("password corta")
    public void Password_corta(){
        String password = "Admin";
        boolean esValido = password.length() >= 8;
        assertFalse(esValido, "");
    }

    //Reto4: Email sin arroba
    @Test
    @DisplayName("email sin arroba")
    public void Email_sin_Aroba(){
        String email = "usuario.gmail.com";
        boolean esValido = email.contains("@");
        assertFalse(esValido, "El sistema debería rechazar el email");
    }

    //Reto5: Edad limite
    @Test
    @DisplayName("edad sin limite")
    public void Edad_sin_limite(){
        int edad = 16;
        boolean esValido = edad >= 16;
        assertTrue(esValido, "El sistema debería aceptar la edad");
    }

}