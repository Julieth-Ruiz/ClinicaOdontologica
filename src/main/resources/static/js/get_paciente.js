window.addEventListener('load', function() {
    (function(){
     const url = '/pacientes';
            const settings = {
                method: 'GET'
     }
     fetch(url, settings)
     .then (response => response.json())
     .then (data => {
     for (paciente of data){
     var table = document.getElementById("paciente_table");
     var pacienteRow = table.insertRow();
     let tr_id = 'tr' + paciente.id;
     pacienteRow.id = tr_id;

     let deleteButton = '<button' + ' id =' + '\"' + 'btn_delete_' + paciente.id + '\"' +
     ' type="button" onclick="deleteBy('+paciente.id+')" class = "btn-btn-danger btn_id" class ="close" data-dismisss="alert">&times' +
     '</button'


     let updateButton = '<button' + ' id =' + '\"' + 'btn_delete_' + paciente.id + '\"' +
          ' type="button" onclick="deleteBy('+paciente.id+')" class = "btn-btn-info btn_id" class ="close" data-dismisss="alert">&times' +
          '</button'


     pacienteRow.innerHTML = '<td>' + paciente.id.toString().toUpperCase() + '</td>'+
                             '<td>' + paciente.nombre.toUpperCase() + '</td>'  +
                             '<td>' + paciente.apellido.toUpperCase() + '</td>' +
                             '<td>' + paciente.domicilio.calle.toUpperCase() + ' ' + paciente.domicilio.numero.toString().toUpperCase() + ' ' + paciente.domicilio.localidad.toUpperCase() + ' ' + paciente.domicilio.provincia.toUpperCase() + '</td>' +
                             '<td>' + paciente.dni.toString().toUpperCase() + '</td>' +
                             '<td>' + paciente.fechaAlta.toUpperCase() + '</td>' +
                             '<td>' + deleteButton + '</td>';


     }



    })
  })()
});