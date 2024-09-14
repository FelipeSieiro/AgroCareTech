CREATE TABLE t_agrocare_veterinario (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    especializacao_veterinario VARCHAR(255),
    cmrv VARCHAR(50) NOT NULL,
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES t_agrocare_users(id)
);


INSERT INTO t_agrocare_veterinario (especializacao_veterinario, cmrv, user_id)
VALUES
    ('Cirurgia de Grandes Animais', 'CMRV12345', 2),
    ('Medicina Veterinária Geral', 'CMRV54321', 4),
    ('Medicina Interna', 'CMRV67890', 7),
    ('Oftalmologia Veterinária', 'CMRV09876', 9);