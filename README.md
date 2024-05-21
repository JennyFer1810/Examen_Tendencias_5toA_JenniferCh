Json Pruebas Examen
JSON PACIENTE----RELACIONADO MEDICO-----------
{
  "id": 1,
  "nombre": "maria",
  "celular": 58955555,
  "medico": {
    "id": 1 
}
}

{
  "id": 2,
  "nombre": "alejandra",
  "celular": 99874585,
  "medico": {
    "id": 1 
}
}

{
  "id": 3,
  "nombre": "belen",
  "celular": 659874,
  "medico": {
    "id": 2 
}
}



JSON MEDICO--------RELACIONADO CONSULTORIO---------
{
  "id": 1,
  "nombre": "jefferson",
  "especialidad": "cirujano",
  "consultorio": {
    "id": 1
  }
}

{
  "id": 2,
  "nombre": "jennifer",
  "especialidad": "forence",
  "consultorio": {
    "id": 2
  }
}

{
  "id": 3,
  "nombre": "maria",
  "especialidad": "obstetriz",
  "consultorio": {
    "id": 2
  }
}


JSON CITA----------RELACION MEDICO-------
{
  "id": 1,
  "fecha": "2024-05-20T10:00:00",
  "confirmada": true,
  "descripcion": "dermatologa",
  "telefono": 225855,
  "medico": {
    "id": 1 
  }
}

{
  "id": 2,
  "fecha": "2024-04-19T10:00:00",
  "confirmada": false,
  "descripcion": "revisión de glucosa",
  "telefono": 3202546,
  "medico": {
    "id": 2 
  }
}

{
  "id": 3,
  "fecha": "2024-10-18T10:00:00",
  "confirmada": false,
  "descripcion": "electrocardiograma programado",
  "telefono": 2365487,
  "medico": {
    "id": 3 
  }
}

JSON CONSULTORIO-----------
  {
    "id": 1,
    "nombre": "cirugia",
    "ubicacion": "piso 3"
  },
  {
    "id": 2,
    "nombre": "medicina general",
    "ubicacion": "piso 6"
  },
  {
    "id": 3,
    "nombre": "medicina legal",
    "ubicacion": "sub suelo 1"
  }
