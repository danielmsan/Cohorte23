//1 Debe solicitar al usuario 3 numeros por promp y guardarlos en sus respectivas variables

//Pedir 3 numeros y guardarlos
const a = parseInt(prompt("Ingresa el primer numero: "));
const b = parseInt(prompt("Ingresa el segundo numero: "));
const c = parseInt(prompt("Ingresa el tercer numero: "));
//entrada posible 4 4 2
// Identificar cual es el numero mayor, el del centro y el menor o si son iguales
if(a >= b && a >= c){  //a es mayor que todos
    if(b > c ){
        console.log(a+","+b+","+c)
        console.log(c+","+b+","+a)
    }else if(c > b){
        console.log(a+","+c+","+b)
        console.log(b+","+c+","+a)
    }else if(b==c){
        console.log(a+","+c+","+b)
        console.log(b+","+c+","+a)
    }
}else if(b >= a && b >= c){
    if(a >c){
        console.log(b+","+a+","+c)
        console.log(c+","+a+","+b)
    }else if(c > a){
        console.log(b+","+c+","+a)
        console.log(a+","+c+","+b)
    }
    }else if(c > a && c > b){
        if(a >b){
            console.log(c+","+a+","+b)
            console.log(b+","+a+","+c)
        }else if(b > a){
            console.log(c+","+b+","+a)
            console.log(a+","+b+","+c)
        }
    }else{
        console.log("ingresa un numero valido");
    }