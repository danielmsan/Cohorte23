function calcularTemp(){
    
const celcius = parseInt(prompt("Ingresa la temperatura en Celcius"));
if(isNaN(celcius)){
    alert("Ingresa una temperatura valida (solo valores numericos)");
    calcularTemp();
}else{
    const farenheit = (celcius * 9/5) + 32;
    const kelvin = celcius + 273.15; 
    console.log("La temperatura en Celcius es: "+celcius);
    console.log("La temperatura en farenheit es: "+farenheit);
    console.log("La temperatura en Kelvin es: "+kelvin);
    return
}
}
calcularTemp();