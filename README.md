# 🧙 Ordenamiento-Búsqueda

# Descripción
Este proyecto es un juego interactivo en Java donde el usuario debe adivinar una clave mágica de 4 dígitos generada aleatoriamente. La aplicación genera una lista de 1000 números aleatorios, ordena esta lista usando dos algoritmos (QuickSort y MergeSort) y luego permite al usuario buscar la clave mediante búsqueda binaria.

Al adivinar correctamente, el usuario recibe un mensaje secreto aleatorio. La aplicación también mide y muestra los tiempos de ejecución de los algoritmos.

## 🧠 Objetivos del Proyecto

Este proyecto tiene como finalidad reforzar conceptos fundamentales de algoritmos, específicamente:

1. Comprender e implementar algoritmos de ordenamiento eficientes, como **QuickSort** y **MergeSort**.
2. Aplicar el algoritmo de **búsqueda binaria** sobre datos previamente ordenados.
3. Evaluar la **complejidad algorítmica (Big O)** de los algoritmos utilizados.

## ⚙️ Tecnologías Utilizadas

- Lenguaje: **Java**
- Entorno de desarrollo sugerido: **IntelliJ IDEA** o cualquier IDE compatible con Java
- Versión recomendada: **JDK 17 o superior**
## Funcionalidades principales

- Generación de números aleatorios.
- Ordenamiento usando **QuickSort** y **MergeSort**.
- Búsqueda binaria para encontrar la clave.
- Mensajes secretos aleatorios al acertar.
- Medición y reporte de tiempos de ejecución.
- Interfaz gráfica básica con `JOptionPane`.

## 📁 Estructura del Proyecto

```
Ordenamiento-Busqueda/
├── src/
│   ├── BusquedaBinaria.java       # Implementación de búsqueda binaria
│   ├── GeneradorNumeros.java      # Generador de listas de números aleatorios
│   ├── Main.java                  # Clase principal con menú y ejecución general
│   ├── Mensajes.java              # Mensajes auxiliares de la interfaz por consola
│   ├── MergeSort.java             # Algoritmo de ordenamiento MergeSort
│   └── QuickSort.java             # Algoritmo de ordenamiento QuickSort
└── README.md
```

## ✅ Requisitos para Ejecutar

- Tener instalado **Java JDK 17** o superior
- Editor o IDE como **IntelliJ IDEA**, **Eclipse**, o uso de terminal/console

## ▶️ Instrucciones de Ejecución

1. Clona el repositorio:

   ```bash
   git clone https://github.com/judsther/ordenamiento-busqueda.git
   ```

2. Compila los archivos desde la terminal (desde la carpeta `src`):

   ```bash
   javac *.java
   ```

3. Ejecuta el programa principal:

   ```bash
   java Main
   ```

## 📊 Complejidad Algorítmica

| Algoritmo        | Mejor caso | Promedio   | Peor caso   |
|------------------|------------|------------|-------------|
| QuickSort        | O(n log n) | O(n log n) | O(n²)       |
| MergeSort        | O(n log n) | O(n log n) | O(n log n)  |
| Búsqueda Binaria | O(1)       | O(log n)   | O(log n)    |

## 🧪 Ejemplos de Uso

### Ejemplo 1: Ordenamiento

| Entrada                              | Algoritmo   | Salida ordenada                    |
|--------------------------------------|-------------|------------------------------------|
| Lista generada: `[12, 4, 9, 1, 30]`  | QuickSort   | `[1, 4, 9, 12, 30]`                |
| Lista generada: `[22, 7, 5, 10, 3]`  | MergeSort   | `[3, 5, 7, 10, 22]`                |

### Ejemplo 2: Búsqueda Binaria

| Lista ordenada         | Valor buscado | Resultado            |
|------------------------|---------------|-----------------------|
| `[1, 4, 9, 12, 30]`     | `9`           | Valor encontrado en posición 2 |
| `[3, 5, 7, 10, 22]`     | `15`          | Valor no encontrado            |

### Flujo del programa

1. Se genera una lista aleatoria de números enteros.
2. El sistema muestra la lista ordenada.
3. El usuario introduce un número para buscar.
4. El sistema realiza la búsqueda binaria e informa si el valor fue encontrado.

## 📄 Licencia

Este proyecto es de uso académico. Puedes modificarlo y adaptarlo según tus necesidades educativas.
