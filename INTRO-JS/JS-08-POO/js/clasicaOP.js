//Clase
class OperacionesAritmeticas {
//constructor default

    //atributos o propiedades
    numero0 = 5;
    numero1 = 0;

    //Se puede definir un constructor
    constructor (valor0, valor1){
        this.numero0 = valor0;
        this.numero1 = valor1;

    }
    // Metodos

    //Sumar
    sumar() {
        return this.numero0 + this.numero1;
    }
    //Restar
    restar = () => this.numero0 - this.numero1;
    //Multiplicar
    multiplicar = () => this.numero0 * this.numero1;
    //Dividir
    dividir = () => this.numero0 / this.numero1;
}
//Aqui se define el objeto nuevo usando el constructor y pasandole 2 parametros
let obj4 = new OperacionesAritmeticas(8,4);

//Resultado en consola de cada metodo:
console.log("----> "+obj4.sumar());
console.log("----> "+obj4.restar());
console.log("----> "+obj4.multiplicar());
console.log("----> "+obj4.dividir());




let obj3 = new OperacionesAritmeticas();
obj3.numero0 = 8;
obj3.numero1 = 5;

console.log(obj3.sumar(obj3.numero0, obj3.numero1));



let obj2 = new OperacionesAritmeticas();
console.log(obj2.sumar(5,6));


let obj1;
obj1 = new OperacionesAritmeticas();
// Declaracion de un Objeto
//Creacion del Objeto
//Llamada
console.log(obj1.numero0);