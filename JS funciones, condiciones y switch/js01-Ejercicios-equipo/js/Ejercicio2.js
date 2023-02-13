
// ********** CALCULAR SUELDO EJERCICIO 1*******************
function horas(){
    /* este codigo pide las horas trabajadas y el sueldo x hora 
    y  lo asigna a las variables correspondientes */
    let horasTrabajadas = parseInt(prompt("Cuantas horas trabajas al día bro?"));
     if(horasTrabajadas >24){
        alert("Ingresa una hora valida");
        horas();
     }else{
        let sueldoHora = parseInt(prompt("a ya y cuanto te pagan la hora?"));
        /* Este codigo hace el calculo de las horas trabajadas x los dias */
         let sueldoDia = horasTrabajadas * sueldoHora;
        /*  Este codigo busca el elemento <h3> con el id 'ejer1' y 
        lo asigna a la variable "ejercicioTexto1" */
         let ejercicioTexto1 = document.getElementById('ejer1');
         /* Este codigo cambia el contenido del texto en la etiqueta 
         h3 con el id 'ejer1' que anteriormente asigne en "ejercicioTexto1"*/
         ejercicioTexto1.textContent="Tons ganas: "+ sueldoDia +" al dia?";
     }

}

// *************CODIGO CALCULAR OPERACION**********
function ejercicio2(){
    // Aqui se realiza la operacion y la guarda en la var "operacion"
    let operacion = (3+2)/(2*5);
    /*Aqui busca el <h3> con el id de 'ejer2' 
    y lo guarda en la var "ejercicoTexto2" */
    const ejercicioTexto2 = document.getElementById('ejer2');
    /*  cambia el contenido del texto del <h3> usando .textContent 
    en la variable que contiene <h3> y le asigna un texto y el 
    valor de la variable operacion*/
    ejercicioTexto2.textContent = "El resultado es:  " + operacion;
}
// *******************CALCULAR IMC *************************
function imprimir(frase) {
const imc1 = document.getElementById('IMC1');
imc1.textContent =frase;
}
function imprimir2(frase) {
const imc2 = document.getElementById('IMC2');
imc2.textContent =frase;
}

function calcularimc(peso, altura) {
    return (peso / (altura * altura));
}

function calcularPeso(){
let nombre = prompt("Informe su nombre:")
let pesoInformado = prompt(nombre + ", informe su peso:")
let alturaInformado = prompt(nombre + ", informe su altura:")

let imccalculado = calcularimc(pesoInformado, alturaInformado);
imprimir(nombre + ", Su imc calculado es: "+ imccalculado);
if (imccalculado < 18.5) {
    imprimir2( "abajo de lo recomendado");
}
if (imccalculado >= 18.5) {

    if (imccalculado < 25) {

        imprimir2("IMC esta dentro del intervalo normal");
    }
}

if (imccalculado >= 25) {

    if (imccalculado < 30) {

        imprimir2("IMC considerado como sobrepeso");
    }
}

if (imccalculado >= 30) {
    imprimir2("IMC considerado como obecidad");
}
}
