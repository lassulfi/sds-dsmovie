FROM postgres:12

RUN usermod -u 1000 postgres

WORKDIR /app

COPY init.sql /docker-entrypoint-initdb.d/