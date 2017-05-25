curl --data "username=user&password=password" http://localhost:8080/login --cookie-jar cookies.txt
curl -i -X POST -H "Content-Type:application/json" -d "{  \"firstName\" : \"$1\",  \"lastName\" : \"$2\" }" http://localhost:8080/people --cookie cookies.txt
curl http://localhost:8080/people --cookie cookies.txt
