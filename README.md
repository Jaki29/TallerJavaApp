# Taller de Aplicaciones Móviles - Java

## Descripción del Proyecto
Este proyecto consiste en el desarrollo de una aplicación básica en Java sin el uso de un IDE, utilizando únicamente la línea de comandos. El programa permite ingresar datos de un vehículo y mostrarlos en pantalla.

Se utiliza el compilador `javac` y la ejecución mediante la Máquina Virtual de Java (JVM).

---

## Proceso de Compilación y Ejecución

1. Se crea el archivo fuente `AppVehiculo.java`
2. Se compila el código con el comando:

javac AppVehiculo.java

3. Se genera el archivo `AppVehiculo.class` (bytecode)
4. Se ejecuta el programa con:

java AppVehiculo

5. La JVM interpreta el bytecode y ejecuta el programa

---

## Relación con la JVM
La JVM (Java Virtual Machine) permite ejecutar el programa en cualquier sistema operativo, ya que interpreta el bytecode generado por el compilador.

Esto es fundamental en aplicaciones móviles, ya que permite que una aplicación funcione en distintos dispositivos.

---

## Requerimientos Funcionales

- El sistema debe permitir ingresar la marca del vehículo
- El sistema debe permitir ingresar el modelo
- El sistema debe permitir ingresar la cilindrada
- El sistema debe permitir ingresar el tipo de combustible
- El sistema debe permitir ingresar la cantidad de pasajeros
- El sistema debe mostrar los datos ingresados por el usuario

---

## Requerimientos No Funcionales

- El programa debe ejecutarse en consola
- Debe utilizar el lenguaje Java
- No debe utilizar un IDE
- Debe ser compilado con `javac`
- Debe ejecutarse mediante la JVM

---

## Historias de Usuario

**Historia 1:**
Como usuario, quiero ingresar los datos de un vehículo para visualizar la información en pantalla.

**Criterio de aceptación:**
- El sistema solicita todos los datos
- El sistema muestra correctamente la información ingresada

---

## Cronograma Inicial

- Día 1: Instalación de Java
- Día 2: Desarrollo del programa
- Día 3: Compilación y pruebas
- Día 4: Documentación en GitHub

---

## Código del Programa

El programa fue desarrollado en Java utilizando la clase Scanner para la entrada de datos por teclado.
