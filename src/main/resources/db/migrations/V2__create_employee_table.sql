CREATE TABLE employee (
    user_id INTEGER PRIMARY KEY REFERENCES user(id),
    status VARCHAR(20) NOT NULL CHECK ( status IN ('DISPONIVEL', 'EM_ROTA', 'OFFLINE') ),
)