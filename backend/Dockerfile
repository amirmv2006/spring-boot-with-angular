FROM maven:3-jdk-8 as build
WORKDIR /usr/src/app
COPY pom.xml .
RUN mvn -B -e -C --no-transfer-progress -T 1C org.apache.maven.plugins:maven-dependency-plugin:3.1.1:go-offline
COPY . .
RUN mvn -B -e -o -T 1C clean install -DskipTests

FROM openjdk:8-jdk-alpine
COPY --from=build /usr/src/app/target/*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
