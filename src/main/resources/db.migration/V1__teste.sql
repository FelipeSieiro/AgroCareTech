-- Criação das tabelas

CREATE TABLE IF NOT EXISTS t_agrocare_users (
                                                id BIGINT NOT NULL AUTO_INCREMENT,
                                                name VARCHAR(255) NOT NULL,
    phone_number VARCHAR(20) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    avatar VARCHAR(255),
    role VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
    );

CREATE TABLE IF NOT EXISTS animals (
                                       id BIGINT NOT NULL AUTO_INCREMENT,
                                       nome_animal VARCHAR(255) NOT NULL,
    idade_animal INT NOT NULL,
    peso_animal DOUBLE NOT NULL,
    url_image_animal VARCHAR(255),
    agropecuarista_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (agropecuarista_id) REFERENCES t_agrocare_users(id)
    );

CREATE TABLE IF NOT EXISTS t_agrocare_servico (
                                                  id BIGINT NOT NULL AUTO_INCREMENT,
                                                  data_servico DATE NOT NULL,
                                                  preco_servico DECIMAL(10, 2) NOT NULL,
    diagnostico VARCHAR(255) NOT NULL,
    agropecuarista_id BIGINT,
    animal_id BIGINT,
    veterinario_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (agropecuarista_id) REFERENCES t_agrocare_users(id),
    FOREIGN KEY (animal_id) REFERENCES animals(id),
    FOREIGN KEY (veterinario_id) REFERENCES t_agrocare_users(id)
    );

CREATE TABLE IF NOT EXISTS t_agrocare_veterinario (
                                                      id BIGINT NOT NULL AUTO_INCREMENT,
                                                      especializacao_veterinario VARCHAR(255),
    cmrv VARCHAR(255),
    user_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES t_agrocare_users(id)
    );

CREATE TABLE IF NOT EXISTS t_agrocare_agropecuarista (
                                                         id BIGINT NOT NULL AUTO_INCREMENT,
                                                         user_id BIGINT,
                                                         PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES t_agrocare_users(id)
    );