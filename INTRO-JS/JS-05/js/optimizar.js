// Ejercicio 1
let unidades = 130;
let GPA = 3.0;
if(GPA >2.0 && unidades >= 120){
    console.log("¡Puede graduarse!");
}

// Ejercicio 2
let cspCalificacion = 80;
let progCalificacion = 90;
if(cspCalificacion >= 75 || progCalificacion >= 75){
    console.log("¡Eres elegible para la graduacion!")
}


let texto = "Hola Mundo";
palabra = texto.split(" ");
let mensaje = " ";

for(i=0; i<palabra.length;i++){
    for(k=0;k<palabra[i].length; k++){
        mensaje += palabra[i][k]+".";
    }  mensaje+= " "
}console.log(mensaje);


let texto1 = "hola mundo";
let Puntos = texto1.replaceAll("", ".").substring(1);
console.log(Puntos);
