// Condiciones y Expresiones

//Ejercicio 1
let names = ["Maria", "Antony", "Joy", "Juan"];
console.log(names);

//Funcion 1
function insertName(name){
    names.push(name);
}
//Funcion 2
function checkName(name){
let check = names.includes(name);
    return check;
}
console.log(checkName("Maria"));

//Funcion 3
let NuevosNombres = ["Oscar", "Carlos", "Antonio", "Susana", "Joy"];

function EncontrarNombresComunes(nombres1, nombres2) {
    return nombres1.filter(function (nombre) {
        return nombres2.includes(nombre);
    });
}
console.log("Los nombres comunes son: " + EncontrarNombresComunes(names, NuevosNombres));


let lista = ["Maria", "Antony", "Joy", "Juan"];
function listNames(lista){
    const listaInt= [];
    for(i=0; i <= lista.length-1 ;i++){
    listaInt.push(lista[i].length);
    }
    return listaInt;
}
console.log(lista);
console.log(listNames(lista));

// Ejercicio 2
console.log(false || (true && false));
console.log(true || (11 + 12));
console.log((31 + 22) || true);
console.log((true && (1 + 7)));
console.log(false && (3 + 4));
console.log((1 + 2) && true);
console.log((32 * 4) >= 129);
console.log(false !== !true);
console.log(true === 4);
console.log(false === (847 === '847'));
console.log(false === (887 == '887'));
console.log((!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false);

function rango(numero){
    if(numero>=0 && numero<=25){
        console.log(numero+" esta entre 0 y 25")
    }else if( numero>=26 && numero<=100) {
        console.log(numero+" esta entre 26 y 100")
    }else if(numero>100){
        console.log(numero+" es mayor que 100")
    }else if(numero<0){
        console.log(numero+" es menor que 0")
    }
    else{
        console.log(" Introduce un numero valido");
    }
}
rango(25);

var a;
var b = null;
var c = undefined;
var d = 4;
var e = 'five';
var f = a || b || c || d || e;

console.log(f);

let listaNombres2 = ["Maria","Antony","Joy","Juan"];
let masNombres = ["Maria","Pedro","Juan"]
console.log(listaNombres2[0].length);

//Toma dos valores la funcion
function nuevaLista(listaA, listaB){
    //Tener variable para el nuevo array
    let listaRepetida = [];
    //ciclo para ir iterando la primera lista
    for(let i=0; i< valor1.length; i++ ){
        //Ciclo para ir iterando la segunda lista
        for(let k=0; k< listaB.length;k++){
            //Compara el elemento de la lista 1 con la lista 2 
            if(listaA[i]==listaB[k]){
                //si es igual añade el dato al nuevo array
                listaRepetida.push(listaA[i]);
            }
        }
    }
    return listaRepetida;   
}