#  Pizza-Track

##  Descripción

**Pizza-Track** es una aplicación desarrollada en **Java** para gestionar los pedidos de una pizzería mediante el uso de **pilas implementadas manualmente con nodos y listas enlazadas**.

El programa permite registrar pizzas y realizar las operaciones de **Deshacer (Undo)** y **Rehacer (Redo)**.


##  Objetivo

El objetivo del proyecto es aplicar el funcionamiento de una estructura de datos tipo **Pila (Stack)** utilizando una implementación manual, sin utilizar `java.util.Stack`.

La aplicación utiliza dos pilas:

* **Pila principal:** almacena los pedidos activos.
* **Pila secundaria:** almacena temporalmente los pedidos que fueron deshechos para poder recuperarlos mediante Redo.



##  Funcionalidades

El programa cuenta con las siguientes opciones:

1. **Registrar Pizza**

   * Permite ingresar el nombre de la pizza.
   * Permite ingresar exactamente 3 ingredientes.
   * La pizza se almacena en la pila principal.

2. **Deshacer (Undo)**

   * Retira la última pizza registrada de la pila principal.
   * La pizza retirada se almacena en la pila secundaria.

3. **Rehacer (Redo)**

   * Recupera la última pizza que fue deshecha.
   * La pizza vuelve a la pila principal.

4. **Mostrar Pedido Actual**

   * Permite consultar la pizza que se encuentra actualmente en el tope de la pila.
   * Para esto se utiliza el método `peek()`.

5. **Salir**

   * Finaliza la ejecución del programa.

---

##  Estructura del proyecto

El proyecto está organizado en las siguientes clases:

### `Main.java`

Contiene el menú principal y permite al usuario interactuar con el programa mediante el teclado.

### `Pizza.java`

Representa una pizza. Contiene:

* Nombre de la pizza.
* Arreglo de 3 ingredientes.

### `Nodo.java`

Representa cada nodo de la lista enlazada.

Cada nodo almacena:

* Una pizza.
* Una referencia al siguiente nodo.

### `Pila.java`

Implementa manualmente la estructura de datos Pila.

Contiene los métodos:

* `push()`
* `pop()`
* `peek()`
* `isEmpty()`

### `GestionPedidos.java`

Controla las operaciones de los pedidos y administra las dos pilas:

* Pila principal.
* Pila secundaria.


##  Funcionamiento de Undo y Redo

El funcionamiento se basa en el principio **LIFO (Last In, First Out)**:

> El último elemento en entrar es el primero en salir.

### Registro

Cuando se registra una pizza:

```text
Pizza → Pila Principal
```

### Undo

Cuando se selecciona Deshacer:

```text
Pila Principal → Pila Secundaria
```

Se utiliza `pop()` para retirar la última pizza.

### Redo

Cuando se selecciona Rehacer:

```text
Pila Secundaria → Pila Principal
```

Se utiliza `pop()` para recuperar la pizza y `push()` para volver a almacenarla en la pila principal.

---

## Tecnologías utilizadas

* **Java**
* **Java Scanner**
* **Nodos**
* **Listas enlazadas**
* **Pilas implementadas manualmente**

No se utiliza:

```java
java.util.Stack
```

---

## Ejecución

Para ejecutar el programa se debe abrir el proyecto en un entorno de desarrollo compatible con Java, por ejemplo **Visual Studio Code** con las extensiones de Java instaladas.

El programa mostrará un menú similar al siguiente:

```text
==============================
       PIZZA-TRACK
==============================
1. Registrar Pizza
2. Deshacer (Undo)
3. Rehacer (Redo)
4. Mostrar Pedido Actual
0. Salir
==============================
Seleccione una opción:
```


## Ejemplo de prueba

Una prueba básica del programa consiste en realizar el siguiente ciclo:

```text
1. Registrar Pizza
       ↓
2. Deshacer
       ↓
3. Rehacer
       ↓
4. Mostrar Pedido Actual
```

De esta manera se puede comprobar el funcionamiento de las dos pilas y de las operaciones `push()`, `pop()` y `peek()`.


## Proyecto académico

**Proyecto:** Pizza-Track
**Lenguaje:** Java
**Tema:** Estructuras de datos – Pilas
**Tipo de aplicación:** Consola
