#!/bin/bash

curl -i -X POST -H "Content-Type:application/json" \
--data '{"title":"This is my test book","description":"this is my book description",
"isbn": "12xxxxxxxx", "publisher": "None Yet",
"language":"English","author":"Hayri Cicek",
"price": "0.00","pages":"0"}' http://localhost:8081/restapi/books
