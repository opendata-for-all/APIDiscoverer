# APIDiscoverer
APIDiscoverer generates an OpenAPI description (version 2.0) by examining and analyzing a sample of requests/responses sent/received by a user when interacting with a REST Web API. The tool is implemented as a Web application which provides a user-friendly interface offering a form to invoke a REST Web API and download the discovered OpenAPI description.

## Using the tool

The tool is available at [http://som-research.uoc.edu/tools/APIDiscoverer](http://som-research.uoc.edu/tools/APIDiscoverer).
You can also download the file [apidiscoverer.war](https://github.com/SOM-Research/APIDiscoverer/raw/master/apidiscoverer/apidiscoverer.war "apidiscoverer.war") and deploy it in a servlet container such as [Apache Tomcat](http://tomcat.apache.org/ "Apache Tomcat") then you're ready to use APIDiscoverer.

You can access the tool from: http://localhost:8080/apidiscoverer (using the default Tomcat configuration). 

Start calling your API using the central form. The response of the request is displayed in the bottom panel.  After each request, the left and right panels are updated in order to display the calls history and an intermediate OpenAPI model, respectively. Finally, a button in the top panel allows you to download the final OpenAPI description file. 

## What is coming next?

We  are expanding the approach to improve the discovery process and to cover other aspects  such as security.
If you have any recommendation, just contact us.

## Who is behind this project?

* [Hamza Ed-douibi](http://github.com/hamzaed/ "Hamza Ed-douibi")
* [Javier Canovas](http://github.com/jlcanovas/ "Javier Canovas")
* [Jordi Cabot](http://github.com/jcabot/ "Jordi Cabot")

Hamza, Javier and Jordi are currently members of SOM, a research team of IN3-UOC.

