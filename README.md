# spring-boot-3-graalvm-native

Example project for investigating java-17 features on spring boot based on graalvm native

[Features](https://dzone.com/articles/whats-new-between-java-11-and-java-17)

For native compile
On IDE terminal session
1. `export JAVA_HOME="/Library/Java/JavaVirtualMachines/graalvm-ce-java17-22.3.0/Contents/Home"`
2. `./gradlew nativeCompile`

[Containerise a Native Executable and Run in a Docker Container](https://www.graalvm.org/22.2/reference-manual/native-image/guides/containerise-native-executable-and-run-in-docker-container/)

The output of a native executable is platform-dependent.
If you use a Mac or Windows, to build a Docker image containing your native executable you need to build a native executable within a Docker container
– so you need a container with a JDK distribution.
If you are a Linux user, you can just pass a native executable to Docker and use the simplest slim or distroless container,
depending on static libraries your application is linked against.

Image building can be ended with problem on Mac M1 processors regarding architecture issues of docker host

[GraalVM Community Images](https://www.graalvm.org/22.0/docs/getting-started/container-images/)
There are different GraalVM Community container images provided depending
on the architecture and the Java version.
GraalVM binaries are built for Linux, macOS, and Windows platforms on x86 64-bit systems, 
and for Linux on ARM 64-bit systems. The images are multi-arch (aarch64 or amd64 will be pulled depending on Docker host architecture),
and tagged with the format ghcr.io/graalvm/IMAGE_NAME:version.