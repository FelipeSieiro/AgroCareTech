CREATE TABLE IF NOT EXISTS t_agrocare_agropecuarista (
    id BIGINT NOT NULL AUTO_INCREMENT,
    user_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES t_agrocare_users(id)
    );

INSERT INTO t_agrocare_agropecuarista (user_id)
VALUES
    (1), (3), (5), (6), (8), (10);