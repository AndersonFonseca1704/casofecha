- crear fechas apartir de una cadena de caracteres con el formato dd/mm/aaaa

## Ejercicio
Una operacion aplicable a una fecha podria ser sumarle o restarle dias. Si definimos el metodo `addDias`  en la clase Fecha, quien utilice esta clase podrá sumarle dias a sus fechas sin tener que conocer el algoritmo que resuelve el problema.

`// Creamos una fecha`
`Fecha f = new Fecha("23/12/1980");`

`Le sumamos 180 dias`
`f.addDias(180);`

Para facilitar los calculos se considera que todos los meses tienen 30 dias.
Por tanto, los años tendran 360 dias.

EL algoritmo para sumar dias a una fecha consistira en convertir la fecha a dias, sumarle los dias que corresponda y asignar los nuevos valores del dia, mes y año en los atributos.

Metodos a programar:
- El método `addDias` será el metodo que vamos a exponer para que los usuarios de la clase puedan invocar y así sumarle días a sus fechas.
- Desarrollaremos tambien el método `fechaToDias` que retornara un entero para representar la fecha expresada en dias. Este método no lo vamos a exponer. Es decir, no será visible para el usuario: será `private`.
- Por ultimos, desarrollaremos el método inverso: `diasToFecha` que, dado un valor entero que representa una fecha expresada en días, lo separará y asignará los valores que correspondan a los atributos `dia`, `mes`  y `anio`. Este metodo tambien será `private` ya que no nos interesa que el usuario lo pueda invocar.



-supongamos que no tenemos acesso al codigo de la clase fecha ,es decir,podemos utilizar pero no la podemos modificar porque fue hecha por terceras partes hagamos de cuenta que no la desarollamos nosotros ,de este modo supongamos que aunque la clase fecha no resulta util , funcona bien y es muy practica , queremos modificar la forma en que fecha se representa a si misma cuando invocamos su metodo toString

la solucion es crear una nueva clase (fechadetallada)que hereda de fecha y que modifique la maneraen que esta se representa como cadena 
ejemplo "19 de noviembre de 2022"
