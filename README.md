# Kata_3_1_6


GET http://94.198.50.185:7081/api/users
Accept: application/json

###
POST http://94.198.50.185:7081/api/users
Accept: application/json
Content-Type: application/json

{
    "id": 3,
    "name": "James",
    "lastName": "Brown",
    "age": 77

}

###
PUT http://94.198.50.185:7081/api/users
Content-Type: application/json

{
"id": 3,
"name": "Thomas",
"lastName": "Shelby",
"age": 88

}

###
DELETE http://94.198.50.185:7081/api/users/3
Content-Type: application/json
