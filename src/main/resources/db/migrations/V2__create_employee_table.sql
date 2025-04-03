CREATE TABLE employee (
    app_user_id BIGINT PRIMARY KEY REFERENCES app_user(id),
    status VARCHAR(20) NOT NULL CHECK ( status IN ('DISPONIVEL', 'EM_ROTA', 'OFFLINE') )
)