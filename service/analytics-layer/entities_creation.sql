SET FOREIGN_KEY_CHECKS=0;
-- Table: advertising_table
CREATE TABLE advertising_table (
    advertising_id UUID PRIMARY KEY,
    advertising_name VARCHAR(20) NOT NULL,
    advertising_version VARCHAR(4) NOT NULL,
    company VARCHAR(50) NOT NULL,
    product VARCHAR(20) NOT NULL,
    painel_id UUID NOT NULL,
    FOREIGN KEY (painel_id) REFERENCES painel_table(painel_id) ON DELETE CASCADE
);

-- Table: attention_table
CREATE TABLE attention_table (
    attention_id BIGINT PRIMARY KEY,
    attention_level ENUM('HIGH', 'MEDIUM', 'LOW', 'CRITICAL', 'URGENT', 'NORMAL', 'MINIMAL', 'SIGNIFICANT', 'IMPORTANT', 'ESSENTIAL') NOT NULL,
    attention_level_value TINYINT NOT NULL,
    look_count SMALLINT NOT NULL,
    people_count SMALLINT NOT NULL,
    attention_time_id BIGINT NOT NULL,
    painel_id UUID NOT NULL,
    FOREIGN KEY (attention_time_id) REFERENCES date_time_table(period_register_id) ON DELETE CASCADE,
    FOREIGN KEY (painel_id) REFERENCES painel_table(painel_id) ON DELETE CASCADE
);

-- Table: location_table
CREATE TABLE location_table (
    location_id UUID PRIMARY KEY,
    city_zone VARCHAR(10) NOT NULL,
    zip_code VARCHAR(10) NOT NULL,
    public_place VARCHAR(45) NOT NULL,
    street_number VARCHAR(5) NOT NULL,
    location_type ENUM('BUS', 'TRAIN', 'SUBWAY', 'SUPERMARKET', 'MALL', 'AIRPORT', 'ELEVATOR') NOT NULL,
    city VARCHAR(45) NOT NULL,
    district VARCHAR(4) NOT NULL,
    country VARCHAR(50) NOT NULL
);

-- Table: package_type_table
CREATE TABLE package_type_table (
    package_type_id UUID PRIMARY KEY,
    package_type ENUM('SIMPLE', 'MEDIUM', 'DEFAULT', 'ADVANCED') NOT NULL
);

-- Table: painel_table
CREATE TABLE painel_table (
    painel_id UUID PRIMARY KEY,
    identification VARCHAR(50) NOT NULL,
    model VARCHAR(20) NOT NULL,
    location_id UUID NOT NULL,
    package_type_id UUID NOT NULL,
    FOREIGN KEY (location_id) REFERENCES location_table(location_id) ON DELETE CASCADE,
    FOREIGN KEY (package_type_id) REFERENCES package_type_table(package_type_id) ON DELETE CASCADE
);

-- Table: date_time_table
CREATE TABLE date_time_table (
    period_register_id BIGINT PRIMARY KEY,
    day TINYINT NOT NULL,
    day_week ENUM('MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN') NOT NULL,
    hour TINYINT NOT NULL,
    minute TINYINT NOT NULL,
    period_of_the_day ENUM('MORN', 'AFTER', 'EVEN', 'NIGHT', 'MIDD', 'CRKD', 'SUNR', 'TWIL', 'DUSK', 'SUNS', 'LTNIG', 'MIDNG') NOT NULL,
    month ENUM('JAN', 'FEB', 'MAR', 'APR', 'MAY', 'JUN', 'JUL', 'AUG', 'SEP', 'OCT', 'NOV', 'DEC') NOT NULL,
    year VARCHAR(4) NOT NULL,
    register_time TIMESTAMP NOT NULL,
    advertising_id UUID NOT NULL,
    FOREIGN KEY (advertising_id) REFERENCES advertising_table(advertising_id) ON DELETE CASCADE
);

-- Table: reaction_table
CREATE TABLE reaction_table (
    reaction_id BIGINT PRIMARY KEY,
    reaction_type ENUM('NEGATIVE', 'NEUTRAL', 'POSITIVE') NOT NULL,
    period_time_id BIGINT NOT NULL,
    advertising_id UUID NOT NULL,
    location_id UUID NOT NULL,
    painel_id UUID NOT NULL,
    FOREIGN KEY (period_time_id) REFERENCES date_time_table(period_register_id) ON DELETE CASCADE,
    FOREIGN KEY (advertising_id) REFERENCES advertising_table(advertising_id) ON DELETE CASCADE,
    FOREIGN KEY (location_id) REFERENCES location_table(location_id) ON DELETE CASCADE,
    FOREIGN KEY (painel_id) REFERENCES painel_table(painel_id) ON DELETE CASCADE
);

-- Adding foreign key relationships to advertising_table
ALTER TABLE advertising_table
ADD CONSTRAINT fk_advertising_painel FOREIGN KEY (painel_id) REFERENCES painel_table(painel_id) ON DELETE CASCADE;

-- Adding foreign key relationships to attention_table
ALTER TABLE attention_table
ADD CONSTRAINT fk_attention_time FOREIGN KEY (attention_time_id) REFERENCES date_time_table(period_register_id) ON DELETE CASCADE,
ADD CONSTRAINT fk_attention_painel FOREIGN KEY (painel_id) REFERENCES painel_table(painel_id) ON DELETE CASCADE;
