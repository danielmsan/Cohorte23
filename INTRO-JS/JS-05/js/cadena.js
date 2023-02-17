let texto = "Hola Mundo";

console.log(texto.includes("Hola"));

if (texto.includes("n")) {
    console.log("si se encuentra");
}else{
    console.log("no se encuentra");
}

//Split divide una string en un a array
// let palabra = texto.split(" ");
// console.log(palabra);
// console.log(palabra[0]+" / "+ palabra[1]);

// let palabra = texto.substring(5,7);
// let palabra2 = texto.substr(5,7);
// console.log(palabra);
// console.log(palabra2);


// let mensaje = texto.toUpperCase();
// console.log(mensaje);

let mensaje = " ";
for(let index = 0; index < texto.length; index++){
    mensaje += texto[index]  + ".";
}

mensaje = mensaje.trim();
console.log(mensaje);



