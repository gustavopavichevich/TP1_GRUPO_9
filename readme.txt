Falta:


Hecho:
Cristian - Eliminar Gestion
Cristian - Eliminar Show
German - Eliminar Entrada
Cristian - Hacer evento como abstracta y generar un ID de entrada en el constructor 
German - Renombrar clases por palabras en plural
German - Eliminar setters de edad y precio para que pueda construirlo solo por el constructor sobrecargado para clase infantiles
German - Eliminar propiedad cont de deportes (y de las clases hojas de eventos)
Cristian - (se elimino este punto por lo escrito mas abajo) Crear clase TiposDeportes y en deportes agregar un objeto del tipo TipoDeportes (la clase tipoDeporte tiene una propiedad que es un array)
Cristian - Hacer que el precio sea una propiedad del evento y que no tenga que estar en cada clase (teatro, deportes, etc). 
German - Agregar el ELSE en el if del contructor de infantiles
Cristian - ( agrege dos propiedades final mas: "array de precios y recargo") Modificar el constructor de deportes para calcular.
Cristian - Habilitar precio en evento
Cristian - modificar clase deportes para que tenga un array de string como propiedad:
Cristian - 	private final String[] tipoDeportes = {"Futbol", "Rugby", "Hockey"};
Cristian - En el constructor calcular el precio en base al tipodeporte [0] 1 o 2 con un case y un default = 0
Cristian - en el constructor calcular aumento si es internacional
German - Generar clase actores y bandas (id actor nombre apellido) (id banda nombre)
German - Para poder agregarlos como propiedades de actores y bandas en clases teatro y recitales respectivamente
Leo - Eliminar el valor bool del constructor sobrecargado
Leo - Eliminar de tostring los valores de las variables constantes
Leo - Analizar que se puede hacer con los generos de teatros y recitales ya que la interfaz solo hace un get del genero pero no lo usa para validar ni nada.
Leo - Eliminar DAOS (salvo la interfaz)
No se quien lo hizo - Para recitales modificar el contructor para que calcule el precio segun el tipo de entrada (como hicimos en infantiles), usar como propiedad de esta clase objetos del tipo banda
Leo - No se hace, se usa la interfaz de consulta genero solamente . Generar una interfaz de entradas para que traiga toda la info del evento y agregar ese metodo en las clases teatro, deportes, infantiles y recital
Leo - Corregir que no este precio como propiedad propia de infantiles