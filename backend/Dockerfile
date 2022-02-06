FROM openjdk:11-jdk

CMD ["mvn"]

ENV MAVEN_HOME /opt/maven
ENV MAVEN_VERSION 3.8.4

RUN set -o errexit -o nounset \
    && echo "Downloading maven" \
    && wget --no-verbose --output-document=maven.gz "https://dlcdn.apache.org/maven/maven-3/3.8.4/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz" \
    \
    && echo "Installing maven" \
    && tar -vzxf maven.gz \
    && rm maven.gz \
    && mv "apache-maven-${MAVEN_VERSION}" "${MAVEN_HOME}/" \
    && ln --symbolic "${MAVEN_HOME}/bin/mvn" /usr/bin/mvn  \
    \
    && echo "Adding maven user and group" \
    && groupadd --system --gid 1000 maven \
    && useradd --system --gid maven --uid 1000 --shell /bin/bash --create-home maven \
    && mkdir /home/maven/.m2 \
    && chown --recursive maven:maven /home/maven

USER maven
VOLUME "/home/maven/.m2"
WORKDIR /home/maven

RUN set -o errexit -o nounset \
    && echo "Testing Maven installation" \
    && mvn --version