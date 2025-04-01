CREATE TABLE request (
    id INTEGER PRIMARY KEY,
    request_number VARCHAR(100) NOT NULL,
    descirption VARCHAR(100) NOT NULL,
    status VARCHAR(20) NOT NULL CHECK ( status IN ('PENDENTE', 'EM_ANDAMENTO', 'CANCLEADO', 'ENCERRADO') ),
    customer_id INTEGER REFERENCES customer(id),
    employee_id INTEGER REFERENCES employee(user_id),
    route_id INTEGER REFERENCES route(id),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    ended_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)