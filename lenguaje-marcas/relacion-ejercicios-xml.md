# Lenguaje de marcas
## Relación de ejercicios XML
### Ejercicio 1
**Válidos**: a), b), c), f), g)

Caso a): Nada que destcar, totalmente válido.

Caso b): Es válido, sin embargo, no cumple con buenas prácticas, pues idealmente no deberían contener guiones, algunos programas pueden tratar de restar dos valores.

Caso c): Totalmente válido, en *PascalCase*.

Caso f): Es válido, pero al igual que el caso b), se debe evitar, pues no cumple con buenas prácticas.

Caso g): Totalmente válido, empezando por un guion bajo y manteniendo en *snake_case*.

**No válidos**: d), e), h)

Caso d): No deben contener ningún espacio.

Caso e): No deben contener barra inclinada como parte del nombre.

Caso h): No deben empezar por el caracter <code>‘</code>, sólo se permite guion bajo o una letra a excepción de XML.

> Para ampliar: [Validador de nombres para etiquetas XML](https://www.regextester.com/108857)

### Ejercicio 2
En el anterior ejercicio decidí usar *snake_case* para los nombres de de las etiquetas. Esta vez, usaré *camelCase*, pues revisando entre mis proyectos, me he dado cuenta que el documento pom.xml del gestor Maven está en ese formato. Además de respetar otras convenciones como evitar el uso de la tilde o guiones. Quedaría tal que así, con una reinterpretación al inglés.

```
<?xml version="1.0" encoding="UTF-8"?>
<catalog>
  <disc>
    <title>Thriller</title>
    <artist>Michael Jackson</artist>
    <country>USA</country>
    <year>1982</year>
    <sales>65 millions</sales>
  </disc>
  <disc>
    <title>The Dark Side Of The Moon</title>
    <artist>Pink Floyd</artist>
    <country>UK</country>
    <year>1973</year>
    <sales>50 millions</sales>
  </disc>
  <disc>
    <title>Back In Black</title>
    <artist>AC/DC</artist>
    <country>Australia</country>
    <year>1980</year>
    <sales>50 millions</sales>
  </disc>
</catalog>
```
### Ejercicio 3
```
<?xml version="1.0" encoding="UTF-8"?>
<card>
  <name>John</name>
  <surname>Doe</surname>
  <job>Architect</job>
  <company>Contoso</company>
  <position>CEO</position>
  <email>johndoe@contoso.com</email>
  <phone>555-555-5555</phone>
</card>
```

### Ejercicio 4

### Ejercicio 5

### Ejercicio 6
a) Bien formado.

b) Bien formado.

c) La declaración está incompleta. La versión es obligatoria.

d) Bien formado. Tiene todos los elementos mínimos, aunque resulte extraño.

e) Bien formado, con algunos fallos en conveciones de nombres.

f) Las etiquetas no deben contener espacios.

### Ejercicio 7
Analizado con Visual Studio Code, con el *plugin* XML, desarrollado por Red Hat.

### Ejercicio 8
```
<?xml version="1.0"?>
<ticket>
  <name size="heading-1">Restaurante Seindor</name>
  <business>
    <businessName>Restaurante</businessName>
    <taxCode>B12345678</taxCode>
  </business>
  <address>
    <street>Avenida Principal, 1</street>
    <postalCode>28001</postalCode>
    <city>Madrid</city>
  </address>
  <contact>
    <phone>91234567</phone>
    <email>info@seindor.com</email>
    <website>seindor.com</website>
  </contact>

  <horizontalRule style="dotted" />

  <ticketNumber>A103837</ticketNumber>
  <date>
    <day>28</day>
    <month>10</month>
    <year>2012</year>
  </date>

  <horizontalRule style="dotted" />

  <dinners>002</dinners>
  <page>001</page>

  <horizontalRule style="dotted" />

  <table>
    <element>
      <units>2</units>
      <description>PAN</description>
      <price>1.20</price>
      <total>2.40</total>
    </element>
    <element>
      <units>1</units>
      <description>BLMIREIA</description>
      <price>12.00</price>
      <total>1.00</total>
    </element>
    <element>
      <units>1</units>
      <description>PARRILLADA VERDURAS</description>
      <price>9.30</price>
      <total>9.30</total>
    </element>
    <element>
      <units>2</units>
      <name>PAELLA PESCADO</name>
      <price>13.90</price>
      <total>27.80</total>
    </element>
    <element>
      <units>1</units>
      <name>TARTA QUESO FRESCO</name>
      <price>4.00</price>
      <total>4.00</total>
    </element>
    <element>
      <units>1</units>
      <name>MENTA POLEO</name>
      <price>1.10</price>
      <total>1.10</total>
    </element>
  </table>

  <horizontalRule style="dotted" />

  <base>56.60</base>
  <tax>7.00</tax>
  <taxApplied>3.96</taxApplied>

  <horizontalRule style="dotted" />

  <total>60.56</total>
</ticket>
```






> Realizado por Pedro Pérez Banda como actividad de Lenguaje de Marcas. 
> 1° de DAW - 30 de septiembre 2022.
