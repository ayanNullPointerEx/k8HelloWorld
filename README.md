# k8HelloWorld
Commands to run this in Minikube -

start minikube - 
minikube start

set docker repo - 
eval $(minikube docker-env)

build docker image - 
./gradle clean build
docker build --tag=ayan:v1.0.0 .

check docker image -
docker images

check initial status of all pods n services - 
kubectl get all

deploy in kubernetes - 
kubectl create -f deployment.yml
kubectl create -f service.yml

check final status of all pods n services - 
kubectl get all

find k8 cluster ip-
kubectl cluster-info

check pod logs - 
kubectl logs <pod_name>

to check a pod status - 
kubectl describe pods <pod_name>

delete a pod/service - 
kubectl delete <object_name>
