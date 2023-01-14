#It gives some problem on MAC M1 processor, regarding docker host architecture difference with graalvm image,
# maybe this dockerfile can be executed on linux. https://www.graalvm.org/22.0/docs/getting-started/container-images/
FROM ghcr.io/graalvm/native-image:ol8-java17-22
ADD . /app
WORKDIR /app
RUN chmod 777 gradlew && ./gradlew nativeCompile

FROM oraclelinux:8-slim
COPY --from=0 "/build/native/nativeCompile/spring-boot-3-graalvm-native" spring-boot-graal
ENTRYPOINT ["/spring-boot-graal"]