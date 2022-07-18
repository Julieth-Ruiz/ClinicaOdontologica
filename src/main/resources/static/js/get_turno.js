window.addEventListener('load', function() {
    (function(){
     const url = '/turnos';
            const settings = {
                method: 'GET'
     }
     fetch(url, settings)
     .then (response => response.json())
     .then (data => {
     for (turno of data){
     var table = document.getElementById("turno_table");
     var turnoRow = table.insertRow();
     let tr_id = 'tr' + turno.id;
     turnoRow.id = tr_id;

     let deleteButton = '<button' + ' id =' + '\"' + 'btn_delete_' + turno.id + '\"' +
     ' type="button" onclick="deleteBy('+turno.id+')" class = "btn-btn-danger btn_id" class ="close" data-dismisss="alert">&times' +
     '</button'


//     let updateButton = '<button' + ' id =' + '\"' + 'btn_delete_' + turnos.id + '\"' +
//          ' type="button" onclick="deleteBy('+turnos.id+')" class = "btn-btn-info btn_id" class ="close" data-dismisss="alert">&times' +
//          '</button'


     turnoRow.innerHTML = '<td>' + turno.id.toString().toUpperCase() + '</td>'+
                             '<td>' + turno.paciente.nombre.toUpperCase() + ' ' + turno.paciente.apellido.toUpperCase() + '</td>'  +
                             '<td>' + turno.odontologo.nombre.toUpperCase() + ' ' + turno.odontologo.apellido.toUpperCase() +'</td>' +
                             '<td>' + turno.fechaHora.toUpperCase() + '</td>' +
                             '<td>' + deleteButton + '</td>';


     }



    })
  })()
});