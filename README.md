# GI Source

[Tinkering](http://docs.spring.io/spring-cloud-stream/docs/current/reference/htmlsingle/#_getting_started) 
with event publishing.

## Build

    ./mvnw clean package

## Run

    java -jar target/gi-source.jar

## Prerequisites

 * JDK 8 ([Oracle download](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html))
 * Redis ([Docker image](https://store.docker.com/images/redis))

```
# Just a hint:
docker run -p 6379:6379 redis
```

Alternatively, Kafka can be used transparently, see `pom.xml`.
