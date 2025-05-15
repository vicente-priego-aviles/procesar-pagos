# Comienza a usar Camunda 8 y Spring Boot

Este proyecto demuestra el uso de Spring Boot y [el SDK de Spring Zeebe](https://docs.camunda.io/docs/apis-tools/spring-zeebe-sdk/getting-started/#add-the-spring-zeebe-sdk-to-your-project) para interactuar con una instalación local auto-administrada de Camunda.

## Guía escrita

Hay una guía para desarrollar este proyecto disponible en mi blog de [JavaCadabra][la guia]. Consulta dicha guía para obtener instrucciones paso a paso y explicaciones más detalladas.

## Interacciones con Zeebe

En este proyecto se incluyen ejemplos de:

1. Implementación de un modelo de proceso.
2. Iniciar una instancia de proceso.
3. Manejo de una tarea de servicio.

## Prerrequisitos

1. Una instalación autoadministrada de Camunda en ejecución (consulte [la guía asociada][la guia] para obtener instrucciones).
2. [Maven](https://maven.apache.org/).
3. Versión 17+ de un Java Development Kit (JDK).

## Ejecución del proyecto

1. Clonar el repositorio.
2. Ejecutar el proyecto:
   ```shell
   mvn spring-boot:run
   ```
   o
   ```shell
   ./mvnw spring-boot:run
   ```
   
Deberías ver un resultado que indique que se ha implementado un proceso, se ha iniciado una instancia de proceso y se ha manejado una tarea de servicio.

## Solución de problemas

Si el proyecto no se ejecuta, verifica lo siguiente:

1. La instalación de Camunda se está ejecutando.
2. Se puede acceder al Zeebe Broker en `localhost:8080` y al Zeebe Gateway en `localhost:26500`, o ajustar el archivo `application.properties` para que coincida con tu configuración.


[la guia]: https://javacadabra.vercel.app/bpmn/camunda/introduccion-a-camunda-8/2-comenzando-como-desarrollador-de-java-usando-spring/

