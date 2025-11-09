**_<h1 align="center">:vulcan_salute: Proyecto Libreria Online - Realizado con Andoid Studio :computer:</h1>_**

**<h3>:blue_book: Contexto de la Actividad:</h3>**

<p>Imagina que trabajas como desarrollador de aplicaciones móviles en una empresa de tecnología que está creando una app para una librería online.</p>
<p>La app debe permitir a los usuarios explorar libros, agregar libros a su carrito de compras, ver detalles de cada libro y navegar entre distintas categorías.</p>
<p>La empresa te ha asignado la tarea de desarrollar una primera versión de la interfaz de usuario de la app, que debe ser intuitiva, fácil de usar y visualmente atractiva</p>
<p>A través de esta evaluación, se pondrán en práctica tus conocimientos sobre las herramientas, elementos de la interfaz y buenas prácticas de desarrollo en Android.</p>

**<h3>:orange_book: Requerimiento:</h3>**

Dividido en dos partes, una teorica en [INFORME.md](./INFORME.md) y una práctica

1. [Establecer el Contexto del Proyecto:](./INFORME.md)
- <b>Pregunta teórica:</b> Explica las principales tecnologías y herramientas que se utilizan en el desarrollo de aplicaciones móviles Android. Menciona al menos tres tecnologías o herramientas clave y describe brevemente su función dentro del proceso de desarrollo.

2. [Entorno de Desarrollo Android:](./INFORME.md)
- <b>Pregunta práctica:</b> Describe cómo configurar un nuevo proyecto en Android Studio para una aplicación nativa, mencionando al menos tres configuraciones iniciales esenciales (como el tipo de proyecto, versión mínima de Android, etc.).

3. [Elementos de Configuración del Proyecto:](./INFORME.md)
- <b>Pregunta práctica:</b> Explica cómo manejar los assets dentro de un proyecto Android, como imágenes, fuentes y otros recursos, y por qué es importante optimizar su uso en la aplicación.

4. Implementación de Elementos Básicos de Interfaz de Usuario:
- <b>Tarea práctica:</b> Utilizando Android Studio, diseña un prototipo de la pantalla principal de la aplicación de la librería online. La pantalla debe incluir los siguientes elementos:
    - Un <b>RecyclerView</b> que muestre una lista de libros.
    - Un <b>ImageView</b> para mostrar la portada del libro.
    - Un <b>TextView</b> con el título del libro y una breve descripción.
    - Un <b>Button</b> que permita agregar el libro al carrito.
- Asegúrate de utilizar los elementos básicos del entorno Android de forma adecuada, respetando las guías de diseño para aplicaciones móviles.

5. Elementos de Navegación e Interacción:
- <b>Tarea práctica:</b>
    - Implementa una barra de navegación que permita a los usuarios ir de la pantalla principal (lista de libros) a una pantalla de detalles del libro seleccionado.
    - Utiliza un <b>Intent</b> para el cambio de actividades, pasando los datos del libro seleccionado (por ejemplo, título y descripción) a la nueva actividad.

6. [Gestión del Código Fuente con GitHub:](./INFORME.md)
- <b>Tarea práctica:</b> Crea un repositorio en GitHub para el proyecto y sube tu código fuente. Asegúrate de organizar el proyecto de forma clara y documentada, permitiendo el trabajo concurrente y la fácil colaboración con otros desarrolladores. Describe brevemente cómo gestionaste el código fuente, las ramas utilizadas y cualquier práctica que hayas seguido para mantener el repositorio seguro.


**<h3>📁 Estructura del Proyecto Android:</h3>**

```Android
📘 README.md
📁 app
├── 📁 manifest
│   └── 🟧 AndroidManifest.xml
├── 📁 java
│   ├── 📁 com.example.libreriaapp
│   │   ├── 🟦 Book.java
│   │   ├── 🟦 BookAdapter.java
│   │   ├── 🟦 BookDetailActivity.java
│   │   ├── 🟦 CartActivity.java
│   │   ├── 🟦 CartAdapter.java
│   │   ├── 🟦 CartManager.java
│   │   └── 🟦 MainActivity.java
│   ├── 📁 com.example.libreriaapp (android Test)
│   │   └── 🟦 ExampleInstrumentedTest.java
│   └── 📁 com.example.libreriaapp (test)
│       └── 🟦 ExampleUnitTest.java
├── 📁 java (generated)
├── 📁 res
│   ├── 📁 drawable
│   │   │    ├── 🖼️ aplicacion_libreria.jpg
│   │   │    ├── 🖼️ book1.jpg
│   │   │    ├── 🖼️ book2.jpg
│   │   │    ├── 🖼️ book3.jpg
│   │   │    ├── 🖼️ libreria_emulador.png
│   │   │    ├── 🟧 ic_launcher_background.xml
│   │   │    └── 🟧 ic_launcher_foreground.xml
│   ├── 📁 layout
│   │   ├── 📁 activity_book_detail.xml
│   │   ├── 📁 activity_cart.xml
│   │   ├── 📁 activity_main.xml
│   │   ├── 📁 item_book.xml
│   │   └── 📁 item_cart.xml
│   ├── 📁 mipmap
│   │   ├── 📁 ic_launcher
│   │   └── 📁 ic_launcher_round
│   ├── 📁 values
│   │   ├── 📁themes
│   │   │   ├── 🟧 themes.xml
│   │   │   └── 🟧 themes.xml (night)
│   │   ├── 🟧 colors.xml
│   │   └── 🟧 strings.xml
│   └── 📁 xml
📁 Gradle Scripts
├── 🟦 build.gradle.kts (Project: LibreriaApp)
├── 🟦 build.gradle.kts (Module: app)
├── 🟦 proguard-rules.pro (ProGuard rules for ":app")
├── 🟦 gradle.properties (Project properties)
├── 🟦 gradle-wrapper.properties (Gradle Version)
├── 🟦 libs.versions.toml (version Catalog "libs")
├── 🟦 local.properties (SDK Location)
└── 🟦 settings.gradle.kts (Project Settings)
```

**<h3>:orange_book: Como ejecutar el proyecto:</h3>**

1. Para ejecutar el proyecto puede clonar el repositorio, para luego compilar y ejecutar el proyecto  en Android Studio.
2. Otra opción es descargar y ejecutar la [APK](./app-debug-libreriaapp.apk)

**<h3>:book: Imagen general del proyecto:</h3>**

<img src="./app/src/main/res/drawable/aplicacion_libreria.jpg" alt="Proyecto Vista General" style="width: 80%;">

**<h3>:book: Capturas de pantalla de la interfaz de usuario final:</h3>**

<img src="./app/src/main/res/drawable/libreria_emulador.png" alt="Vista Celular" style="width: 40%;">
