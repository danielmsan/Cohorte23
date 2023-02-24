/*


Que encontramos en el arbol del DOM?


- Node: Es la unidad mas basdica dentri del documrnto. puede ser una etiqueta, un te
texto dentro de una etiqueta o un cometnario, etc.


    <title> NODO
        Manipulacion DOM // Es un nodo, pero es hijo del title
    <title>

    - Document: Tambien es un nodo, del tipo documento, es el nodo raiz
    apartir del cual se desarrollan o generan todos los demas nodos.

    - Element: son todos aquellos definidos por etiquetas <div>, <img>, <h1>, <p>

    - Attributes: Nodos que dan informacion asociada al tipo de elemento

    - Comentario: Comentarios y otros elementos que estan dentro del HTML, 
    son considerados NODOS.
*/


/*Como leer nodos de mi Document Object Model (DOM)

Metodos tradicionales (que se usan en versiones antiguas de JS)

    - document.getElementByID (botonSuma)
    - document.getElementsByTagName (<button>)
    - document.getElementByClassName (<botones>)

*/

// // ID
// var elementoID = document.getElementById("botonSuma");
// console.log(elementoID);
// // Etiqueta
// var elementoEtiqueta = document.getElementsByTagName("button");
// console.log(elementoEtiqueta);
// console.log("Este es el primer elemento de mi coleccion de botones", elementoEtiqueta[0]);
// // Classes
// var elementoClassName = document.getElementsByClassName("botones");
// console.log(elementoClassName);

/*

Metodos recientes

    -document.querySelector(#botonSuma)
    -document.querySelectorAll(.botones)


*/

// var unElemento = document.querySelector("#input1");
// console.log(unElemento);

// var variosElementos = document.querySelectorAll(".botones");
// console.log(variosElementos)

/**

Creacion de Nodos

    -document.createElement(tipoNodo)
 */


//Creacion de una etiqueta del tipo imagen
var imagenPerrito = document.createElement("img");

// Crear atributos de la etiqueta
imagenPerrito.src= "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg";
imagenPerrito.alt ="Foto de Perrito Feliz";
imagenPerrito.style.width = "150px";
imagenPerrito.style.borderRadius = "100px";



//Poner elementos o nodos en el html
document.body.append(imagenPerrito);



//Actualizar nodos 
//Identificar el nodo con un metodo para tomarlo (getElemento o QuerySelector y modificarlo con inner.HTML)


var resultadoQueCambia = document.getElementById("resultado");

resultadoQueCambia.innerHTML = "Saludos, cambie el texto juas juas";


// Construir nuestra calculadora
var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");

//Este es el boton
var botonSuma = document.getElementById("botonSuma");
console.log(botonSuma);
var botonResta = document.getElementById("botonResta");
var botonMulti = document.getElementById("botonMulti");
var botonDiv = document.getElementById("botonDiv");

//Aqui va el resultado
var resultado = document.getElementById("resultado");

/**
 * Funcion que suma dos valores de input y los escribe en el
 * documento HTML en el lugar de resultado
 */
function suma(){
    let valor1 = parseInt(input1.value); //pido numero1
    let valor2 = parseInt(input2.value); //pido numero2
    let suma = valor1 + valor2; //calculo la suma
    resultado.innerHTML = suma;//pongo el resultado en su lugar
}

function resta(){
    let valor1 = parseInt(input1.value); //pido numero1
    let valor2 = parseInt(input2.value); //pido numero2
    let resta = valor1 - valor2; //calculo la suma
    resultado.innerHTML = resta;//pongo el resultado en su lugar
}

function multi(){
    let valor1 = parseInt(input1.value); //pido numero1
    let valor2 = parseInt(input2.value); //pido numero2
    let multi = valor1 * valor2; //calculo la suma
    resultado.innerHTML = multi;//pongo el resultado en su lugar
}

function div(){
    let valor1 = parseInt(input1.value); //pido numero1
    let valor2 = parseInt(input2.value); //pido numero2
    let div = valor1 / valor2; //calculo la suma
    resultado.innerHTML = div;//pongo el resultado en su lugar
}

/*Como se crea un evento (addEventListener)

    - node.addEventListener ("evento a escuchar", lo que quiero que haga
    cuando se escuche)

        - node (nodo donde aterrizo el evento)
        - addEventListener (palabra reservada para usar el evento)
        - evento a escuchar (click, mouseover,etc)
        - Lo que quiero que haga (la llamada de la funcion)

*/

botonSuma.addEventListener("click",suma);
botonResta.addEventListener("click",resta);
botonMulti.addEventListener("click",multi);
botonDiv.addEventListener("click",div);




/* 

Manipulacion del DOM 


    -Metodos para acceder a elementos
        

        -document.getElementById
        -document.getElementByTagName
        -document.getElementsByClassName

    -Metodos para crear elementos

        -document.createElement(etiqueta)
        -document.createTextNode(texto) - Investigar

    -Metodos para insertar elementos

        -parentElement.append
        -parentElement.insertBefore
        -parentElement.insertAdjacentElement

    -Metodos para modificar elementos

        - node.outerHTML(Leer o referenciar el elemento)
        -node.innerHTML (modificar el elemento)
*/
    
//Primer paso: Definir con que voy a interactuar (almaceno en una variable)
const textoAModificar = document.querySelector("#h1")

//Creo una funcion que cambia de color, segun el color que le paso como parametro
function cambiarColor(color){
    textoAModificar.style.color = color;
}