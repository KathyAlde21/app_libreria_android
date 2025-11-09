**_<h1 align="center">:vulcan_salute: Informe Proyecto Libreria Online :computer:</h1>_**

**<h3>:blue_book: Contexto de la Actividad:</h3>**

<p>magina que trabajas como desarrollador de aplicaciones móviles en una empresa de tecnología que está creando una app para una librería online.</p>
<p>La app debe permitir a los usuarios explorar libros, agregar libros a su carrito de compras, ver detalles de cada libro y navegar entre distintas categorías.</p>
<p>La empresa te ha asignado la tarea de desarrollar una primera versión de la interfaz de usuario de la app, que debe ser intuitiva, fácil de usar y visualmente atractiva</p>
<p>A través de esta evaluación, se pondrán en práctica tus conocimientos sobre las herramientas, elementos de la interfaz y buenas prácticas de desarrollo en Android.</p>

<!-- ---------------------------------------------------------------------------------- -->
**<h3>:orange_book: Requerimiento:</h3>**

<p>Dividido en dos partes, una teorica y una práctica</p>
<!-- ---------------------------------------------------------------------------------- -->
1. Establecer el Contexto del Proyecto:
- <b>Pregunta teórica:</b> Explica las principales tecnologías y herramientas que se utilizan en el desarrollo de aplicaciones móviles Android. Menciona al menos tres tecnologías o herramientas clave y describe brevemente su función dentro del proceso de desarrollo.

🧩 Respuesta:
En el desarrollo de aplicaciones móviles Android se utilizan diversas tecnologías y herramientas que permiten construir, probar y mantener las apps de manera eficiente.
Entre las más importantes se encuentran:

1. 🧠 Android Studio: Es el entorno de desarrollo integrado (IDE) oficial para Android. Permite programar, depurar, diseñar interfaces y empaquetar la aplicación en un solo entorno. Incluye emulador, soporte para control de versiones y manejo automático de dependencias con Gradle.

2. 💬 Kotlin: Es el lenguaje de programación moderno recomendado por Google para Android. Se destaca por su sintaxis clara, seguridad ante errores comunes y compatibilidad total con Java, lo que facilita mantener proyectos existentes.

3. 🎨 XML: Es el lenguaje utilizado para definir la estructura visual de la interfaz de usuario, separando el diseño (layouts) del código lógico de la aplicación.

4. ⚙️ Gradle: Es el sistema de compilación que automatiza la construcción del proyecto, gestiona dependencias y genera distintas versiones de la app (debug, release, etc.).

<!-- ---------------------------------------------------------------------------------- -->
<hr style="border: none; height: 2px; background-color: blue; width: 80%;">

2. Entorno de Desarrollo Android:
- <b>Pregunta práctica:</b> Describe cómo configurar un nuevo proyecto en Android Studio para una aplicación nativa, mencionando al menos tres configuraciones iniciales esenciales (como el tipo de proyecto, versión mínima de Android, etc.).

🧩 Respuesta:
Para configurar un nuevo proyecto en Android Studio y crear una aplicación nativa, se deben definir varios parámetros iniciales que determinan su estructura y compatibilidad.
Entre los más importantes están:

1. ⚙️ Tipo de proyecto: Al crear un nuevo proyecto, se elige una plantilla inicial, como Empty Activity o Basic Activity. La opción Empty Activity permite comenzar desde cero, agregando la interfaz y lógica de manera personalizada.

2. 📱 Versión mínima de Android (minSdkVersion): Define la versión más baja del sistema operativo Android que puede ejecutar la aplicación. Por ejemplo, establecer API 24 (Android 7.0) asegura compatibilidad con la mayoría de los dispositivos actuales.

3. 🔤 Lenguaje y nombre del paquete: Se selecciona Kotlin como lenguaje de desarrollo (recomendado por Google) y se define un nombre de paquete único, por ejemplo com.example.libreria_online, que identifica la aplicación en el sistema y en Google Play.

4. 📂 Ubicación y nombre del proyecto: Se define la carpeta donde se almacenará el código y el nombre visible de la app, que será el que aparezca en el dispositivo del usuario.

<!-- ---------------------------------------------------------------------------------- -->
<hr style="border: none; height: 2px; background-color: blue; width: 80%;">

3. Elementos de Configuración del Proyecto:
- <b>Pregunta práctica:</b> Explica cómo manejar los assets dentro de un proyecto Android, como imágenes, fuentes y otros recursos, y por qué es importante optimizar su uso en la aplicación.

🧩 Respuesta:
En Android Studio, los assets y recursos (como imágenes, fuentes, íconos y archivos multimedia) se organizan dentro de la carpeta res/ del proyecto y cumplen un rol fundamental en la presentación y rendimiento de la aplicación.
Su correcta gestión asegura una experiencia fluida y profesional para el usuario.

1. 🖼️ Imágenes (carpeta drawable/):
Aquí se almacenan las imágenes en distintos tamaños (mdpi, hdpi, xhdpi, xxhdpi, etc.) para que la app se vea bien en cualquier resolución de pantalla.
Es recomendable optimizar las imágenes reduciendo su peso sin perder calidad y utilizar formatos modernos como WebP.

2. 🔤 Fuentes personalizadas (carpeta font/):
Permiten aplicar tipografías específicas en los textos de la app. Se agregan en res/font/ y se referencian desde XML o código Kotlin.
Esto mejora la identidad visual y coherencia de marca sin afectar el rendimiento.

3. 🎵 Otros recursos (carpeta assets/):
Aquí se guardan archivos adicionales (por ejemplo, audios, documentos o JSON) que no son procesados automáticamente por Android. Se accede a ellos mediante la clase AssetManager.

4. ⚙️ Optimización y buenas prácticas:
Es importante evitar recursos duplicados, comprimir los archivos y utilizar nombres descriptivos. Una gestión eficiente de assets reduce el tamaño del APK, mejora la carga y evita errores al compilar o desplegar la aplicación.

<!-- ---------------------------------------------------------------------------------- -->
<hr style="border: none; height: 2px; background-color: blue; width: 80%;">

Preguntas 4 y 5 forman parte del desarrollo práctico del proyecto en Android Studio.

<!-- ---------------------------------------------------------------------------------- -->
<hr style="border: none; height: 2px; background-color: blue; width: 80%;">

6. Gestión del Código Fuente con GitHub:
- <b>Tarea práctica:</b> Crea un repositorio en GitHub para el proyecto y sube tu código fuente. Asegúrate de organizar el proyecto de forma clara y documentada, permitiendo el trabajo concurrente y la fácil colaboración con otros desarrolladores. Describe brevemente cómo gestionaste el código fuente, las ramas utilizadas y cualquier práctica que hayas seguido para mantener el repositorio seguro.

🧩 Respuesta:
- Para gestionar el código fuente del proyecto libreria_online, se utilizó GitHub como plataforma principal de control de versiones y colaboración.
- Este entorno permite mantener un historial completo de cambios, coordinar el trabajo entre diferentes desarrolladores y asegurar la integridad del proyecto.

1. 🌐 Creación del repositorio:
- Se creó un nuevo repositorio en GitHub con el nombre <b>libreria_online</b>, donde se alojaron los archivos del proyecto Android Studio.
- El repositorio incluye el <b>código fuente</b>, el archivo <b>README.md</b> con la documentación, <b>INFORME.md</b> con respuestas que forman parte del informe a entregar por el proyecto y el archivo <b>.gitignore</b> configurado para excluir carpetas innecesarias como /build o /app/.gradle.

2. 🌿 Ramas de desarrollo:
- Se trabajó en la rama principal master para la versión, en esta oportunidad no se realizaron ramas secundarias.

3. 🔐 Buenas prácticas y seguridad:
- Se evitó subir información sensible como claves o archivos .env.
- Se utilizaron commits descriptivos para facilitar la comprensión del historial de cambios.
- Se documentó el proceso en el README.md para que cualquier colaborador pueda clonar, compilar y ejecutar el proyecto fácilmente.

4. 🚀 Publicación y colaboración:
- Una vez completado el desarrollo, se verificó que el repositorio fuera público y accesible.
- En README.md se añadiendo el enlace directo e este informe para complementar los requerimientos del proyecto.