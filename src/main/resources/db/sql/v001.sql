--liquibase formatted sql

--changeset roomie_user:1 labels:schema-init rollbackEndDelimiter:/
CREATE SCHEMA IF NOT EXISTS data;

CREATE TABLE IF NOT EXISTS data.user
(
    id                    UUID        NOT NULL,
    first_name            VARCHAR(50) NOT NULL,
    last_name             VARCHAR(50) NOT NULL,
    date_of_birth         TIMESTAMP   NOT NULL,
    email                 VARCHAR(50) NOT NULL,
    phone_number          VARCHAR(50) NOT NULL,
    has_room              BOOLEAN     NOT NULL,
    is_verified           BOOLEAN     NOT NULL,
    date_joined           TIMESTAMP   NOT NULL,
    availability_starting TIMESTAMP   NOT NULL
);

CREATE UNIQUE INDEX IF NOT EXISTS pk_user
    ON data.user(id);

--rollback DROP SCHEMA IF EXISTS data CASCADE;
--rollback/