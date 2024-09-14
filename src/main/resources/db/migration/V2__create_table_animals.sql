CREATE TABLE IF NOT EXISTS t_agrocare_animals (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    idade INT NOT NULL,
    peso DOUBLE NOT NULL,
    url_image VARCHAR(255),
    agropecuarista_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (agropecuarista_id) REFERENCES t_agrocare_users(id)
    );