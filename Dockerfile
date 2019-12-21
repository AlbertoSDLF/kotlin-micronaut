FROM oracle/graalvm-ce:19.2.1 as graalvm
COPY . /home/app/kotlin-micronaut
WORKDIR /home/app/kotlin-micronaut
RUN gu install native-image
RUN native-image --no-server -cp build/libs/*-all.jar

FROM frolvlad/alpine-glibc
EXPOSE 8080
COPY --from=graalvm /home/app/kotlin-micronaut .
ENTRYPOINT ["./kotlin-micronaut"]
