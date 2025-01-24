# Backend-HackaCode-2025
Backend desarrollado con Java Spring Boot para la Hackathon organizada por TodoCode

Vídeo de descripción del proyecto a realizar<br>
https://www.youtube.com/watch?v=55lt-rXOHv4

Sitio web del hackatón<br>
https://hackacode.todocodeacademy.com/

## Descripción del proyecto
Enlace al documento de especificación de los requerimientos:<br>
https://hackacode.todocodeacademy.com/wp-content/uploads/2025/01/Consigna-HackaCode-3ra-Edicion.pdf

Una clínica médica necesita desarrollar una aplicación web para gestionarlas consultas, pacientes, médicos, servicios y facturaciones.<br>Un analista funcional llevó a cabo un relevamiento detallado de las acciones y aspectos a tener en cuenta para el desarrollo del sistema, que se describen a continuación.

### Servicios Médicos
- La clínica ofrece diversos servicios médicos, tales como:
  - Consultas generales
  - Consultas especializadas (cardiología, dermatología, pediatría, etc.)
  - Exámenes médicos (análisis de sangre, radiografías, ecografías, etc.)
  - Cirugías
  - Terapias y tratamientos varios
- Cada servicio tiene los siguientes datos:
  - codigo_servicio
  - nombre
  - descripcion
  - precio

### Paquete de Servicios
- Un paquete de servicios es una combinación de diferentes servicios médicos ofrecidos a un precio con descuento. Por ejemplo, un paquete puede incluir una consulta general y un examen de sangre.
- Los paquetes de servicios tienen los siguientes datos:
  - codigo_paquete
  - lista_servicios_incluidos
  - precio_paquete
 
El precio del paquete se calcula como la suma de los precios de los servicios que lo componen, con un descuento de 15% por ser un paquete.<br>Por ejemplo, si la consulta general cuesta $2,000 y el examen de sangre $500, la sumatoria es $2,500, y el precio del paquete sería $2,500 - 15% = $2,125.<br>Al mismo tiempo se debe hacer un descuento ADICIONAL de 20% a aquellos pacientes que cuenten con Obra Social/Seguro Médico.

### Pacientes
El sistema debe permitir registrar nuevos pacientes.<br>Para cada paciente se requiere la siguiente información:
- id_paciente
- nombre
- apellido
- dni
- fecha_nac
- email
- telefono
- direccion

### Médicos
El sistema debe permitir registrar médicos de la clínica. <br>Cada médico debe contar con los mismos datos que un paciente, añadiendo:
- Especialidad médica
- Turnos disponibles
- Sueldo

### Citas médicas
El sistema debe permitir registrar las consultas médicas, que pueden ser de diversos tipos (generales o especializadas).<br>Cada consultatendrá los siguientes datos:
- id
- fecha_consulta
- hora_consulta
- un_paciente
- un_medico
- un_servicio o un_paquete (el servicio o paquete contratado)
- monto_total
- pagado_o_no

### ABML (Altas, bajas, modificaciones y lecturas necesarias)
El sistema debe ser capaz de realizar las operaciones ABML de los diferentes servicios, paquetes, pacientes, médicos y consultas.<br>Para cada uno de ellos, se debe poder realizar:
- Alta
- Baja
- Modificación
- Consulta

## ENTREGABLES:
- Diagrama de clases del modelo de datos (UML).
- Repositorios de GitHub (Frontend y Backend).
- Especificación de configuraciones de base de datos.
- Aplicación desplegada y en funcionamiento.
- Documento de supuestos realizados por el analista/programador.

### SE VALORARÁ:
- Diseño atractivo y funcional.
- Visualización eficiente de los datos.
- Uso de buenas prácticas en el desarrollo.

### BONUS POINT
El director de la clínica desea conocer las ganancias diarias y mensuales generadas por cada tipo de consulta o servicio.<br>Se otorgarán puntos extra si el sistema permite calcular las ganancias de manera eficiente o manejar alguna forma de registro de pagos, facturaciones y medios de pago.<br>Se considerará aún mayor el puntaje, si el sistema permite la generación de recibos/facturas en formato PDF.
