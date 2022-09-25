./mvnw clean package
docker build -t ic-bff:1.0 .
kubectl delete -f kubernetes_app.yaml -n insurance-kafka
kubectl apply -f kubernetes_app.yaml -n insurance-kafka

