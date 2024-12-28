SET FOREIGN_KEY_CHECKS=0;

-- Tabela: advertising_table
CREATE TABLE advertising_table (
    advertising_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    advertising_name VARCHAR(20) NOT NULL,
    advertising_version VARCHAR(4) NOT NULL,
    advertising_company VARCHAR(50) NOT NULL,
    product VARCHAR(20) NOT NULL,
    creation_date_time DATETIME NOT NULL
);

-- Tabela: location_table
CREATE TABLE location_table (
    location_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    street_name VARCHAR(45) NOT NULL,
    street_number VARCHAR(5) NOT NULL,
    location_type ENUM('BUS', 'TRAIN', 'SUBWAY', 'SUPERMARKET', 'MALL', 'AIRPORT', 'ELEVATOR') NOT NULL,
    location_description VARCHAR(255) NOT NULL,
    city VARCHAR(45) NOT NULL,
    city_zone ENUM('DOWNTOWN', 'UPTOWN', 'MIDTOWN', 'WEST_END', 'EAST_SIDE', 'NORTHSIDE', 'SOUTH_END', 'CENTRAL_DISTRICT', 'RIVERFRONT', 'OLD_TOWN') NOT NULL,
    city_zone_type ENUM('CENTER', 'PERIPHERY', 'COMMERCIAL_ZONE') NOT NULL,
    district VARCHAR(4) NOT NULL,
    country VARCHAR(50) NOT NULL
);

-- Tabela: package_type_table
CREATE TABLE package_type_table (
    package_type_id TINYINT AUTO_INCREMENT PRIMARY KEY,
    package_type ENUM('SIMPLE', 'MEDIUM', 'DEFAULT', 'ADVANCED') NOT NULL
);

-- Tabela: painel_table
CREATE TABLE painel_table (
    painel_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    identification VARCHAR(50) NOT NULL,
    model VARCHAR(20) NOT NULL,
    location_id BIGINT NOT NULL,
    package_type_id TINYINT NOT NULL,
    CONSTRAINT fk_painel_location FOREIGN KEY (location_id) REFERENCES location_table(location_id) ON DELETE CASCADE,
    CONSTRAINT fk_painel_package_type FOREIGN KEY (package_type_id) REFERENCES package_type_table(package_type_id) ON DELETE CASCADE
);

-- Tabela: date_time_table
CREATE TABLE date_time_table (
    period_register_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    day TINYINT NOT NULL,
    day_week ENUM('MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN') NOT NULL,
    hour TINYINT NOT NULL,
    minute TINYINT NOT NULL,
    period_of_the_day ENUM('MORN', 'AFTER', 'EVEN', 'NIGHT', 'MIDD', 'CRKD', 'SUNR', 'TWIL', 'DUSK', 'SUNS', 'LTNIG', 'MIDNG') NOT NULL,
    month ENUM('JAN', 'FEB', 'MAR', 'APR', 'MAY', 'JUN', 'JUL', 'AUG', 'SEP', 'OCT', 'NOV', 'DEC') NOT NULL,
    year VARCHAR(4) NOT NULL
);

-- Tabela: reaction_table
CREATE TABLE reaction_table (
    reaction_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    reaction_type ENUM('NEGATIVE', 'NEUTRAL', 'POSITIVE') NOT NULL,
    reaction_scale TINYINT NOT NULL,
    period_time_id BIGINT NOT NULL,
    advertising_id BIGINT NOT NULL,
    location_id BIGINT NOT NULL,
    painel_id BIGINT NOT NULL,
    CONSTRAINT fk_reaction_period FOREIGN KEY (period_time_id) REFERENCES date_time_table(period_register_id) ON DELETE CASCADE,
    CONSTRAINT fk_reaction_advertising FOREIGN KEY (advertising_id) REFERENCES advertising_table(advertising_id) ON DELETE CASCADE,
    CONSTRAINT fk_reaction_location FOREIGN KEY (location_id) REFERENCES location_table(location_id) ON DELETE CASCADE,
    CONSTRAINT fk_reaction_painel FOREIGN KEY (painel_id) REFERENCES painel_table(painel_id) ON DELETE CASCADE
);

-- Tabela: attention_table
CREATE TABLE attention_table (
    attention_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    attention_level ENUM('HIGH', 'MEDIUM', 'LOW', 'CRITICAL', 'URGENT', 'NORMAL', 'MINIMAL', 'SIGNIFICANT', 'IMPORTANT', 'ESSENTIAL') NOT NULL,
    attention_value TINYINT NOT NULL,
    look_count SMALLINT NOT NULL,
    people_count SMALLINT NOT NULL,
    people_sex ENUM('MALE', 'FEMALE', 'NON_DEFINED') NOT NULL,
    attention_time_id BIGINT NOT NULL,
    location_id BIGINT NOT NULL,
    advertising_id BIGINT NOT NULL,
    painel_id BIGINT NOT NULL,
    CONSTRAINT fk_attention_period FOREIGN KEY (attention_time_id) REFERENCES date_time_table(period_register_id) ON DELETE CASCADE,
    CONSTRAINT fk_attention_location FOREIGN KEY (location_id) REFERENCES location_table(location_id) ON DELETE CASCADE,
    CONSTRAINT fk_attention_advertising FOREIGN KEY (advertising_id) REFERENCES advertising_table(advertising_id) ON DELETE CASCADE,
    CONSTRAINT fk_attention_painel FOREIGN KEY (painel_id) REFERENCES painel_table(painel_id) ON DELETE CASCADE
);
