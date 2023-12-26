# Visor de Imágenes - Aplicación MVP

## Descripción

Se trata de una aplicación diseñada para mostrar imágenes en pantalla, permitiendo a los usuarios navegar de manera rápida entre las imágenes, ya sea avanzando a la siguiente o retrocediendo a la anterior. Este proyecto sigue el modelo arquitectónico Modelo-Vista-Presentador (MVP).

## Diagrama de Clases

El diagrama de clases representa la estructura del Visor de Imágenes (MVP), destacando las relaciones y responsabilidades de cada componente.

![ImageViewer-UML-Diagram](https://github.com/JericoLuzardoMiranda/IS2-ImageViewer/blob/0c890a72387b2a1093b65f11e06b624f8c57a30b/ImageViewer-UML-Diagram.jpg)

### Comentarios

1. **Clase 'Modelo':** Se representa los datos relacionados con la manipulación de imágenes, es decir, contiene métodos para cargar, gestionar y manipular las imágenes.
2. **Clase 'Vista':** Es el responsable de presentar las imágenes en la interfaz de usuario. Se encarga de cambiar a la siguiente o anterior imagen.
3. **Clase 'Presentador':** Es el intermediario entre el modelo y la vista.

## Capturas de Interfaz

A continuación, se muestran capturas de pantalla de la interfaz de usuario del Visor de Imágenes, destacando las opciones de navegación:

### Pantalla principal con la primera imagen cargada

| **Versión 1 & 2** | **Versión 3** |
|:------------------:|:-------------:|
|![mainImage](https://github.com/JericoLuzardoMiranda/IS2-ImageViewer/blob/dbec02192b6b92da403de09672621a5651a57390/screenshot/mainImage.png) | ![mainImageVersion3](https://github.com/JericoLuzardoMiranda/IS2-ImageViewer/blob/0c890a72387b2a1093b65f11e06b624f8c57a30b/screenshot/mainImageVersion3.png) |

### Navegación a la siguiente imagen

| **Versión 1 & 2** | **Versión 3** |
|:------------------:|:-------------:|
| ![nextImage](https://github.com/JericoLuzardoMiranda/IS2-ImageViewer/blob/dbec02192b6b92da403de09672621a5651a57390/screenshot/nextImage.png) | ![nextImageVersion3](https://github.com/JericoLuzardoMiranda/IS2-ImageViewer/blob/0c890a72387b2a1093b65f11e06b624f8c57a30b/screenshot/nextImageVersion3.png) |

### Navegación a la imagen anterior

| **Versión 1 & 2** | **Versión 3** |
|:------------------:|:-------------:|
| ![previousImage](https://github.com/JericoLuzardoMiranda/IS2-ImageViewer/blob/dbec02192b6b92da403de09672621a5651a57390/screenshot/previousImage.png) | ![previousImageVersion3](https://github.com/JericoLuzardoMiranda/IS2-ImageViewer/blob/0c890a72387b2a1093b65f11e06b624f8c57a30b/screenshot/previousImageVersion3.png) |

### Comentarios

**Con respecto a la versión 3:**
1. Se ha implementado la visualización de imágenes con un amplio zoom, ocupando toda la pantalla en modo de pantalla completa.
2. Se ha añadido más imágenes de distintos lugares para poder expandir este proyecto.
3. Los botones han sido colocados en modo vertical en lugar del modo horizontal.
4. Se ha añadido una nueva funcionalidad: **Desplazamiento con el cursor del mouse**.
   - **¿Cómo funciona el desplazamiento con el cursor del mouse?**
   - Usando presionando y arrastrando, es decir, al mantener presionado el botón del mouse y arrastra hacia la izquierda o derecha, se empieza a cambiar o desplazar la imagen anterior o la siguiente imagen.

### Demostración de la Interfaz

![GIF1](https://github.com/JericoLuzardoMiranda/IS2-ImageViewer/blob/0c890a72387b2a1093b65f11e06b624f8c57a30b/screenshot/GIF1.gif)

Se presenta la vista previa de la interfaz en acción, teniendo la oportunidad de observar cómo funciona el Visor de Imágenes en tiempo real.
