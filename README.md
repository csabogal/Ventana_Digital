# Ventana Digital: Catálogo Interactivo y Multimedia 📱

![Android Version](https://img.shields.io/badge/API-24%2B-brightgreen.svg?style=flat)
![Language](https://img.shields.io/badge/Language-Kotlin-blue.svg)
![License](https://img.shields.io/badge/License-MIT-lightgrey.svg)

## 📄 Descripción del Proyecto

**Ventana Digital** es una aplicación móvil nativa para Android, desarrollada como proyecto final para la materia de Herramientas de Programación Móvil I en el Politécnico Grancolombiano. La aplicación funciona como un catálogo de productos interactivo, diseñado para ofrecer una experiencia de usuario rica e inmersiva a través de una arquitectura moderna y contenido multimedia.

El núcleo de la aplicación se basa en un patrón de diseño **maestro-detalle**, utilizando una única `Activity` que gestiona múltiples `Fragments`. Esta estructura permite una navegación fluida y una interfaz de usuario limpia que se adapta bien a diferentes factores de forma.

---

## ✨ Características Principales

- **Arquitectura Moderna:** Implementación con una `Single-Activity` y múltiples `Fragments` para una gestión eficiente del ciclo de vida y la navegación.
- **Lenguaje Moderno:** Desarrollado 100% en **Kotlin**, el lenguaje oficial recomendado por Google para Android.
- **Prácticas Recomendadas:** Uso de **View Binding** para una vinculación segura y eficiente entre los layouts XML y la lógica de código.
- **Navegación Intuitiva:** Un panel de menú persistente permite al usuario cambiar fácilmente entre las diferentes secciones del catálogo.
- **Contenido Dinámico:** El área de contenido se actualiza dinámicamente para mostrar la sección seleccionada.
- **Soporte Multimedia:** Integración de componentes para visualizar imágenes, reproducir video y navegar por páginas web.

---

## 🛠️ Módulos Implementados

La aplicación está dividida en los siguientes módulos funcionales, cada uno implementado como un `Fragment` independiente:

1.  **👤 Perfil:** Muestra información estática sobre el vendedor o la empresa, incluyendo una foto y texto descriptivo.
2.  **🖼️ Galería de Fotos:** Presenta una lista vertical de imágenes de productos. Al hacer clic en una imagen, se muestra una descripción a través de un mensaje Toast.
3.  **🎬 Video:** Incorpora un reproductor de video (`VideoView`) para mostrar contenido audiovisual con controles de reproducción.
4.  **🌐 Web:** Contiene un navegador embebido (`WebView`) que permite al usuario cargar y visualizar una página web externa introduciendo su URL.
5.  **🔘 Botones:** Una sección de demostración que muestra la implementación de botones y la gestión de sus eventos de clic.

---

## 🚀 Cómo Ejecutar el Proyecto

1.  **Clonar el repositorio:**
    ```bash
    git clone https://github.com/csabogal/Ventana_Digital.git
    ```
2.  **Abrir en Android Studio:**
    - Abre Android Studio.
    - Selecciona `Open an existing Project`.
    - Navega a la carpeta donde clonaste el repositorio y selecciónala.
3.  **Sincronizar Gradle:** Espera a que Android Studio sincronice y descargue todas las dependencias necesarias.
4.  **Ejecutar la aplicación:**
    - Selecciona un emulador o conecta un dispositivo físico.
    - Haz clic en el botón `Run 'app'` (▶️).

---

## 📦 APK de Instalación

El archivo de instalación de la aplicación (`ventana_digital.apk`) se encuentra en la raíz de este repositorio para facilitar las pruebas directas en un dispositivo Android.

---

## 👨‍💻 Autores

- **Grupo 11** - _Estudiantes de Ingeniería de Software_
- Politécnico Grancolombiano
