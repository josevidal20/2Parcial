El objetivo principal fue implemetar un sistema de batallas de criaturas utilizando polimorfismo, clases abstractas, interfaces y composicion 
Arma.java es donde las criaturas usan accesorios nombre, dañoAdicional... esta clase no se hereda
criatura.java define la estructura basica nombre, salud y fuerza esta clase si contiene metodos abstractos esta forza una subclase poliformismo
Volador.java define el comportamiento de volar y aterrizar 
magico.java definir las habilidades magicas 
dragon.java sobrescribe extiende criatura y implementa volador 
mago.java extiende criatura y implementa magico
guerrero.java extiende criatura
main.java simulacion de batallas 
criaturastest.java pruebas unitarias 
