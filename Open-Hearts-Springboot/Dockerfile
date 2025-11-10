# Stage 1: Build the Application
# Using a specific, known-good tag for Maven 3.9.6 with Eclipse Temurin JDK 21 on a Jammy base.
FROM maven:3.9.6-eclipse-temurin-21-jammy AS build 
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create the Final, Lightweight Runtime Image
# Keep this one as the simple tag, as it's often the most reliable for JRE:
FROM eclipse-temurin:21-jre 
EXPOSE 8080 
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]