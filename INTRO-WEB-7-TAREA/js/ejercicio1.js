function cambiarNombre(){
    const nombre = prompt("Introduce un nombre: ");
    const saludo = document.getElementById('ejer1');
    saludo.textContent = nombre;
}