window.addEventListener('load', function() {

    const formulario =document.querySelector('#add_new_pacient');

    formulario.addEventListener('submit',function (event) {

        event.preventDefault();

        const formData = {
            nombre: document.querySelector('#name').value,
            apellido: document.querySelector('#lastName').value,
            matricula: document.querySelector('#matricula').value,

        }


        const url = '/odontologos';
        const settings = {
            method: 'POST',
            headers:{
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData)
        }

        fetch(url, settings)
            .then (response => {

                let successAlert = '<div class="alert alert-success">' +
                    '<button type="button" class ="close" data-dismisss="alert">&times;</button>' +
                    '<strong></strong> Paciente agregado </div>'


                document.querySelector('#response').innerHTML = successAlert;
                document.querySelector('#response').style.display = "block";

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
        document.querySelector('#name').value = "";
        document.querySelector('#lastName').value = "";
        document.querySelector('#matricula').value = "";
    }

});