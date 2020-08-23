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
('aspirin', true, '2020-08-23T11:07:19.318+0000', '2020-09-23T11:07:19.318+0000', 2, 1),
('analgin', true, '2020-08-12T11:07:19.318+0000', '2020-09-12T11:07:19.318+0000', 2, 3),
('paracetamol', true, '2020-08-16T11:07:19.318+0000', '2020-09-16T11:07:19.318+0000', 2, 4),
('ibuprofen', false, '2020-06-23T11:07:19.318+0000', '2020-07-23T11:07:19.318+0000', 2, 5),
('antibiotic', true, '2020-08-01T11:07:19.318+0000', '2020-09-01T11:07:19.318+0000', 2, 1),
