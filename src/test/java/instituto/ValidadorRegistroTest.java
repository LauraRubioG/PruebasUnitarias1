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
        assertFalse(esValido, "Error: El nombre debería estar vacio");
    }
    //Reto2: Password justa
    @Test
    @DisplayName("password justa")
    public void Password_Justa(){
        String password = "12345678";
        boolean esValido = password.length() >= 8;
        assertTrue(esValido, "Error: La contraseña debería tener una longitud de 8 o mas caracteres");
    }

    //Reto3: Password corta
    @Test
    @DisplayName("password corta")
    public void Password_corta(){
        String password = "Admin";
        boolean esValido = password.length() >= 8;
        assertFalse(esValido, "Error: La contraseña debería tener una longitud de menos de 8 caracteres");
    }

    //Reto4: Email sin arroba
    @Test
    @DisplayName("email sin arroba")
    public void Email_sin_Aroba(){
        String email = "usuario.gmail.com";
        boolean esValido = email.contains("@");
        assertFalse(esValido, "Error: El usuario no debe tener @");
    }

    //Reto5: Edad limite
    @Test
    @DisplayName("edad sin limite")
    public void Edad_sin_limite(){
        int edad = 16;
        boolean esValido = edad == 16;
        assertTrue(esValido, "Error: La edad solo deber ser igual a 16");
    }

}