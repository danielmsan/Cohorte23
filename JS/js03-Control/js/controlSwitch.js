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