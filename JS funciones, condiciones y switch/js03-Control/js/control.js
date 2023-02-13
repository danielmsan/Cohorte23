let edad = parseInt(prompt("Escribe tu edad"));

if(edad <= 17 ){
    document.write("<h2>tas chikitin</h2>");
}else if(edad > 18) {
    document.write("<h2>Tas ruco</h2>");
}else if(edad=== 18 ){
    document.write("<h2>a perro tienes 25</h2>")
}
else{
    document.write("este no es un valor valido");
}

// AND &&  true && true = true
// OR ||   true || false = true
// NOT !   true! == true = false