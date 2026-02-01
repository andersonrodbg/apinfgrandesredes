FROM maven:3.9.6-eclipse-temurin-17

WORKDIR /app

COPY pom.xml .
RUN mvn -B -q -e -DskipTests dependency:go-offline

COPY src ./src

RUN mvn -DskipTests package

EXPOSE 8080

CMD ["java", "-jar", "target/*.jar"]
