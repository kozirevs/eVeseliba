CREATE TABLE IF NOT EXISTS receipt (
    receipt_pk BIGINT AUTO_INCREMENT PRIMARY KEY,
    content VARCHAR(255) NOT NULL,
    is_active BOOLEAN NOT NULL,
    date_from TIMESTAMP NOT NULL,
    date_to TIMESTAMP NOT NULL,
    doctor_user_pk BIGINT NOT NULL,
    patient_user_pk BIGINT NOT NULL,
);

INSERT INTO receipt (content, is_active, date_from, date_to, doctor_user_pk, patient_user_pk) VALUES
('')