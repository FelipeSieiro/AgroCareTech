CREATE TABLE t_agrocare_servico (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    data_servico DATE NOT NULL,
    preco_servico DECIMAL(15, 2),
    diagnostico VARCHAR(255),
    agropecuarista_id BIGINT,
    animal_id BIGINT,
    veterinario_id BIGINT,
    FOREIGN KEY (agropecuarista_id) REFERENCES t_agrocare_agropecuarista(id),
    FOREIGN KEY (animal_id) REFERENCES t_agrocare_animals(id),
    FOREIGN KEY (veterinario_id) REFERENCES t_agrocare_veterinario(id)
);

