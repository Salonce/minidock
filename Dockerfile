FROM eclipse-temurin@sha256:e34bfe6437b482c9e62f80a24f8e69ad268c82eb41096d1ac4d2f024eca0ed73
COPY miniDocker-0.0.1-SNAPSHOT.jar minidock.jar
ENTRYPOINT ["java","-jar","/minidock.jar"]