# Sistema de Gestión de Tiques - Mesa de Ayuda ("Consúltenos")

Este repositorio contiene el código fuente correspondiente al desarrollo de la aplicación de escritorio en Java para la Mesa de Ayuda de la consultora "Consúltenos", correspondiente al Sprint 1 de implementación.

### Equipo de Consultores Técnicos
* Edson Peralta
* Paolo Buston
* Marcos Jopia
* Jhonatan Cardenas
* Cristofer Tito

---

## Arquitectura del Proyecto

El sistema está desarrollado bajo el modelo de N-Capas, estructurado en los siguientes paquetes dentro del entorno de desarrollo:
* **`presentacion`**: Interfaces gráficas de usuario construidas de forma nativa con Java Swing.
* **`logica`**: Reglas de negocio y algoritmos corporativos (ej. validación matemática de RUT chileno).
* **`modelo`**: Entidades del sistema (Usuarios, Clientes, Tiques).
* **`acceso_datos`**: Clases DAO y gestión de la conexión al motor de base de datos MySQL mediante la API JDBC.

---

## Requisitos del Entorno

Para compilar y ejecutar este proyecto de forma local, cada desarrollador del equipo técnico debe provisionar su estación de trabajo con:
1. **JDK 17 LTS**: Entorno de ejecución y compilación base por su estabilidad a largo plazo.
2. **Apache NetBeans (18 o superior)**: Como IDE oficial para la integración del proyecto.
3. **XAMPP / MySQL Server 8.0**: Para alojar la base de datos relacional en el puerto local `3306`.
4. **MySQL Connector/J**: Driver JDBC (archivo `.jar`) requerido para la comunicación de red con la base de datos.

---

## Instrucciones de Despliegue Local

**Paso 1: Clonar el repositorio**
Abra la terminal en su directorio de trabajo local y ejecute:
`git clone [URL_DEL_REPOSITORIO_AQUI]`

**Paso 2: Configurar la Base de Datos**
1. Inicie el servicio de MySQL en su servidor local (ej. a través del panel de XAMPP).
2. Utilice un cliente SQL (ej. DBeaver) para ejecutar el script `script_creacion.sql` (ubicado en el directorio `database/`). Esto aprovisionará la base de datos `db_consultenos` y sus tablas relacionales.

**Paso 3: Configurar el Entorno de Desarrollo (NetBeans)**
1. Abra Apache NetBeans e importe el proyecto `SistemaConsultenos`.
2. **Importante:** Navegue al directorio *Libraries* del proyecto, haga clic derecho -> *Add JAR/Folder...* y vincule su binario local `mysql-connector-j-X.X.X.jar`. La omisión de este paso resultará en un fallo crítico de conexión (ClassNotFoundException).
3. Ejecute el archivo `Main.java` (Shift + F6) para realizar la prueba de humo y verificar en la consola de salida que el enlace con MySQL es exitoso.