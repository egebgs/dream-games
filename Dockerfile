# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17-slim AS build

# Copy the project files to the container
COPY src /home/app/src
COPY pom.xml /home/app

# Build the application
RUN mvn -f /home/app/pom.xml clean package

# Stage 2: Create the final docker image
FROM openjdk:17-slim

# Copy the built artifact from the build stage
COPY --from=build /home/app/target/*.jar /usr/local/lib/app.jar
# Expose the port the application runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]

