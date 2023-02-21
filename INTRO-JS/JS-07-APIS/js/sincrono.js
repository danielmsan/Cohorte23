alert("cohorte 23");
console.log("hola,buen día");
alert("dia del gatito");
console.log("adios");

// setTimeout(
//     function (){
//         console.log("hola mundo, con retraso");
//     },1000)
//     console.log("sorpresa");

const myCallBack = () => console.log("hola mundo con retraso");

setTimeout(myCallBack,0);
console.log("sorpresa");