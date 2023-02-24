let nombre = "Daniel";
let apellido = "Morales";

let persona = {
    nombre: 'Juan',
    apellido : 'Perez',
    nombreCompleto: function(){ //this. hace referencia a la propiedad
        return 'el nombre es ' + this.nombre + ' '+this.apellido;
    }
}

console.log(persona);
console.log(persona.nombre);
console.log(persona.nombreCompleto());
//El objeto es una abstracción o una instancia 