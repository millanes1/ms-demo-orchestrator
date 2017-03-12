
# Microservice Template.

## 1 Overview
This project contains the Microservice Orchestrator. It uses docker in development, build and production.

## 2 Developing locally 
Local development is done via a development docker image. As a minimum requirement, you need docker installed and a local clone of this repository.

> For information about install docker in your machine follow the next link :
> https://docs.docker.com/engine/installation/

> Note, for run this MicroService is necessary up  MSEmployee y MSTypeCode docker image. Here the link to pull and run:
> MS Employee docker image :  https://github.com/millanes1/poc-mc-employee.git
> MS TypeCode docker image :  https://github.com/millanes1/ms-display-typicode.git

### 2.1 Creating and running your docker development environment

#### 2.1.1 Using Docker Compose

The most simple way to build & run the MicroService is using Docker Composer, to this run the next command in the current folder **(repository root)**:

```docker-compose up```

#### 2.1.2 Manual Method

First, you need to build your docker image. To do so, run a similar command from your **repository root**:     

```docker build -f Dockerfile.dev -t  msdemoorchestrator_demo.```



Finally you can view the application at ```http://localhost:8079/orchestrator```  



