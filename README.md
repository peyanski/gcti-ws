## Synopsis

RESTful web service using Spring Boot, Spring Data JPA and Oracle Database. With all working CRUD operations.

Example requests:
    http://localhost:8036/client/088xxxxxxx - GET
    http://localhost:8036/client/088xxxxxxx - DEL
    http://localhost:8036/client/addclient - POST
        `{
            "specialind": "1",
            "msisdn": "088xxxxxxx",
            "simstatus": "1",
            "customertype": "1",
            "customersubtype": "1",
            "effectivesegment": "1",
            "servicesegment": "1",
            "sublevelind": 1,
            "pin": "1",
            "acclevelind": "1",
            "segment": "1"
        }`
    http://localhost:8036/client/updateclient/088xxxxxxx - PUT
        `{
            "specialind": "1",
            "msisdn": "088xxxxxxx",
            "simstatus": "5",
            "customertype": "1",
            "customersubtype": "1",
            "effectivesegment": "1",
            "servicesegment": "1",
            "sublevelind": 1,
            "pin": "1",
            "acclevelind": "1",
            "segment": "2"

        }`


## Build & Run

1. Clone the project from the repository
2. rename application.properties.example to application.properties and the Oracle credentials
3. Use maven to build and run it:
    mvn clean package && mvn spring-boot:run


## Tests

// TODO

## License

Free for use