#  Agencia de Viaje – Reparto de Gastos

Aplicación hecha en Java que permite repartir de forma equitativa los gastos de un viaje en grupo (hasta 5 personas). 
Cada viajero introduce lo que ha pagado y el programa calcula cuánto debe pagar o recibir cada uno.

##  Características

- Grupos de hasta **5 personas**.
- Posibilidad de marcar a una persona como **"no viaja"** introduciendo `-1` como gasto.
- Cálculo de la **media** de gasto por persona (solo entre quienes viajan).
- Informe final que indica a cada persona si **debe pagar**, **debe recibir** o **está en paz**.
- Menú interactivo con control del orden de los pasos (no se puede calcular sin haber introducido gastos).

##  Requisitos
````
- **JDK 8** o superior.
- Terminal o cualquier IDE (IntelliJ IDEA NetBeans, VSCode…).
````
##  Compilación y ejecución

Desde la carpeta que **contiene** el directorio `AgenciaViaje/`:

```bash
# Compilar
javac AgenciaViaje/proyecto.java

# Ejecutar (la clase main está anidada dentro de "proyecto")
java 'AgenciaViaje.proyecto$AgenciaViaje'
```

>  En un IDE basta con ejecutar la clase interna `AgenciaViaje`, que es la que contiene el método `main`.

##  Uso

Al iniciar, el programa pregunta por el número de personas del grupo (máximo 5) y muestra el siguiente menú:

```
       _-MENU DE GASTOS-_
1.Introducir gastos..........
2.Calcular reparto de gastos.
3.Mostrar reparto de gastos..
4.Salir......................
```

| Opción | Descripción |
|--------|-------------|
| **1** | Pide los gastos de cada persona (números enteros). Se introduce `-1` si esa persona no viaja. |
| **2** | Calcula la media que debería pagar cada viajero (`total de gastos / personas que viajan`). Requiere haber ejecutado la opción 1. |
| **3** | Muestra el balance de cada persona. Requiere haber ejecutado las opciones 1 y 2. |
| **4** | Sale del programa. |

### Flujo recomendado

`1 → 2 → 3 → 4`

##  Cómo funciona el cálculo

1. Se suman todos los gastos introducidos: `guardarGastos`.
2. Se descuentan de la cuenta las personas que no viajan (`-1`): `media`.
3. Se calcula el reparto equitativo:

   ```
   repartoGastos = guardarGastos / media
   ```

4. Para cada persona se obtiene su balance:

   ```
   balance = repartoGastos - gastoDeLaPersona
   ```

   - `balance > 0` → la persona **pagará** esa cantidad.
   - `balance < 0` → la persona **debe recibir** esa cantidad.
   - `balance = 0` → la persona **está en paz**.

## Un ejemplo

Grupo de 3 personas:

```
Introduce los gastos de la persona: 1 (o -1 si no viaja): 90
Introduce los gastos de la persona: 2 (o -1 si no viaja): 30
Introduce los gastos de la persona: 3 (o -1 si no viaja): 0
```

Opción 2:

```
El calculo de los gastos está listo. La media es: 40.0 euros.
```

Opción 3:

```
La persona 1 debe recibir: 50.0 euros.
La persona 2 pagará: 10.0 euros.
La persona 3 pagará: 40.0 euros.
```

##  Estructura del proyecto

```
AgenciaViaje/
└── proyecto.java
```

##  Autor

Proyecto realizado como práctica de programación en Java por los alumnos:
````
-Manchet Jesús.

-Alejandro Dolset.

-Antonio Fernández.

-Alejandro Sotés.
````