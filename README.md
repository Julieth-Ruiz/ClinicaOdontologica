BACKEND

// Indicaciones para probar en Postman
ODONTOLOGO
-	Método Agregar: 
POST   localhost:8080/odontologos
{
"apellido": "Alicia",
"nombre": "Rodríguez",
"matricula" : 6543
}

-	Método Listar: 
GET   localhost:8080/odontologos/

-	Método Buscar: 
GET   localhost:8080/odontologos/1

-	Método Modificar: 
PUT   localhost:8080/odontologos
{
"id": 142,
"apellido": "Alicia",
"nombre": "Marin",
"matricula" : 6543
}

-	Método Eliminar: 
DELETE localhost:8080/odontologos/1




PACIENTE
-	Método Agregar: 
POST   localhost:8080/pacientes
{
        "nombre": "Juan",
        "apellido": "Lopez",
        "domicilio": {
            "calle": "calle 123",
            "numero": 64,
            "localidad": "Suba",
            "provincia": "Bogotá"
        },
        "dni": 6544,
        "fechaAlta": "2022-07-09T20:45:11.273+00:00"
    }


-	Método Listar: 
GET   localhost:8080/pacientes/

-	Método Buscar: 
GET   localhost:8080/pacientes/7

-	Método Modificar: 
PUT   localhost:8080/pacientes
{
        "id": 162,
        "nombre": "Juan",
        "apellido": "Novo",
        "domicilio": {
            "id": 163,
            "calle": "calle 232",
            "numero": 84,
            "localidad": "Suba",
            "provincia": "Bogotá"
        },
        "dni": 34455,
        "fechaAlta": "2022-07-09T20:45:11.273+00:00"
    }

-	Método Eliminar: 
DELETE localhost:8080/pacientes/142


TURNOS
-	Método Agregar: 
POST   localhost:8080/turnos
{
    "paciente": {
        "id": 140
    },
    "odontologo": {
    "id": 142
    },
    "fechaHora": "2020-04-14T10:45:07.719"
}


-	Método Listar: 
GET   localhost:8080/turnos/

-	Método Buscar: 
GET   localhost:8080/turnos/164

-	Método Modificar: 
PUT   localhost:8080/turnos
{
    "id": 166,
    "paciente": {
        "id": 57
    },
    "odontologo": {
    "id": 2
    },
    "fechaHora": "2020-04-14T10:45:07.719"
}

-	Método Eliminar: 
DELETE localhost:8080/turnos/138

FRONTEND

Métodos disponibles de Paciente, Turno y Odontólogo: Agregar y Listar
http://localhost:8080/index.html



 
