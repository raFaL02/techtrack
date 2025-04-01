CREATE TABLE location (
    id INTEGER PRIMARY KEY,
    employee_id INTEGER REFERENCES employee(user_id),
    latitude DOUBLE PRECISION NOT NULL,
    longitude DOUBLE PRECISION NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)