let miVariable = 34;

let miArreglo = []; //declaracion literal 
let miArreglo01 = new Array(); // por instancia

let miArreglo02 = [31,32,33,34];
console.log('el dato de mi Arreglo en el indice "0" es: ', miArreglo02[0]);
console.log('el dato de mi Arreglo en el indice "1" es: ', miArreglo02[1]);
console.log('el dato de mi Arreglo en el indice "2" es: ', miArreglo02[2]);
console.log('el dato de mi Arreglo en el indice "3" es: ', miArreglo02[3]);
console.log("El tamaño de mi arreglo es: "+miArreglo02.length);

let miArreglo03= ["Hola","que","tal"];
console.log(miArreglo03[0]);
console.log(miArreglo03[1]);
console.log(miArreglo03[2]);
console.log("El tamaño de mi arreglo es: "+miArreglo03.length);

let miArreglo04 = [{nombre: "Daniel"},{apellido: "Morales"},{edad: 23}];
console.log("elemento del arreglo de tipo objeto miArreglo04: "+ miArreglo04[0].nombre);
console.log("elemento del arreglo de tipo objeto miArreglo04: "+ miArreglo04[1].apellido);
console.log("elemento del arreglo de tipo objeto miArreglo04: "+ miArreglo04[2].edad);
console.log("El tamaño de mi arreglo es: "+miArreglo04.length);

let nuevoArreglo00 = [3,6,1,4];
console.log("Orden de mi arregloNuevo con sort: " +nuevoArreglo00.sort());
console.log("Orden de mi arregloNuevo metodo pop: " +nuevoArreglo00.pop());
console.log("Orden de mi arregloNuevo metodo push: " +nuevoArreglo00.push(10));
console.log("Orden de mi arregloNuevo metodo push: " +nuevoArreglo00.reverse());


let otroArreglo = ["que","hola","tal","como"];
//Este es el orden ["que","hola","tal","como"]
console.log("con sort: " +otroArreglo.sort());
//Lo ordena alfabeticamente queda asi: [como,hola,que,tal]
console.log("metodo pop: " +otroArreglo.pop());
//Elimina el ultimo elemento y lo muestra queda asi: [como,hola,que]
console.log("metodo push: " +otroArreglo.push("estas"));
/*añade el elemento al ultimo espacio y devuelve el tamaño del arreglo
queda asi: [como,hola,que,estas] */
console.log("sin metodo: " +otroArreglo);
//Asi va quedando [como,hola,que,estas]
console.log("metodo reverse(): "+ otroArreglo.reverse());
//lo invierte y queda asi: [estas,que,hola,como]

console.log("javascript"[2]);
console.log("javascript".length);

let matriz = [// 0 1 2   
                [1,2,3], //  0
                [4,5,6], //  1
                [7,8,9]  //  2
             ];
console.log("tamaño: " + matriz.length);
console.log(matriz[0][1]);

            //  0 1 2   0 1 2   0 1 2
let matriz2 = [[1,2,3],[4,5,6],[7,8,9]];
            //     0      1        2
