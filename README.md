# Visor de Imágenes - Aplicación MVP

## Descripción

Se trata de una aplicación diseñada para mostrar imágenes en pantalla, permitiendo a los usuarios navegar de manera rápida entre las imágenes, ya sea avanzando a la siguiente o retrocediendo a la anterior. Este proyecto sigue el modelo arquitectónico Modelo-Vista-Presentador (MVP).

## Diagrama de Clases

El diagrama de clases representa la estructura del Visor de Imágenes (MVP), destacando las relaciones y responsabilidades de cada componente.

![ImageViewer-UML-Diagram](https://github.com/JericoLuzardoMiranda/IS2-ImageViewer/blob/dbec02192b6b92da403de09672621a5651a57390/ImageViewer-UML-Diagram.jpg)

### Comentarios

1. **Clase 'Modelo':** Se representa los datos relacionados con la manipulación de imágenes, es decir, contiene métodos para cargar, gestionar y manipular las imágenes.
2. **Clase 'Vista':** Es el responsable de presentar las imágenes en la interfaz de usuario. Se encarga de cambiar a la siguiente o anterior imagen.
3. **Clase 'Presentador':** Es el intermediario entre el modelo y la vista.

## Capturas de Interfaz

A continuación, se muestran capturas de pantalla de la interfaz de usuario del Visor de Imágenes, destacando las opciones de navegación:

1. Pantalla principal con la primera imagen cargada:

   ![mainImage](https://github.com/JericoLuzardoMiranda/IS2-ImageViewer/blob/dbec02192b6b92da403de09672621a5651a57390/screenshot/mainImage.png)

2. Navegación a la siguiente imagen:

   ![nextImage](https://github.com/JericoLuzardoMiranda/IS2-ImageViewer/blob/dbec02192b6b92da403de09672621a5651a57390/screenshot/nextImage.png)

3. Navegación a la imagen anterior:

   ![previousImage](https://github.com/JericoLuzardoMiranda/IS2-ImageViewer/blob/dbec02192b6b92da403de09672621a5651a57390/screenshot/previousImage.png)
