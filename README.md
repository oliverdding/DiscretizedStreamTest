# DiscretizedStreamTest

This project contains some test code for learning spark streaming.

## Preparation

1. [colima](https://github.com/abiosoft/colima)
2. [SparkOnK8s](https://github.com/GoogleCloudPlatform/spark-on-k8s-operator)

Only execute the bash below once:

```bash
helm repo add spark-operator https://googlecloudplatform.github.io/spark-on-k8s-operator # add spark-on-k8s repo for helm
```

Execute the bash below everytime you start to develop:

```bash
colima start --runtime containerd --with-kubernetes --cpu 4 --memory 8 # start colima with k8s support

helm install spark-operator spark-operator/spark-operator --namespace spark-operator --create-namespace # deploy spark-operator
```

Execute the bash below to deploy spark application:

```bash
kubectl -n default --ignore-not-found=true delete sparkapp dst # remove preview deployment

kubectl -n default apply -f deploy.yaml # deploy spark application
```

## Reference

* [paper](https://people.csail.mit.edu/matei/papers/2013/sosp_spark_streaming.pdf) for spark streaming
* [doc](https://spark.apache.org/docs/latest/streaming-programming-guide.html) for spark streaming
