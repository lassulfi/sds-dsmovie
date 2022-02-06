FROM postgres:12

RUN usermod -u 1000 postgres

WORKDIR /app

COPY ./scripts/db/init.sh /docker-entrypoint-initdb.d
COPY ./scripts/db/dump.sql ./scripts/db/dump.sql