# Lenguaje de marcas
## Serie de ejercicios del 1 al 7 de la unidad 1.
Empiezo por el cuarto, ya que los anteriores están ya con las soluciones aportadas.
### Ejercicio 4
Se observa que se trata de geografía mundial, donde hay una clasificación por continentes, países y capitales. Con el objetivo de mantener una jerarquía, sería:
> mundo - continentes - países - ciudades - capital (sólo aplicable a un país)

Entonces queda tal que así:

    <?xml version="1.0" encoding="UTF-8"?>
    <world_geography>
	    <continents>
		    <continent>
		    <name>Europe</name>
			    <countries>
				    <country>
					    <name capital="Madrid">Spain</name>
				    </country>
				    <country>
					    <name capital="Berlin">Germany</name>
				    </country>
			    </countries>
		    </continent>
	    </continents>
    </world_geography>

Hay otra forma válida que sería encerrar la capital en otra etiqueta, pero al ser sólo una entidad, lo ideal sería meterlo en un atributo para evitar una contaminación excesiva de etiquetas.

### Ejercicio 5
Se han detectado dos atributos iguales en una misma etiqueta, cosa que no es válida. Por lo demás se puede quedar tal y como está, pues es igualmente válido.

Entonces queda tal que así:

    <?xml version="1.0" encoding="UTF-8"?>
    <programs>
	   <program name="Firefox" license="GPL" />
	   <program name="Opera" license="GPL" />
	   <program name="LibreOffice" license="LGPL" />
	</programs>

### Ejercicio 6
Hay varios errores como etiquetas sin definir y etiqueta con falta de semántica. La corrección queda tal que así:

    <?xml version="1.0" encoding="UTF-8"?>
    <football_world_cup>
	    <edition>
		    <host>Spain</host>
		    <year>1982</year>
		    <winner>Italy</winner>
	    </edition>
    </football_world_cup>

Ahora sí que muestra correctamente el país anfitrión, el año de participación y el ganador.

### Ejercicio 7
Varias cosas a destacar, que no mencioné en el primer ejercicio y aprovecho esta ocasión: en cada documento XML hay distintas formas de nombrar etiquetas, algunas de ellas incorrecta por la inclusión de espacios. El desarrollador es libre de elegir, dentro de unas reglas, el formato que desee, en esta ocasión está en *camelCase*.
En una situación ideal es elegir uno sólo y mantener la consistencia entre todos los documentos, en mi caso, he elegido *snake_case*, ya que *camelCase* se lo dejamos para lenguajes de programación.

Otra cosa a destacar es el atributo velocidad (obviando el mal formato), es importante recalcar que cuando se trata de valores absolutos como velocidades o medidas, se colocan sin la unidad de medida, ya que esto puede venir especificado internamente en el programa consultando con la documentación o con unas convenciones, o bien, siendo lo NO ideal, en una etiqueta aparte.

La corrección sería tal que:

    <?xml version="1.0" encoding="UTF-8"?>
	<transport_vehicles>
		<bicycle speed="100" />
		<electric_scooter speed="50" />
	</transport_vehicles>

> Realizado por Pedro Pérez Banda como actividad de Lenguaje de Marcas. 
> 1° de DAW - 22 de septiembre 2022.