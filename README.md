# Asynchronous_RMI_Dictionary_Service

## Asynchronous RMI Dictionary Service

This is project for the Distributed Systems 2017 module.
The module is taught to undergraduate students at [GMIT](http://www.gmit.ie) in the Department of Computer Science and Applied Physics.
The lecturer is Patrick Mannion.

### Project Requirements Overview

You are required to use the Servlet/JSP and Java RMI frameworks to develop a remote, asynchronous dictionary lookup service. A JSP page should provide users with the ability to specify a string which will be checked against the dictionary. The HTML form information should be dispatched to a servlet that adds the client request to an in-queue and then returns a job ID to the web client. The web client should poll the web server periodically (every 10 seconds) and query if the request has been processed. Client requests in the inQueue should be periodically removed and processed (every 10 seconds). 

### RMI Applications

RMI applications often comprise two separate programs, a server and a client. A typical server program creates some remote objects, makes references to these objects accessible, and waits for clients to invoke methods on these objects. A typical client program obtains a remote reference to one or more remote objects on a server and then invokes methods on them. RMI provides the mechanism by which the server and the client communicate and pass information back and forth. Such an application is sometimes referred to as a distributed object application.

### Advantages of Dynamic Code Loading

One of the central and unique features of RMI is its ability to download the definition of an object's class if the class is not defined in the receiver's Java virtual machine. All of the types and behavior of an object, previously available only in a single Java virtual machine, can be transmitted to another, possibly remote, Java virtual machine. RMI passes objects by their actual classes, so the behavior of the objects is not changed when they are sent to another Java virtual machine. This capability enables new types and behaviors to be introduced into a remote Java virtual machine, thus dynamically extending the behavior of an application. The compute engine example in this trail uses this capability to introduce new behavior to a distributed program.
## How to run the application

The Application can be started by executing [Server.jar](https://github.com/andryuha77/Asynchronous_RMI_Dictionary_Service/blob/master/Server.jar) and [Client.war](https://github.com/andryuha77/Asynchronous_RMI_Dictionary_Service/blob/master/Client.war) archives.

1. CD to location containing [Server.jar](https://github.com/andryuha77/Asynchronous_RMI_Dictionary_Service/blob/master/Server.jar) 

2. Execute .jar using:
```
java -cp ./Server.jar ie.gmit.sw.DictionaryServiceServer
```
[Tom-cat 9](https://tomcat.apache.org/download-90.cgi) was used to ru the Dynamic Web App. 

3. Place [Client.war](https://github.com/andryuha77/Asynchronous_RMI_Dictionary_Service/blob/master/Client.war) file in the /webapps folder of [Tom-cat](https://tomcat.apache.org/download-90.cgi) installation location.
```
C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps
```
4. Start [Tom-cat](https://tomcat.apache.org/download-90.cgi) by Executing Tomcat9.exe in:
```
C:\Program Files\Apache Software Foundation\Tomcat 9.0\bin
```
5. Access the application by navigating in your browser to:
```
http://localhost:8080/Client/
```
Alternatively, the application can be launched  in [Eclipse](https://www.eclipse.org/).

