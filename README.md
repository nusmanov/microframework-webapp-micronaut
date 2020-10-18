# Prepare

### New Project with CLI
`sdk install micronaut`
### New Project with Web aka start.spring.io
https://launch.micronaut.io/

# Start
### Create a new project
`mn create-app webservice-micronaut --build maven`
### Create a new Controller
Creates the Web controller with a junit test
` mn create-controller Hello`

# Run
`java -jar ./target/webservice-micronaut-0.1.jar`
`curl localhost:8080/hello/Tom`



