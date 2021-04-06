!!!!!LISTO!!!!Eliminar Gestion
!!!!!LISTO!!!!Eliminar Show
Eliminar Entrada
Eliminar DAOS (salvo la interfaz)
!!!!!LISTO!!!! Hacer evento como abstracta y generar un ID de entrada en el constructor 
Renombrar clases por palabras en plural
Eliminar setters de edad y precio para que pueda construirlo solo por el constructor sobrecargado para clase infantiles
Eliminar propiedad cont de deportes (y de las clases hojas de eventos)
!!!!!LISTO!!!!(SE ELIMINO ESTE PUNTO POR LO ESCRITO MAS ABAJO) Crear clase TiposDeportes y en deportes agregar un objeto del tipo TipoDeportes (la clase tipoDeporte tiene una propiedad que es un array)
Generar una interfaz de entradas para que traiga toda la info del evento y agregar ese metodo en las clases teatro, deportes, infantiles y recital
!!!!!LISTO!!!!Hacer que el precio sea una propiedad del evento y que no tenga que estar en cada clase (teatro, deportes, etc). 
Corregir que no este precio como propiedad propia de infantiles
Eliminar el valor bool del constructor sobrecargado
Eliminar de tostring los valores de las variables constantes
Agregar el ELSE en el if del contructor de infantiles
!!!!!LISTO!!!!( agrege dos propiedades final mas: "array de precios y recargo") Modificar el constructor de deportes para calcular.
!!!!!LISTO!!!!Habilitar precio en evento
!!!!!LISTO!!!!modificar clase deportes para que tenga un array de string como propiedad:
!!!!!LISTO!!!!	private final String[] tipoDeportes = {"Futbol", "Rugby", "Hockey"};
!!!!!LISTO!!!!En el constructor calcular el precio en base al tipodeporte [0] 1 o 2 con un case y un default = 0
!!!!!LISTO!!!!en el constructor calcular aumento si es internacional
Generar clase actores y bandas (id actor nombre apellido) (id banda nombre)
Para poder agregarlos como propiedades de actores y bandas en clases teatro y recitales respectivamente
Analizar que se puede hacer con los generos de teatros y recitales ya que la interfaz solo hace un get del genero pero no lo usa para validar ni nada.

Para recitales modificar el contructor para que calcule el precio segun el tipo de entrada (como hicimos en infantiles), usar como propiedad de esta clase objetos del tipo banda
