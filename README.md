docker run -d -p 9411:9411 openzipkin/zipkin


start up the 4 apps


make a few calls to entry app below

http://localhost:8080/test

demo will call app1 and app 2 and app 1 will call app3.

go to zipkin and notice calls and traces


http://localhost:9411/zipkin/