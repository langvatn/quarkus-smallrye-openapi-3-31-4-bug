# quarkus-smallrye-openapi-3-31-4-bug

This project is a minimal example to recreate a bug with quarkus-smallrye-openapi on version 3.31.4

## Start by

```bash
 quarkus dev
```

Got to http://localhost:8080/docs/#/Example%20Resource/get_example

Click "Try it out" then "Execute". 

### Expected behavior

Should send a GET request and get a response with the parms included in the request. 
### Actual behavior

Unable to pass the default validation with the error: 

````
Please correct the following validation errors and try again.

    For 'limit': Required field is not provided.
    For 'offset': Required field is not provided. 
````


## Version
java --version
````
openjdk 21.0.2 2024-01-16
OpenJDK Runtime Environment GraalVM CE 21.0.2+13.1 (build 21.0.2+13-jvmci-23.1-b30)
OpenJDK 64-Bit Server VM GraalVM CE 21.0.2+13.1 (build 21.0.2+13-jvmci-23.1-b30, mixed mode, sharing)
````
