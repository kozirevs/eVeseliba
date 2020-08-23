create TABLE IF NOT EXISTS user (
    user_pk BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    address VARCHAR(250) NOT NULL,
    email VARCHAR(100) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    password_hash VARCHAR(250) NOT NULL,
    user_type VARCHAR(255) NOT NULL,
    home_doctor_pk BIGINT NOT NULL,
    CONSTRAINT fk_user_home_doctor FOREIGN KEY (home_doctor_pk) REFERENCES home_doctor (home_doctor_pk)
);
