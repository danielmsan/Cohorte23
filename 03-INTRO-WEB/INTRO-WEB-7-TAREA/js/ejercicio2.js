let contador = 0;

function mostrarInfo(card){
    const info = document.getElementsByClassName('info-text');
    const desactivar = document.getElementsByClassName('btn-success');

    desactivar[card].classList.add("disabled")
    info[card].hidden = false;
    contador++;
    console.log(contador);

    if(contador == 4){
        alert("Ya has visto toda la información");
        const mostrarBoton = document.getElementById('botonI');
        mostrarBoton.classList.remove('invisible');
    }else{
        console.log("siguele picando");
    }
}

function recargar(){
    window.location.reload();
}