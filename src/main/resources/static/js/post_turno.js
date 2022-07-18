window.addEventListener('load', function() {

    const formulario =document.querySelector('#add_new_pacient');

    formulario.addEventListener('submit',function (event) {

        event.preventDefault();

        const formData = {
            paciente:{
                        id: document.querySelector('#idPaciente').value,
            },
            odontologo:{
                        id: document.querySelector('#idOdontologo').value,
                        },

            fechaYhora: document.querySelector('#fecha').value,
        }

        const url = '/turnos';
        const settings = {
            method: 'POST',
            headers:{
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        }

        fetch(url, settings)
            .then (response => {
            if (response.status !=200 ){
             let errorAlert = '<div class="alert alert-danger alert-dismissible">' +
                                '<button type="button" class ="close" data-dismisss="alert">&times;</button>' +
                                '<strong> Error, intente nuevamente </strong> </div>';

                            document.querySelector('#response').innerHTML = errorAlert;
            } else {
             let successAlert = '<div class="alert alert-success">' +
                                '<button type="button" class ="close" data-dismisss="alert">&times;</button>' +
                                '<strong></strong> Turno Agregado </div>'


                            document.querySelector('#response').innerHTML = successAlert;



            }
                resetUploadForm();

            })

            .catch (error => {
                let errorAlert = '<div class="alert alert-danger alert-dismissible">' +
                    '<button type="button" class ="close" data-dismisss="alert">&times;</button>' +
                    '<strong> Error, intente nuevamente </strong> </div>';

                document.querySelector('#response').innerHTML = errorAlert;
                document.querySelector('#response').style.display = "block";

                resetUploadForm();})

    });

    function resetUploadForm(){
        document.querySelector('#idPaciente').value = "";
        document.querySelector('#idOdontologo').value = "";
        document.querySelector('#fecha').value = "";
    }

});