# Ejercicio 3
## Decisiones de diseño
La decisión que he tomado para distinguir entre hacer etiequetas nuevas o ponerlo como atributo han sido por la frecuencia en que cambian los datos del documento XML.

A la hora de generar una factura, lo que varía menos con respecto a los atributos se ha introducido como etiqueta:

- Los datos de la empresa
- Los datos del cliente
- La descripción del producto, que va asociado con la referencia del producto

Los datos introducidos como atributos, que cambian con más frecuencia:

- Número de factura, un número nuevo por cada factura generada.
- Fecha
- Número de pedido
- Forma de pago
- Cada referencia del producto, cantidad, precios, impuestos e importe.
- La facturación

Que bien, las referencias del producto, cantidad, etc no cambian con tanta frecuencia, sí que cambia más con respecto a lo que son los datos del cliente o datos de empresa.