# Spring Boot Application and Angular
This project runs a Spring Boot Application as Backend and an Angular SPA as Frontend. It's best
if you have [docker](https://www.docker.com/products/docker-desktop) installed on your machine. 

## Running the application
You can run the application with docker compose. This will build the project without running tests
and starts a docker container for [back-end on port 8081](http://localhost:8081) and another docker
container for [front-end on port 8080](http://localhost:8081). Whenever you want to stop these
containers just press "Ctrl+C".
```shell script
docker-compose up --build
```
## Setting up the Continuous Integration
Please Click [here](ci/README.md) to see how to set up Continuous Integration.   
