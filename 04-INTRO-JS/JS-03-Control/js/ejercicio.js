let diaNumero = parseInt(prompt("ingresa un numero del 0 al 6 para decirte un dia"));

if(diaNumero == 0){
    document.write("<h2>Domingo</h2>");
}else if(diaNumero == 1){
    document.write("<h2>Lunes</h2>");
}else if(diaNumero == 2){
    document.write("<h2>Martes</h2>");
}else if(diaNumero == 3){
    document.write("<h2>Miercoles</h2>");
}else if(diaNumero == 4){
    document.write("<h2>Jueves</h2>");
}else if(diaNumero == 5){
    document.write("<h2>Viernes</h2>");
}else if(diaNumero == 6){
    document.write("<h2>Sabado</h2>");
}else{
    document.write("<h2>Numero de día inválido</h2>");
}

let diaNúmero = parseInt(prompt("Escribe el Numero correspondiente al dia de la semana donde 0 es Domingo y Sabado 6: "));

switch (diaNúmero) {
    case 0:
        document.write("Domingo");
        break;
    case 1:
        document.write("Lunes");
        break;
    case 2:
        document.write("Martes");
        break;
    case 3:
        document.write("Miércoles");
        break;
    case 4:
        document.write("Jueves");
        break;
    case 5:
        document.write("Viernes");
        break;
    case 6:
        document.write("Sábado");
        break;
    default:
        document.write("Número de día inválido, selecciona un numero del 1 al 6");
}

let numeroDia = parseInt(prompt("Ingresa un numero entre 0-6 para darte un dia de la semana:)"));
      let diasSemana = ["Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"];

      if (numeroDia >= 0 && numeroDia <= 6) {
        console.log(diasSemana[numeroDia]);
      } else {
        console.log("Inválido");
      }

      let q = true;
      let p = false;
      if (q && p) console.log("true");