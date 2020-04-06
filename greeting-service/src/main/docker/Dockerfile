FROM openjdk:15-slim-buster
RUN apt-get update && \
    apt-get install -y curl wget vim git jq bash bash-completion tcpdump && \
    apt-get autoclean && \
    apt-get autoremove && \
    mkdir -p /opt/microservices && \
    useradd -ms /bin/bash usrjava && \
    chown -R usrjava /opt/
WORKDIR /opt/microservices
EXPOSE 8080
USER usrjava
ADD maven/greeting-service.jar /opt/microservices/app.jar
CMD ["-Duser.timezone=America/Sao_Paulo", "-Duser.country=br", "-Duser.language=pt" ,"-Djava.security.egd=file:/dev/urandom", "-Xmx1024m", "-jar", "app.jar"]
ENTRYPOINT ["java"]
