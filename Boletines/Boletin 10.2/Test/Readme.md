# Pruebas Unitarias para el Proyecto


Este repositorio contiene pruebas unitarias para las clases del proyecto. Las pruebas están escritas utilizando JUnit y cubren las funcionalidades principales de cada clase.


## Estructura de las Pruebas


Las pruebas están organizadas en clases que corresponden a las clases del proyecto. A continuación se detalla cada clase de prueba y lo que cubre:


### 1. `AsociacionTest`

- **Descripción**: Pruebas para la clase `Asociacion`.

- **Métodos de prueba**:

  - `testConstructorYGetters()`: Verifica la correcta inicialización de atributos.

  - `testSetDniConValorNulo()`: Asegura que se lanza una excepción al establecer un DNI nulo.

  - `testSetDniConValorVacio()`: Asegura que se lanza una excepción al establecer un DNI vacío.

  - `testACadea()`: Verifica que el método `aCadea` devuelve la cadena esperada.


### 2. `AsalariadosTest`

- **Descripción**: Pruebas para la clase `Asalariados`.

- **Métodos de prueba**:

  - `testConstructorYGetters()`: Verifica la correcta inicialización de atributos.

  - `testSetSueldoNegativo()`: Asegura que el sueldo se ajusta a 0 si se establece un valor negativo.

  - `testCalcularGastosIngresos()`: Verifica que el cálculo de gastos e ingresos es correcto.

  - `testACadea()`: Verifica que el método `aCadea` devuelve la cadena esperada.


### 3. `SociosTest`

- **Descripción**: Pruebas para la clase `Socios`.

- **Métodos de prueba**:

  - `testConstructorYGetters()`: Verifica la correcta inicialización de atributos.

  - `testSetCuotaNegativa()`: Asegura que se lanza una excepción al establecer una cuota negativa.

  - `testCalcularGastosIngresos()`: Verifica que el cálculo de gastos e ingresos es correcto.

  - `testACadea()`: Verifica que el método `aCadea` devuelve la cadena esperada.


### 4. `TraballadoresTest`

- **Descripción**: Pruebas para la clase `Traballadores`.

- **Métodos de prueba**:

  - `testConstructorYGetters()`: Verifica la correcta inicialización de atributos.

  - `testGetFecha()`: Verifica que se obtiene la fecha correctamente.

  - `testCalcularGastosIngresos()`: Verifica que el cálculo de gastos e ingresos es correcto.

  - `testACadea()`: Verifica que el método `aCadea` devuelve la cadena esperada.


### 5. `VoluntariosTest`

- **Descripción**: Pruebas para la clase `Voluntarios`.

- **Métodos de prueba**:

  - `testConstructorYGetters()`: Verifica la correcta inicialización de atributos.

  - `testSetEdadNegativa()`: Asegura que se lanza una excepción al establecer una edad negativa.

  - `testSetEdadMayorQue130()`: Asegura que se lanza una excepción al establecer una edad mayor a 130.

  - `testCalcularGastosIngresos()`: Verifica que el cálculo de gastos e ingresos es correcto.

  - `testACadea()`: Verifica que el método `aCadea` devuelve la cadena esperada.


### 6. `HoraTest`

- **Descripción**: Pruebas para la clase `Hora`.

- **Métodos de prueba**:

  - `testConstructorPorDefecto()`: Verifica la correcta inicialización de atributos por defecto.

  - `testConstructorConParametros()`: Verifica la correcta inicialización de atributos con parámetros.

  - `testSetHorasInvalidas()`: Asegura que se ajusta la hora a 0 si se establece un valor inválido.

  - `testToStringFormato24()`: Verifica que el formato de hora 24 se imprime correctamente.

  - `testToStringFormato12()`: Verifica que el formato de hora 12 se imprime correctamente.


### 7. `DataTest`

- **Descripción**: Pruebas para la clase `Data`.

- **Métodos de prueba**:

    - `testConstructorPorDefecto()`: Verifica la correcta inicialización de atributos por defecto.

    - `testConstructorConParametros()`: Verifica la correcta inicialización de atributos con parámetros.

    - `testAjustarFechaDiaInvalido()`: Asegura que el día se ajusta al máximo permitido si se establece un día inválido.

    - `testAjustarFechaMesInvalido()`: Asegura que el mes se ajusta al mínimo permitido y el año se incrementa si se establece un mes inválido.

    - `testAjustarFechaDiaNegativo()`: Asegura que el día se ajusta al mínimo permitido si se establece un día negativo.

    - `testComprobarFormato()`: Verifica que el método `comprobarformato` maneja correctamente diferentes formatos de fecha.

    - `testDataIgual()`: Verifica que el método `dataigual` funcione correctamente al comparar dos fechas.

    - `testToString()`: Verifica que el método `toString` devuelva la cadena en el formato esperado.


## Requisitos


Para ejecutar las pruebas, asegúrate de tener configurado el entorno de desarrollo con JUnit. Puedes agregar JUnit a tu proyecto utilizando Maven, Gradle o cualquier otro sistema de gestión de dependencias.
