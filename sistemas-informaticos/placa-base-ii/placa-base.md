![](junta-andalucia-moddle.png)
# SISTEMAS INFORMÁTICOS
## Enunciado:
Busca en internet placas base con factores de forma ATX, miniATX y microATX (dos de cada factor de forma). Analiza las dimensiones y capacidad de expansión de cada una de ellas. Elabora un documento con un procesador de texto en formato pdf para entregar la tarea (en el nombre de este fichero debe aparecer vuestro nombre).

## ¿Qué significan ATX, mini-ITX y micro-ATX?
Son factores de forma, con esas definiciones podemos saber las medidas de la placa base y así poder saber su compatibilidad con el chasis y estimar su capacidad de expansión y fuente de energía a utilizar.

Una puntualización: el enunciado menciona las placas mini-ATX, existieron pero totalmente obsoleto hoy en día, hay poca información respecto a ello y las fuentes son de dudosa calidad. Para este trabajo se hablará de las placas mini-ITX.

## Definición de factor de forma
Hay muchísimas, algunas salen adelante y otras por fortuna o desgracia caen en el olvido. El más popular y común es el formato ATX<sup>1</sup>.

Cada factor de forma definen unas pautas y reglas de cómo deben ser sus medidas, orificios, limitaciones y distribución de la energía. Siendo el modelo ATX el que más capacidades de expansión ofrece dado su generoso tamaño y siendo el mini-ITX el que menos, pues tiene el tamaño justo para colocar la memoria y una sola ranura de expansión.


## ATX
Es el estándar de facto y el primero que se diseñó, en 1995 por Intel, donde la mayoría de las placas se fabrican en ese formato y la mayoría de los chasis se fabrican para este formato.

### Medidas
Sus medidas son 305 x 244 mm (12 x 9.6 pulgadas) y consta de 9 orificios para su montaje.

### Expansión
Sus capacidades de expansión varían según el diseño del fabricante, (fig. 1 y fig. 2), la primera fue diseñada para el Intel Core 2 Duo, del 2006 y la segunda es para el Core i9 9900K, del 2020.

fig. 1 | fig. 2
--- | --- 
![fig. 1](https://m.media-amazon.com/images/I/71Ctc-LC+cL._AC_SX679_.jpg) | ![fig. 2](https://media.ldlc.com/r1600/ld/products/00/05/91/37/LD0005913716_1.jpg)
  
Como se puede observar, ambas placas tienen capacidades de expansión pero muy distintas ya que en la actualidad hay una tendencia de poner menos ranuras de expansión, dejando mucho espacio entre ellas por dos razones:

 - Insertar conectores en formato M.2
 - Tarjetas gráficas de gran tamaño debido a su disipador.

Cosa que antiguamente no existía el formato M.2 ni el disipador de las tarjetas gráficas eran tan grandes.

### Pero...
Pese a todo lo que se ha descrito anteriormente hace referencia a modelos y fabricantes generalistas, sin embargo hay fabricantes en que se especializan en diseñar placas para todo tipo de necesidades, [aquí un ejemplo](https://www.advantech.com/products/5f275228-3385-4034-b102-3bc63b149d4e/aimb-787/mod_017485a9-ed5b-4b09-9843-e7a2baa28d16).

### No sólo son medidas y capacidades de expansión
El factor de forma ATX también implica respetar unas pautas y normativa sobre dónde y cómo colocar todos los componentes, que van desde las tomas de corriente hasta el posicionamiento de los conectores SATA, pasando por el posicionamiento de los bancos de memoria RAM, módulos PCI y los *chipsets*. [Consultar página 11](https://web.aub.edu.lb/pub/docs/atx_201.pdf) para ver las especificaciones técnicas de la versión 2.01.

## Micro-ATX
La segunda más popular de la lista, originada en 1997, que deriva de ATX, siendo ésta un 25% más pequeña pero conservando toda la compatibilidad con ATX, también desarrollado por Intel.

### Medidas
Sus medidas son 244 x 244 mm (9.6 x 9.6 pulgadas) y consta de 8 orificios para su montaje.

### Expansión
Lo único que varía es que tiene como máximo 4 ranuras de expansión, 4 menos que el formato ATX y los primeros 6 orificios de montaje coinciden, mientras que la última fila sólo tienen dos, más cerca de los anteriores.

fig. 4 | fig. 5
--- | --- 
![fig. 4](https://cdn.coolmod.com/images/product/large/asus-prime-b450m-k-ii-socket-am4-placa-base-003.jpg) | ![fig. 5](https://cdn.coolmod.com/images/product/large/PROD-016514_2.jpg)

Ambas placas son del mismo tamaño pero con capacidades de expansión diferente. En fig. 4 es de gama baja y en fig. 5 es de gama alta.

Se pueden apreciar cómo en el de gama alta sacrifican una ranura PCIe x1 para ganar espacio y colocar dos interfaces M.2 además de tener 4 ranuras DIMM, cosa que en el de gama baja sólo tiene una interfaz M.2 y solamente 2 ranuras DIMM.

## Mini-ITX
Desarrollado por VIA en 2001, siendo aun más pequeñas que las anteriores, permitiendo compatbilidad con las placas ATX (posicionamiento de las ranuras de expansión y orificios de montaje).

### Medidas
Sus medidas son 170 x 170 mm (6.7 x 6.7 pulgadas) y consta de 4 orificios de montaje.

### Expansión
Al ser un factor de forma muy pequeño sólo permite una sóla ranura de expansión, y que es normalmente ocupada por la tarjeta gráfica.

Además de ello, al no haber espacio para una ranura M.2 para colocar dispositivos de almacenamiento, los fabricante han optado por colocarlo detrás así abriendo un nuevo paradigma de expansión.

fig. 5 | fig. 6
--- | --- 
![fig. 5](https://images.anandtech.com/doci/12634/boardfront_575px.jpg) | ![fig. 6](https://images.anandtech.com/doci/12634/boardbackGBT2_575px.jpg)

En este formato, hay que destacar que hay más placas base con otros tipos de arquitectura de procesador como ARM en el que se prescinden muchas cosas de lo que sí llevan en placas Intel/AMD.

![fig. 7](https://www.androidpimp.com/wp-content/uploads/2022/07/ITX-3588J-RK3588-Motherboard.jpg)

Se puede apreciar claramente que tienen otros tipos de expansión, carece de interfaz PCIe x16, y en su lugar es PCIe x8. Una toma de energía más pequeña (8 pines) y carecen de bancos de RAM en formato DIMM.

## Notas al pie
<sup>1</sup>Investigación propia, siendo en orden ATX, Micro-ATX y Mini-ITX. Basado en las páginas [PcComponentes](https://pccomponentes.com/): 242, 178 y 32 resultados, [PCPARTPICKER](https://pcpartpicker.com/): 1730, 1482 y 368 resultados y [Wipoid](https://wipoid.com/): 156, 120 y 13 resultados.

## Fuentes
[ATX Specifications](https://web.archive.org/web/20120725150314/http://www.formfactors.org/developer/specs/atx2_2.pdf)

[Micro-ATX Specifications](https://xdevs.com/doc/_PC_HW/Form_factors/matxspe1.2.pdf)

[VIA Mini-ITX Whitepaper](https://web.archive.org/web/20110613223644/http://www.via.com.tw/en/downloads/whitepapers/initiatives/spearhead/ini_mini-itx.pdf)

[Placa Mini-ITX ARM](https://www.androidpimp.com/embedded/itx-3588j-embedded-hardware/#3-interfaces-amp-lyaout)

## Autoría
Pedro Pérez Banda

Domingo, 25 septiembre de 2022

Sistemas Informáticos

1º DAW