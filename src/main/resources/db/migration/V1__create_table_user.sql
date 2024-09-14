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


INSERT INTO t_agrocare_users (name, phone_number, email, password, avatar, role, created_at, updated_at)
VALUES
    ('João Silva', '123456789', 'joao.silva@example.com', 'senha123', 'https://avatar.iran.liara.run/username?username=João+Silva', 'agropecuarista', NOW(), NOW()),
    ('Maria Oliveira', '987654321', 'maria.oliveira@example.com', 'senha123', 'https://avatar.iran.liara.run/username?username=Maria+Oliveira', 'veterinario', NOW(), NOW()),
    ('Carlos Souza', '234567890', 'carlos.souza@example.com', 'senha123', 'https://avatar.iran.liara.run/username?username=Carlos+Souza', 'agropecuarista', NOW(), NOW()),
    ('Ana Pereira', '876543210', 'ana.pereira@example.com', 'senha123', 'https://avatar.iran.liara.run/username?username=Ana+Pereira', 'veterinario', NOW(), NOW()),
    ('Roberto Lima', '345678901', 'roberto.lima@example.com', 'senha123', 'https://avatar.iran.liara.run/username?username=Roberto+Lima', 'agropecuarista', NOW(), NOW()),
    ('Fernanda Costa', '456789012', 'fernanda.costa@example.com', 'senha123', 'https://avatar.iran.liara.run/username?username=Fernanda+Costa', 'agropecuarista', NOW(), NOW()),
    ('Lucas Martins', '567890123', 'lucas.martins@example.com', 'senha123', 'https://avatar.iran.liara.run/username?username=Lucas+Martins', 'veterinario', NOW(), NOW()),
    ('Juliana Santos', '678901234', 'juliana.santos@example.com', 'senha123', 'https://avatar.iran.liara.run/username?username=Juliana+Santos', 'agropecuarista', NOW(), NOW()),
    ('Paulo Almeida', '789012345', 'paulo.almeida@example.com', 'senha123', 'https://avatar.iran.liara.run/username?username=Paulo+Almeida', 'veterinario', NOW(), NOW()),
    ('Tatiane Lima', '890123456', 'tatiane.lima@example.com', 'senha123', 'https://avatar.iran.liara.run/username?username=Tatiane+Lima', 'agropecuarista', NOW(), NOW());
