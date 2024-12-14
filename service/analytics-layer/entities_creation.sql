SET FOREIGN_KEY_CHECKS=0;
-- Criar tabela para enums que são usados como strings
CREATE TABLE advertising_table (
    advertising_id BIGINT PRIMARY KEY,
    advertising_name VARCHAR(20) NOT NULL,
    advertising_version VARCHAR(4) NOT NULL,
    company VARCHAR(50) NOT NULL,
    product VARCHAR(20) NOT NULL,
    painel_id BIGINT NOT NULL,
    FOREIGN KEY (painel_id) REFERENCES painel_table(painel_id)
);

CREATE TABLE attention_table (
    attention_id BIGINT PRIMARY KEY,
    attention VARCHAR(20) NOT NULL,
    attention_level TINYINT NOT NULL,
    look_count SMALLINT NOT NULL,
    people_count SMALLINT NOT NULL,
    attention_time_id BIGINT NOT NULL,
    painel_id BIGINT NOT NULL,
    FOREIGN KEY (attention_time_id) REFERENCES date_time_table(period_register_id),
    FOREIGN KEY (painel_id) REFERENCES painel_table(painel_id)
);

CREATE TABLE location_table (
    location_id VARCHAR(36) PRIMARY KEY,
    zip_code VARCHAR(10) NOT NULL,
    public_place VARCHAR(45) NOT NULL,
    street_number VARCHAR(5) NOT NULL,
    location_type VARCHAR(20) NOT NULL,
    city VARCHAR(45) NOT NULL,
    district VARCHAR(4) NOT NULL,
    state VARCHAR(4) NOT NULL,
    country VARCHAR(50) NOT NULL
);

CREATE TABLE package_type_table (
    package_type_id BIGINT PRIMARY KEY,
    package_type VARCHAR(10) NOT NULL
);

CREATE TABLE painel_table (
    painel_id BIGINT PRIMARY KEY,
    identification VARCHAR(50) NOT NULL,
    painel_status VARCHAR(6) NOT NULL,
    model VARCHAR(20) NOT NULL,
    location_id BIGINT NOT NULL,
    package_type_id BIGINT NOT NULL,
    FOREIGN KEY (location_id) REFERENCES location_table(location_id),
    FOREIGN KEY (package_type_id) REFERENCES package_type_table(package_type_id)
);

CREATE TABLE date_time_table (
    period_register_id BIGINT PRIMARY KEY,
    day TINYINT NOT NULL,
    day_week VARCHAR(3) NOT NULL,
    hour TINYINT NOT NULL,
    minute TINYINT NOT NULL,
    period_of_the_day VARCHAR(5) NOT NULL,
    month VARCHAR(3) NOT NULL,
    year VARCHAR(4) NOT NULL,
    register_time TIMESTAMP NOT NULL
);

CREATE TABLE reaction_table (
    reaction_id BIGINT PRIMARY KEY,
    reaction_type VARCHAR(10) NOT NULL,
    period_time_id BIGINT NOT NULL,
    advertising_id BIGINT NOT NULL,
    location_id BIGINT NOT NULL,
    painel_id BIGINT NOT NULL,
    FOREIGN KEY (period_time_id) REFERENCES date_time_table(period_register_id),
    FOREIGN KEY (advertising_id) REFERENCES advertising_table(advertising_id),
    FOREIGN KEY (location_id) REFERENCES location_table(location_id),
    FOREIGN KEY (painel_id) REFERENCES painel_table(painel_id)
);

-- Relacionamentos adicionais para listas (OneToMany)
ALTER TABLE advertising_table
ADD CONSTRAINT fk_advertising_painel FOREIGN KEY (painel_id) REFERENCES painel_table(painel_id);

ALTER TABLE attention_table
ADD CONSTRAINT fk_attention_painel FOREIGN KEY (painel_id) REFERENCES painel_table(painel_id);

ALTER TABLE location_table
ADD CONSTRAINT fk_location_painel FOREIGN KEY (location_id) REFERENCES painel_table(painel_id);