const myArray = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];
let miNuevoArray = [];

let miLista = document.getElementById('miLista');

const botonEnviar = document.getElementById('botonEnviar');

function rangoString() {
    const palabra = document.getElementById('inputPalabra');
    const palabra2 = palabra.value;
    for (let i = 0; i < myArray.length; i++) {
        if (palabra2.length < myArray[i].length) {
            miNuevoArray.push(myArray[i]);
        }
    }
    
    return listaArray(miNuevoArray);
}
function listaArray(miNuevoArray){
    for (let i = 0; i < miNuevoArray.length; i++) {
        let li = document.createElement('li');
        li.innerHTML = miNuevoArray[i];
        miLista.append(li);
    }
}

botonEnviar.addEventListener("click",rangoString);
