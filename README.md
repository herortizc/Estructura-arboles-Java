# Proyecto – Estructuras Arbóreas

## Universidad Da Vinci de Guatemala  
**Curso:** Estructuras de Datos  
**Proyecto:** Fichas Técnicas de Estructuras Arbóreas e Implementación de BST  

---

# 📌 FASE 1 – Fichas Técnicas

Se desarrollaron fichas técnicas académicas para las siguientes estructuras arbóreas:

- Árbol Binario de Búsqueda (BST)
- Árbol AVL
- Árbol B / B+
- Trie
- Heap (Montículo)

Cada ficha técnica incluye:

- Definición formal
- Fundamento teórico
- Análisis de complejidad (Big-O)
- Ventajas y limitaciones
- Aplicaciones en la industria
- Diagramas explicativos

El documento PDF consolidado se encuentra dentro del repositorio.

---

# 📌 FASE 2 – Implementación Práctica

Se implementó desde cero un Árbol Binario de Búsqueda (BST) en Java utilizando nodos y referencias, sin hacer uso de colecciones del API de Java.

La implementación respeta las reglas fundamentales del BST y permite inserción, búsqueda, eliminación y recorridos del árbol.

---

## 📂 Estructura del Proyecto
src/
├── Nodo.java
├── BST.java
└── Main.java

---

# 📌 Métodos Implementados

- `insert(int valor)`
- `search(int valor)`
- `delete(int valor)`
- `inOrder()`
- `preOrder()`
- `postOrder()`

La eliminación contempla los tres casos fundamentales:

1. Nodo hoja (sin hijos)
2. Nodo con un hijo
3. Nodo con dos hijos (reemplazo por sucesor in-order)

---

# 📌 Compilación

Desde la carpeta principal:

```bash
javac src/*.java
```

# 📌 Ejecución

```bash
java -cp src Main
```
# 📌 Complejidad Algorítmica
En promedio (árbol balanceado):

Búsqueda: O(log n)
Inserción: O(log n)
Eliminación: O(log n)

En el peor caso (árbol degenerado):

Todas las operaciones: O(n)

La eficiencia depende directamente de la altura del árbol.
Si el árbol mantiene una altura cercana a log(n), las operaciones son eficientes.
Si el árbol se degenera, su comportamiento se aproxima al de una lista enlazada.

# 📌 Video
Enlace al video explicativo
https://universidaddavincid-my.sharepoint.com/:v:/g/personal/herortizc_estudiante_udv_edu_gt/IQAEN4z_q5SZRb72XGLhxlpyAWVziaHk8ySKfhmno1IJMdY?e=8LUt6q

El video incluye:

Ejecución del programa
Inserción de valores
Explicación detallada del método delete
Justificación de la complejidad Big-O

# 📌 Autor

Nombre: Herberth Luis Ricardo Ortiz Cruz
Carrera: Ingeniería en Sistemas
Universidad Da Vinci de Guatemala
Año: 2026
