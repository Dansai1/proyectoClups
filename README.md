Guillermo Andres Dominguez Moran 
proyecto para practicas
Este proyecto siguio las siguientes indicaciónes requeridas por la empresa:
Se tiene una lista de automóviles en cuatro clubes distintos, cada automóvil tiene sus propiedades (color, placas, id_cliente, id_chip, marca, modelo,
fecha de alta, fecha de actualización, activo). Además, una lista de clientes con sus propiedades( id_cliente, nombre, fecha de alta, fecha de actualización, activo,
acceso_permitido, club), y un catálogo de los 4 clubes. A partir de eso, se necesita un web service que nos devuelva todos los chips activos por club (el web service debe ser 
del tipo get y tener cómo parámetro de entrada el id del club)

Por último, el proyecto debe cumplir con lo siguiente:

    Debe ocupar el framework Spring Boot
    Debe ocupar Hibernate
    Uso de streams de datos
    Se deben mapear en hibernate las relaciones entre tablas
    Manejo de piscinas de conexiones
    Las tablas se deben de crear a partir de los POJO
    El web service sólo debe de retornar aquellos chips activos de los usuarios activos (se debe de comprobar la columna de activo en ambas tablas)
