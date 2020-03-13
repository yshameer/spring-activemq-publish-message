
# Spring Active MQ Publish Service

This service provides basic operation to publish a message to a queue as a REST service
```
 `PUT /publishMessage`
 ```

Before running the project please update the application.properties under src/main/resources with your queue connection details

#Queue details
User name and password properties are optional default is set in spring-camel-activemq-starter
```
camel.activemq.userName=
camel.activemq.password=
camel.activemq.brokerUrl=failover://(tcp://queueconnectionurl:61616,tcp://backupurl:61616)?randomize=true

```

## Software required to build and run
```
Java: JDK 1.8+
Maven: Apache Maven 3.6.3+
```
## Package Information
If you are updating the package, please change the references in
```
com.github.yshameer.spring.activemq.publish.service.PublishMessageServiceApplication
   Line 11:  @ComponentScan(basePackages = "com.github.yshameer.spring.activemq.publish.service")

com.github.yshameer.spring.activemq.publish.service.configuration.SwaggerDocumentationConfig
   Line 31: RequestHandlerSelectors.basePackage("com.github.yshameer.spring.activemq.publish.service.api")
   
```

## Running Locally

To build and run with maven do the following:

```
mvn clean install
mvn spring-boot:run
```

## Testing Locally
```Swagger UI: http://localhost:8080```

## Dependency
This service uses camel active mq starter https://github.com/yshameer/spring-camel-activemq-starter as a dependency. 
If you want to make any specific changes to starter you may download and update the reference.

```
<dependency>
    <groupId>com.github.yshameer</groupId>
    <artifactId>spring-camel-activemq-starter</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
 ```
