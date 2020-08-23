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
('aspirin', true, parsedatetime('23-08-2020', 'dd-MM-yyyy'), parsedatetime('23-09-2020', 'dd-MM-yyyy'), 2, 1),
('analgin', true, parsedatetime('12-08-2020', 'dd-MM-yyyy'), parsedatetime('12-09-2020', 'dd-MM-yyyy'), 2, 3),
('paracetamol', true, parsedatetime('16-08-2020', 'dd-MM-yyyy'), parsedatetime('16-09-2020', 'dd-MM-yyyy'), 2, 4),
('ibuprofen', false, parsedatetime('23-06-2020', 'dd-MM-yyyy'), parsedatetime('23-07-2020', 'dd-MM-yyyy'), 2, 5),
('antibiotic', true, parsedatetime('01-08-2020', 'dd-MM-yyyy'), parsedatetime('01-09-2020', 'dd-MM-yyyy'), 2, 1);
