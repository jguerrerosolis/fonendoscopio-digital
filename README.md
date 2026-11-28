# Práctica Backend y Frontend - Fonendoscopio Digital

Repositorio para la práctica de la asignatura de desarrollo web con Spring Boot y Thymeleaf.

## Grupo I
- Javier Guerrero Solís
- María Jesús Jiménez González
- Alicia Jiménez Teruel

## Qué hace el proyecto
Es una aplicación web básica para gestionar mediciones de un fonendoscopio digital. Permite guardar los datos de los pacientes (frecuencia cardíaca, calidad técnica, expansión torácica, etc.) usando una base de datos H2 en archivo y verlos a través de una interfaz web con Thymeleaf.


## Cómo usar la aplicación
1. Clona el repositorio en tu ordenador.
2. Abrir el proyecto en tu editor.
3. Ejecuta la clase principal `FonendoscopioDigitalApplication.java` como aplicación de Spring Boot.
4. Entra en el navegador en: `http://localhost:8080/`

## Base de datos (H2)
Para ver la base de datos por dentro mientras corre la app:
- **URL:** `http://localhost:8080/h2`
- **JDBC URL:** `jdbc:h2:file:./database`
- **Usuario:** `sa`
- **Contraseña:** *(vacía)*