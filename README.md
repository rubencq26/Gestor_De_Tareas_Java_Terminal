# Java Task Manager (CLI) 🚀

Proyecto personal para practicar **Java funcional** y persistencia de datos. El objetivo era crear un gestor de tareas que no perdiera los datos al cerrar la consola, separando las responsabilidades del código según estándares de ingeniería.

## 🛠️ Tecnologías y Conceptos
* **Java 17** y **Maven** para la gestión de dependencias.
* **Jackson Databind**: Serialización de objetos Java a **JSON** (estándar de la industria).
* **Colecciones (HashMap)**: Implementación de almacenamiento en memoria con acceso de complejidad $O(1)$.
* **Arquitectura por capas**: Separación lógica en paquetes (`model`, `service`, `util`, `ui`).

## 📂 Estructura del Código
* `model`: Clase `Task` (POJO) con soporte para serialización.
* `service`: `GestorTareas`. Maneja la lógica de negocio y el estado de la aplicación.
* `util`: `JsonUtil`. Abstracción de la persistencia de archivos.
* `ui`: `TerminalGrafica`. Interfaz de línea de comandos con manejo de búfer de `Scanner`.

## 🚀 Cómo probarlo
1. Clonar el repositorio.
2. Importar en IntelliJ IDEA como proyecto Maven.
3. Ejecutar la clase `Main`.
4. Los datos se guardarán automáticamente en `tasks.json` en la raíz del proyecto.

---
**Autor:** Rubén Conde - Estudiante de 3º de Ingeniería Informática (Computación) en la UHU.
