let lista = [12,5,80,34];

let lNueva = lista.map(
    function(valor){
        return valor * 2
    }
);
console.log(lNueva);


lista.sort(
    function(a,b){
        return b - a ;
        return b - a;
    }
);
console.log(lista);





lista.sort()
console.log(lista);




lista.reverse();
console.log(lista);








let remover = lista.splice(1,2);
console.log(remover);
console.log(lista);
lista.splice(2,0,100,200,300);
console.log(lista);


// let lista = [12,5,80,34,7];
// console.log(lista);
// lista.splice(1,2);
// console.log(lista);



// Quita primer lugar de la lista
lista.shift();
console.log(lista);


lista.pop();
console.log(lista);


let masE= lista.concat(100,200,300);
console.log(masE);



lista.push(100);
console.log(lista);


let msj = lista.join("-");
console.log(msj);



console.log(lista);
let listaNueva  =lista.slice(1,3);
console.log(listaNueva);







console.log(lista.length);

for(let i = 0; i< lista.length; i++){
    console.log("-->"+ lista[i]);
}
console.log(lista);

