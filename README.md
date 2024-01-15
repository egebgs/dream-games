# Kubernetes Java App Deployment with Nginx Ingress

## Project Overview
This project involved deploying a Java application in a Kubernetes cluster, using Docker for containerization and Nginx as an Ingress controller for traffic management.


## Design Choices in Configuration

### Simple Java Project
- It is a simple Java project that has two endpoints:
    - **Health**: It is the health check of the application. The endpoint: `GET /health`
    - **Echo**: It echoes the given parameter and the value of it. The endpoint: `GET /echo`

### Kubernetes Deployment Configuration
- **Replica Count**: Set to 2 to ensure high availability.
- **Resource Limits**: Kept dynamic, allowing Kubernetes to auto-manage resources.

### Service Configuration
- **Type**: Initially `LoadBalancer`, then switched to `NodePort` for compatibility with the local Vagrant setup.

### Ingress Configuration
- **Path and Service Routing**: Configured to route traffic from root (`/`) to the app service.
- **Annotations**: Used `nginx.ingress.kubernetes.io/rewrite-target` for URL rewriting.

### Nginx Ingress Controller
- **Deployment**: Chose direct YAML manifest deployment for more control.
