call cd API_Discovery

call docker build --no-cache=true -t image/eureka-server .
call cd..
call cd customer

call docker build --no-cache=true -t image/customer .
call cd..
call cd customer-detail
call docker build --no-cache=true -t image/customer-detail .
call cd..
call docker-compose up