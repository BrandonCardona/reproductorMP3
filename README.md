REPRODUCTOR MP3 POR MEDIO DE UNA LISTA DOBLEMENTE ENLAZADA
-
**Proyecto universitario presentado como trabajo final para el curso "Estructuras de Datos", en la Universidad Cooperativa de Colombia, año 2022**.
Consiste en un reproductor MP3 diseñado implementado por medio de una lista doblemente enlazada.
Permite realizar funciones como: <br>
- Reproducir, pausar, reiniciar una canción.
- Cambiar a la siguiente o anterior canción.
- Agregar una canción.
- Eliminar una canción.
- Reproducir una canción segun su posición en la lista.
- Listar todas las canciones disponibles en la lista.
  
<br>El proyecto fue diseñado principalmente para reforzar los conceptos de listas doblemente enlazadas. Sin embargo,
se puede utilizar sin ningún problema como un reproductor MP3 común.

TECNOLOGÍAS EMPLEADAS
-
- Java

¿CÓMO FUNCIONA?
-
Se empleó el concepto de Programación Orientada a Objetos y listas doblemente enlazadas para desarrollar un reproductor MP3.Así mismo, se emplearon forms para diseñar la interfaz 
gráfica del reproductor. De esta manera, las responsabilidades de los diferentes formularios son las siguiente: 

<br>**formReproductor:** Este formulario despliega la interfaz principal del reproductor. Permite realizar acciones como cambiar, reproducir, pausar o reiniciar la canción. Así mismo, 
permite acceder a los demás  formularios.
<br>**formLista:** Este formulario permite listar las canciones disponibles según  su orden en la lista doblemente enlazada. Así mismo, permite acceder al siguiente formulario.
<br>**formOpciones:** Este formulario permite agregar, eliminar o buscar una canción en la lista doblemente enlazada. 

¿CÓMO UTILIZAR EL PROYECTO?
-
Para utilizar correctamente el proyecto, es necesario seguir los siguientes pasos:
- Instalar un IDE (Integrated Development Environment) como Eclipse y el JDK (Java Development Kit).
- Importar el proyecto en el IDE.
- Dirigirse al paquete "interfaz" y abrir el archivo "ControladorReproductor.java"
- Ir a la linea 208 del archivo "ControladorReproductor.java" y cambiar la ruta de la variable "direccion" a la ruta que se encuentra dentro de la carpeta "Canciones" para 
  reproducir las canciones que vienen por defecto.
- Abrir el archivo "ReproductorMP3.java" dentro del paquete "interfaz"
- Ejecutar el archivo "ReproductorMP3.java"
