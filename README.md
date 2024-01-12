# Peluqueria-Canina
Proyecto realizado en Java aplicando los conocimientos adquiridos.
## Tecnologías utilizadas:
* _Java._
* _JDK20._
* _Java Swing._
* _MySQL._
* _IDE: Apache NetBeans 19._

## Funcionamiento:
* Panel Principal:
  _Desde este panel se puede escoger lo que se desea realizar, desde realizar un nuevo registro, realizar una busqueda de usuarios       
   regitrados o salir del programa_
  ![image](https://github.com/MarioAvilacs/Peluqueria-Canina/assets/150724904/fdf3b4a4-b21d-4cb3-8080-d1c1f5ae8f07)
 * Panel de Registro:
   _Desde este panel, se podran dar de alta todos los clientes nuevos, esto se realizará al cabo de pedir información para identificar cada cliente con su nombre, color, raza, etc._
   ![image](https://github.com/MarioAvilacs/Peluqueria-Canina/assets/150724904/912333ab-9240-4739-804f-acf277f7a525)
* Elementos guardados en la BD:
  _Se utilizo una estrategia de generación de ID secuencial para que los dueños y las mascotas pudieran estar relacionados entre sí._
  * Tabla Dueño
 ![image](https://github.com/MarioAvilacs/Peluqueria-Canina/assets/150724904/3c58cc44-c877-4906-9ca0-32cbe6774667)

  * Tabla Mascota
![image](https://github.com/MarioAvilacs/Peluqueria-Canina/assets/150724904/bae128e2-de08-49d8-b719-158fc56263dc)
 
* Panel de Consultas:
  _En este panel, se pueden visualizar todas los registros realizados anteriormente, donde también se da la opción de poder eliminar o editar algun registro ya existente_
  * Eliminación.
    ![image](https://github.com/MarioAvilacs/Peluqueria-Canina/assets/150724904/5443851b-1331-4d12-af02-dcb85ca2fad5)
  * Al eliminar en el programa, se elimina desde la BD.
    ![image](https://github.com/MarioAvilacs/Peluqueria-Canina/assets/150724904/fde4b22b-6278-400f-ab34-017131b00992)
  * Edición.
    _Al seleccionar el boton de editar, se habre una nuevo panel donde contiene los datos ya registrados y así poder editar lo que se ocupe._
    ![image](https://github.com/MarioAvilacs/Peluqueria-Canina/assets/150724904/d7206939-e314-400f-8726-1ef281a15b75)
    _En este caso, editamos el color del cliente, de café a blanco, cuando se termina de hacer los cambios, se cierra la ventana y se redirecciona al panel de consultas, mostrando ya los cambios._
    ![image](https://github.com/MarioAvilacs/Peluqueria-Canina/assets/150724904/3ae98a5e-fecd-4d00-862f-dfeab831d341)
  * Visto desde la BD.
    ![image](https://github.com/MarioAvilacs/Peluqueria-Canina/assets/150724904/069c708b-6963-4294-8375-6159f9c1b6cf)
