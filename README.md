## sonar play test project


## start sonar

see https://github.com/docker-library/docs/tree/master/sonarqube

```
docker run -d --name sonarqube -p 9000:9000 -p 9092:9092 sonarqube
```

## test and upload to sonar

`sbt jacoco:check sonar`



