

//Codigo final ya optimizado
class Adivinador{
    constructor(secreto){
        this.secreto = secreto;
    }
    adivinar(){
        let errores = [];
        let num = 0;
    
        while(num != this.secreto){
            num = parseInt(prompt("Ingresa un numero entre 1 - 100"));
            if(num>0 && num<=100 && num !=this.secreto){
                errores.push(num);
            }else if(num==this.secreto){
                break;
            }else{
                alert("ingresa un numero valido");
            }
    }
            console.log("Felicidades lograste adivinar :D "+this.secreto);
            console.log("tus errores son: "+errores);
    }
}
let dani = new Adivinador(25);
dani.adivinar();



// class Adivinador{
//     constructor(secreto){
//         this.secreto = secreto;
//     }

// }
// function adivinar(secreto){
//     let errores = [];
//     let num = 0;

//     while(num != secreto){
//         num = parseInt(prompt("Ingresa un numero entre 1 - 100"));
//         if(num>0 && num<=100 && num !=secreto){
//             errores.push(num);
//         }else if(num==secreto){
//             break;
//         }else{
//             alert("ingresa un numero valido");
//         }
// }
//         console.log("Felicidades lograste adivinar :D "+secreto);
//         console.log("tus errores son:"+errores);
// }
// adivinar(20);



// class Adivinador{
//     constructor(secreto){
//         //Aqui va el numero secreto
//         this.secreto = secreto;
//         //Aqui se guardan los errores del usuario
//         this.errores = [];
//     }
//     adivinar(){
        
//     // Pide numero al usuario entre 1 y 100 y lo guarda en num
//     const num = parseInt(prompt("Ingresa un numero entre 1 - 100"));
//     // Comprueba que el numero se encuentra en el rango
//     if(num > 0 && num<100){
//         //Compara si el numero es igual al numero secreto
//         if(num===this.secreto){
//             //Si adivina el numero se cierra la función y te imprime tus errores
//             alert("Felicidades :D");
//             console.log("Felicidades, adivinaste el numero secreto: "+this.secreto);
//             //Imprime el array con tus errores
//             console.log("Tus errores: "+this.errores);
//         }else{
//             //Imprime en pantalla que te equivocaste
//             alert("Ups, El numero es incorrecto, vuelve a intentarlo!");
//             //Imprime en consola que te equivocaste
//             console.log("Ups, El numero es incorrecto, vuelve a intentarlo!");
//             //meter numeros incorrectos en el array errores.
//             this.errores.push(num);
//             //Volver a llamar a la función hasta que adivines
//             return this.adivinar();
//         }
//     }else{
//         alert("Ingresa un numero valido! entre 1 - 100");
//         return this.adivinar();
//     }
// }
// }

// const dani = new Adivinador(10);
// dani.adivinar();



// //Adivinar este numero
// let secreto= 9;
// //Aqui van los errores
// let errores = [];
// // Función que se repite hasta que adivines el numero
// function adivinar(){
//     // Pide numero al usuario entre 1 y 100 y lo guarda en num
//     const num = parseInt(prompt("Ingresa un numero entre 1 - 100"));
//     // Comprueba que el numero se encuentra en el rango
//     if(num > 0 && num<100){
//         //Compara si el numero es igual al numero secreto
//         if(num===secreto){
//             //Si adivina el numero se cierra la función y te imprime tus errores
//             alert(":D")
//             console.log("Felicidades, adivinaste el numero secreto");
//             //Imprime el array con tus errores
//             console.log("Tus errores: "+errores);
//         }else{
//             //Imprime en pantalla que te equivocaste
//             alert("Ups, El numero es incorrecto, vuelve a intentarlo!");
//             //Imprime en consola que te equivocaste
//             console.log("Ups, El numero es incorrecto, vuelve a intentarlo!");
//             //meter numeros incorrectos en el array errores.
//             errores.push(num);
//             //Volver a llamar a la función hasta que adivines
//             return adivinar();
//         }
//     }else{
//         alert("Ingresa un numero valido! entre 1 - 100");
//         return adivinar();
//     }
// }
// adivinar();