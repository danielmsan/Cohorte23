let gente = ["Sofia","David","Juan"];
console.log("Las personas esperando en el banco son: "+gente);

gente.push("Sara","Agustin");
console.log("Ahora son: "+gente);

gente.splice(2,0,"Renata");
console.log(gente);


// for(let 1=0; i<=5;i++){

// }
for (var i = 1; i <= 5; i++) {
    var fila = i;
    for (var j = 1; j <= i; j++) {
      fila = fila + "* ";
    }
    console.log(fila);
  }

  let xvalue = 99;
  while(xvalue >=0){
    console.log(xvalue);
    xvalue= xvalue-0.5;
  }

  let yvalue= 1;
  while(yvalue <=100 ){
    if(yvalue%2!==0){
        console.log(yvalue);
    }
    yvalue++;
  }

  let i = 1;
  let n= 6;
  while(i<= n){
    console.log("["+i+"]");
    i++;
  }
 
  function sumas(n){
    var i = 1;
    suma=0;
    while (i <= n) {

        suma = suma + i;
        i++;
    }
    console.log("la suma es: "+suma);

}
sumas(5);

function sumarArray(n){
    let i = 0;
    let suma = 0;
    while(i<= n){
        suma+=i;
        console.log(suma);
        i++;
    }
    console.log("la suma es:" + suma);
}
sumarArray(5);
