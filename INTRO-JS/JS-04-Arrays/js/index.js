// let miVariable = 5;

// //Tipo de dato estructurado
//             // 0,1,2,3,4,5
// let miArray = [2,3,4,5,6,7];
// // let miArray = new Array();

// console.log("Mi array: " + miArray[0]);
// console.log("Mi array: " + miArray[1]);

// let miArray1 = [
// //  0  1  2
//     [1,2,3], //0 
//     [4,5,6], //1
//     [7,8,9]  //2
// ]
// let matrizR= [
//     [],[],[]
// ]
// for(let i = 0; i < 3; i++ ){
//     for(let j= 0; j < 3; j++){
//         matrizR[i][j] = miArray[i][j] * miArray1[i][j];
//     }
// }
// console.log("MatrizR->"+ matrizR);
// for(let i = 0; i < 3; i++ ){
//     for(let j= 0; j < 3; j++){
//         console.log("matrizR-> " + miArray1[i][j]);
//     }
// }


// console.log("mi array1 "+miArray1[0][0]);
// console.log("mi array1 "+miArray1[0][1]);
// console.log("mi array1 "+miArray1[0][2]);

// miArray.push(8,9,10,11)
// console.log(miArray);

//ITERADOR DEFINIDO O FOR saber donde empieza y termina
// for(let i=0; i <=miArray.length-1; i++){
// console.log("imprimiendo miArray -> "+ miArray[i]);
// }
// let miVariable = 5;


// //let miArray = new Array();
// console.log("miArray" + miArray[0]);
// console.log("miArray" + miArray[1]);


// console.log("miArray1 " + miArray1[0][1]);
// console.log("miArray1 " + miArray1[0][2]);
// console.log("miArray1 " + miArray1[2][1]);
// console.log("miArray1 " + miArray1[1][2]);
// console.log("miArray1 " + miArray1[1][0]);

// console.log("todo el indice " + miArray1[0]);
// console.log("todo el indice " + miArray1[1]);
// console.log("todo el indice " + miArray1[2]);


/************************** Cilco For ************************************* */

let miArray = [2, 3, 4, 5, 6, 7];

for (let i = 0; i <= 5; i++) {
    console.log("imprimiendo miArray -> " + miArray);
}

let miArray1 = [ 
    [1, 2, 3],    
    [4, 5, 6],     
    [7, 8, 9]
];
let matrizR= [
    [],[],[]
]

for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        matrizR[i][j] = miArray1[i][j] * miArray1[i][j];
    }
    
}
console.log("MatrizR->"+matrizR);

for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        console.log("matrizR -> " + miArray1[i][j]);
    }
}

/* ******************while*********************** */
/*
let variable inicio

while(condicion){

}
*/
let contador = 0;
while(contador < 10){
    console.log(contador);
    contador++;
}