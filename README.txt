Camel Servlet REST and Apache Tomcat example
=======================================

This example shows how to use Servlet REST to define REST endpoints in Camel routes using the Rest DSL

This example is implemented in the Java DSLs.

For Java DSL the routes are defined in Java code, in the org.apache.camel.example.rest.RestRouteBuilder class.

You will need to package this example first:
  mvn package

To run the example deploy it in Apache Tomcat by copying the .war to the
deploy folder of Apache Tomcat.

And then hit this url from a web browser which has further instructions
  http://localhost:8080/providerservice

Included in this example is an api browser using Swagger. You can see the API from this url:
  http://localhost:8080/providerservice/index.html

You can also try the example from Maven using
   mvn jetty:run

... and use the following url

  http://localhost:8080/

If you hit any problems please let me know!
---------------------------------------