window.addEventListener('load', function() {
    (function(){
     const url = '/odontologos';
            const settings = {
                method: 'GET'
     }
     fetch(url, settings)
     .then (response => response.json())
     .then (data => {
     for (odontologo of data){
     var table = document.getElementById("odontologo_table");
     var odontologoRow = table.insertRow();
     let tr_id = 'tr' + odontologo.id;
     odontologoRow.id = tr_id;

     let deleteButton = '<button' + ' id =' + '\"' + 'btn_delete_' + odontologo.id + '\"' +
     ' type="button" onclick="deleteBy('+odontologo.id+')" class = "btn-btn-danger btn_id" class ="close" data-dismisss="alert">&times' +
     '</button'


//     let updateButton = '<button' + ' id =' + '\"' + 'btn_delete_' + odontologo.id + '\"' +
//          ' type="button" onclick="deleteBy('+odontologo.id+')" class = "btn-btn-info btn_id" class ="close" data-dismisss="alert">&times' +
//          '</button'


     odontologoRow.innerHTML = '<td>' + odontologo.id.toString().toUpperCase() + '</td>'+
                               '<td>' + odontologo.nombre.toUpperCase() + '</td>'  +
                               '<td>' + odontologo.apellido.toUpperCase() + '</td>' +
                               '<td>' + odontologo.matricula.toString().toUpperCase() + '</td>' +
                               '<td>' + deleteButton + '</td>';


     }



    })
  })()
});